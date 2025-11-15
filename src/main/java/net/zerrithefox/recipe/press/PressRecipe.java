package net.zerrithefox.recipe.press;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;
import net.zerrithefox.recipe.RecipeInput;

public record PressRecipe(Ingredient inputItem, ItemStack output)  implements Recipe<RecipeInput> {

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;

    }

    /// read in Json files -> new MixRecipe

    @Override
    public boolean matches(RecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }
        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(RecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResult(RegistryWrapper.WrapperLookup registriesLookup) {
        return output;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return null;
    }

    @Override
    public RecipeType<?> getType() {
        return null;
    }

    public static class Serializer implements RecipeSerializer<PressRecipe> {
        public static final MapCodec<PressRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.DISALLOW_EMPTY_CODEC.fieldOf("ingredient").forGetter(PressRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(PressRecipe::output))
                .apply(inst, PressRecipe::new));

        public static final PacketCodec<RegistryByteBuf, PressRecipe> STEAM_CODEC = PacketCodec.tuple(
                Ingredient.PACKET_CODEC, PressRecipe::inputItem,
                ItemStack.PACKET_CODEC, PressRecipe::output,
                PressRecipe::new);

        @Override
        public MapCodec<PressRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, PressRecipe> packetCodec() {
            return STEAM_CODEC;
        }
    }
}
