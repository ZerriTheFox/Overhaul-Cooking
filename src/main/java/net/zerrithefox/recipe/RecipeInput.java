package net.zerrithefox.recipe;

import net.minecraft.item.ItemStack;

public record RecipeInput(ItemStack input) implements net.minecraft.recipe.input.RecipeInput {
    @Override
    public ItemStack getStackInSlot(int slot) {
        return input;
    }

    @Override
    public int getSize() {
        return 1;
    }
}
