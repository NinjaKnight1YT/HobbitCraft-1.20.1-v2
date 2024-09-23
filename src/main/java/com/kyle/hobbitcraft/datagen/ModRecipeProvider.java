package com.kyle.hobbitcraft.datagen;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.block.ModBlocks;
import com.kyle.hobbitcraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    // private static final List<ItemLike> #NAME = List.of(ModItems.ITEM.get(),
    //         ModBlocks.BLOCK.get(), ModBlocks.BLOCK.get()...);

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        // For blasting use oreBlasting(pWriter, #LIST_NAME, RecipeCategory.MISC, ModItems.ITEM.get(), experience(eg 0.25f), 100, "groupName");
        // For smelting use oreSmelting(pWriter, #LIST_NAME, RecipeCategory.MISC, ModItems.ITEM.get(), experience(eg 0.25f), 200, "groupName");

        // Dreaded ingot to block and vice versa

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DREADED_BLOCK.get())
                .pattern("...")
                .pattern("...")
                .pattern("...")
                .define('.', ModItems.DREADED_INGOT.get())
                .unlockedBy(getHasName(ModItems.DREADED_INGOT.get()), has(ModItems.DREADED_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DREADED_INGOT.get(), 9)
                .requires(ModBlocks.DREADED_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.DREADED_BLOCK.get()), has(ModBlocks.DREADED_BLOCK.get()))
                .save(pWriter);

        // Kyle ingot to block and vice versa

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.KYLE_BLOCK.get())
                .pattern("...")
                .pattern("...")
                .pattern("...")
                .define('.', ModItems.KYLE_INGOT.get())
                .unlockedBy(getHasName(ModItems.KYLE_INGOT.get()), has(ModItems.KYLE_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.KYLE_INGOT.get(), 9)
                .requires(ModBlocks.KYLE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.KYLE_BLOCK.get()), has(ModBlocks.KYLE_BLOCK.get()))
                .save(pWriter);

        // Vino ingot to block and vice versa

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.VINO_BLOCK.get())
                .pattern("...")
                .pattern("...")
                .pattern("...")
                .define('.', ModItems.VINO_INGOT.get())
                .unlockedBy(getHasName(ModItems.VINO_INGOT.get()), has(ModItems.VINO_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VINO_INGOT.get(), 9)
                .requires(ModBlocks.VINO_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.VINO_BLOCK.get()), has(ModBlocks.VINO_BLOCK.get()))
                .save(pWriter);

        // Wibkitium ingot to block and vice versa

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WIBKITIUM_BLOCK.get())
                .pattern("...")
                .pattern("...")
                .pattern("...")
                .define('.', ModItems.WIBKITIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.WIBKITIUM_INGOT.get()), has(ModItems.WIBKITIUM_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.WIBKITIUM_INGOT.get(), 9)
                .requires(ModBlocks.WIBKITIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.WIBKITIUM_BLOCK.get()), has(ModBlocks.WIBKITIUM_BLOCK  .get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  HobbitCraft.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
