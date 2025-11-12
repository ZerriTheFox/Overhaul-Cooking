package net.zerrithefox.recipe;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zerrithefox.overhaulcooking.OverhaulCooking;

public class ModRecipes {
    public static final RecipeSerializer<MixingRecipe> MIXING_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(OverhaulCooking.MOD_ID, "mixing"),
                    new MixingRecipe.Serializer());
    public static final RecipeType<MixingRecipe> MIXING_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(OverhaulCooking.MOD_ID, "mixing"), new RecipeType<MixingRecipe>() {
            @Override
            public String toString() {
                return "mixing";
            }
    });

    public static final RecipeSerializer<BakingRecipe> BAKING_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(OverhaulCooking.MOD_ID, "baking"),
                    new BakingRecipe.Serializer());
    public static final RecipeType<BakingRecipe> BAKING_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(OverhaulCooking.MOD_ID, "baking"), new RecipeType<BakingRecipe>() {
            @Override
            public String toString() {
                return "baking";
            }
    });

    public static final RecipeSerializer<FryingRecipe> FRYING_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(OverhaulCooking.MOD_ID, "frying"),
                    new FryingRecipe.Serializer());
    public static final RecipeType<FryingRecipe> FRYING_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(OverhaulCooking.MOD_ID, "frying"), new RecipeType<FryingRecipe>() {
            @Override
            public String toString() {
                return "frying";
            }
    });

    public static void registerRecipes(){
        OverhaulCooking.LOGGER.info("Registering Custom Recipes for " + OverhaulCooking.MOD_ID);
    }
}
