package net.zerrithefox.recipe;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zerrithefox.overhaulcooking.OverhaulCooking;
import net.zerrithefox.recipe.bake.BakeRecipe;
import net.zerrithefox.recipe.boil.BoilRecipe;
import net.zerrithefox.recipe.crush.CrushRecipe;
import net.zerrithefox.recipe.drain.DrainRecipe;
import net.zerrithefox.recipe.ferment.FermentRecipe;
import net.zerrithefox.recipe.fry.FryRecipe;
import net.zerrithefox.recipe.grind.GrindRecipe;
import net.zerrithefox.recipe.juice.JuiceRecipe;
import net.zerrithefox.recipe.knife.KnifeRecipe;
import net.zerrithefox.recipe.mix.MixRecipe;
import net.zerrithefox.recipe.press.PressRecipe;
import net.zerrithefox.recipe.roll.RollRecipe;
import net.zerrithefox.recipe.whisk.WhiskRecipe;

public class ModRecipes {

    public static final RecipeSerializer<MixRecipe> MIXING_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(OverhaulCooking.MOD_ID, "mixing"),
                    new MixRecipe.Serializer());
    public static final RecipeType<MixRecipe> MIXING_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(OverhaulCooking.MOD_ID, "mixing"), new RecipeType<MixRecipe>() {
                @Override
                public String toString() {
                    return "mixing";
                }
            });

    public static final RecipeSerializer<BakeRecipe> BAKING_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(OverhaulCooking.MOD_ID, "baking"),
                    new BakeRecipe.Serializer());
    public static final RecipeType<BakeRecipe> BAKING_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(OverhaulCooking.MOD_ID, "baking"), new RecipeType<BakeRecipe>() {
                @Override
                public String toString() {
                    return "baking";
                }
            });

    public static final RecipeSerializer<FryRecipe> FRYING_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(OverhaulCooking.MOD_ID, "frying"),
                    new FryRecipe.Serializer());
    public static final RecipeType<FryRecipe> FRYING_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(OverhaulCooking.MOD_ID, "frying"), new RecipeType<FryRecipe>() {
                @Override
                public String toString() {
                    return "frying";
                }
            });

    public static final RecipeSerializer<WhiskRecipe> WHISK_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(OverhaulCooking.MOD_ID, "whisk"),
                    new WhiskRecipe.Serializer());
    public static final RecipeType<WhiskRecipe> WHISK_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(OverhaulCooking.MOD_ID, "whisk"), new RecipeType<WhiskRecipe>() {
                @Override
                public String toString() {
                    return "whisk";
                }
            });

    public static final RecipeSerializer<KnifeRecipe> KNIFE_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(OverhaulCooking.MOD_ID, "knife"),
                    new KnifeRecipe.Serializer());
    public static final RecipeType<KnifeRecipe> KNIFE_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(OverhaulCooking.MOD_ID, "knife"), new RecipeType<KnifeRecipe>() {
                @Override
                public String toString() {
                    return "knife";
                }
            });

    public static final RecipeSerializer<RollRecipe> ROLL_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(OverhaulCooking.MOD_ID, "roll"),
                    new RollRecipe.Serializer());
    public static final RecipeType<RollRecipe> ROLL_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(OverhaulCooking.MOD_ID, "roll"), new RecipeType<RollRecipe>() {
                @Override
                public String toString() {
                    return "roll";
                }
            });

    public static final RecipeSerializer<CrushRecipe> CRUSH_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(OverhaulCooking.MOD_ID, "crush"),
            new CrushRecipe.Serializer());
    public static final RecipeType<CrushRecipe> CRUSH_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(OverhaulCooking.MOD_ID, "crush"), new RecipeType<CrushRecipe>() {
                @Override
                public String toString() {
                    return "crush";
                }
            });

    public static final RecipeSerializer<DrainRecipe> DRAIN_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(OverhaulCooking.MOD_ID, "drain"),
            new DrainRecipe.Serializer());
    public static final RecipeType<DrainRecipe> DRAIN_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(OverhaulCooking.MOD_ID, "drain"), new RecipeType<DrainRecipe>() {
                @Override
                public String toString() {
                    return "drain";
                }
            });

    public static final RecipeSerializer<BoilRecipe> BOIL_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(OverhaulCooking.MOD_ID, "boil"),
            new BoilRecipe.Serializer());
    public static final RecipeType<BoilRecipe> BOIL_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(OverhaulCooking.MOD_ID, "boil"), new RecipeType<BoilRecipe>() {
                @Override
                public String toString() {
                    return "boil";
                }
            });

    public static final RecipeSerializer<JuiceRecipe> JUICE_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(OverhaulCooking.MOD_ID, "juice"),
            new JuiceRecipe.Serializer());
    public static final RecipeType<JuiceRecipe> JUICE_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(OverhaulCooking.MOD_ID, "juice"), new RecipeType<JuiceRecipe>() {
                @Override
                public String toString() {
                    return "juice";
                }
            });

    public static final RecipeSerializer<FermentRecipe> FERMENT_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(OverhaulCooking.MOD_ID, "ferment"),
            new FermentRecipe.Serializer());
    public static final RecipeType<FermentRecipe> FERMENT_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(OverhaulCooking.MOD_ID, "ferment"), new RecipeType<FermentRecipe>() {
                @Override
                public String toString() {
                    return "ferment";
                }
            });

    public static final RecipeSerializer<GrindRecipe> GRIND_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(OverhaulCooking.MOD_ID, "grind"),
            new GrindRecipe.Serializer());
    public static final RecipeType<GrindRecipe> GRIND_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(OverhaulCooking.MOD_ID, "grind"), new RecipeType<GrindRecipe>() {
                @Override
                public String toString() {
                    return "grind";
                }
            });

    public static final RecipeSerializer<PressRecipe> PRESS_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(OverhaulCooking.MOD_ID, "press"),
            new PressRecipe.Serializer());
    public static final RecipeType<PressRecipe> PRESS_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(OverhaulCooking.MOD_ID, "press"), new RecipeType<PressRecipe>() {
                @Override
                public String toString() {
                    return "press";
                }
            });

    public static void registerRecipes(){
        OverhaulCooking.LOGGER.info("Registering Custom Recipes for " + OverhaulCooking.MOD_ID);
    }
}
