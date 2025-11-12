package net.zerrithefox.recipe;

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

public record MixingRecipe(Ingredient inputItem, ItemStack output)  implements Recipe<MixingRecipeInput> {

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;

    }

    /// read in Json files -> new MixingRecipe

    @Override
    public boolean matches(MixingRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }
        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(MixingRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
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

    public static class Serializer implements RecipeSerializer<MixingRecipe> {
        public static final MapCodec<MixingRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.DISALLOW_EMPTY_CODEC.fieldOf("ingredient").forGetter(MixingRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(MixingRecipe::output))
                .apply(inst, MixingRecipe::new));

        public static final PacketCodec<RegistryByteBuf, MixingRecipe> STEAM_CODEC = PacketCodec.tuple(
                Ingredient.PACKET_CODEC, MixingRecipe::inputItem,
                ItemStack.PACKET_CODEC, MixingRecipe::output,
                MixingRecipe::new);

        @Override
        public MapCodec<MixingRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, MixingRecipe> packetCodec() {
            return STEAM_CODEC;
        }
    }
}
