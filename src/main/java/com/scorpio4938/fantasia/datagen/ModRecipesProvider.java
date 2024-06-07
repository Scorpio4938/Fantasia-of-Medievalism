package com.scorpio4938.fantasia.datagen;

import com.scorpio4938.fantasia.block.ModBlocks;
import com.scorpio4938.fantasia.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.GOLD_NUGGET, 4)
                .input(ModItems.WIT_COIN, 1)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WIT_COIN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CITY_CENTER_BLOCK, 1)
                .pattern("IBI")
                .pattern("T#W")
                .pattern("ILI")
                .input('I', Items.IRON_INGOT)
                .input('B', Items.BOOKSHELF)
                .input('T', Items.IRON_SHOVEL)
                .input('#', Items.CRAFTING_TABLE)
                .input('W', Items.IRON_AXE)
                .input('L', ItemTags.LOGS)
                .criterion(hasItem(Items.CRAFTING_TABLE), conditionsFromItem(Items.CRAFTING_TABLE))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CITY_CENTER_BLOCK)));
    }
}
