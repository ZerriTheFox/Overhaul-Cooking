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

public record BakingRecipe(Ingredient inputItem, ItemStack output)  implements Recipe<BakingRecipeInput> {

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;

    }

    /// read in Json files -> new BakingRecipe

    @Override
    public boolean matches(BakingRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }
        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(BakingRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
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

    public static class Serializer implements RecipeSerializer<BakingRecipe> {
        public static final MapCodec<BakingRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.DISALLOW_EMPTY_CODEC.fieldOf("ingredient").forGetter(BakingRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(BakingRecipe::output))
                .apply(inst, BakingRecipe::new));

        public static final PacketCodec<RegistryByteBuf, BakingRecipe> STEAM_CODEC = PacketCodec.tuple(
                Ingredient.PACKET_CODEC, BakingRecipe::inputItem,
                ItemStack.PACKET_CODEC, BakingRecipe::output,
                BakingRecipe::new);

        @Override
        public MapCodec<BakingRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, BakingRecipe> packetCodec() {
            return STEAM_CODEC;
        }
    }
}
