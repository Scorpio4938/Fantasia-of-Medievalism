package com.scorpio4938.fantasia.datagen;

import com.scorpio4938.fantasia.block.ModBlocks;
import com.scorpio4938.fantasia.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureMap;
import net.minecraft.item.Items;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.CITY_CENTER_BLOCK, Blocks.OAK_PLANKS, TextureMap::frontSideWithCustomBottom);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WIT_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MASLIN_BREAD, Models.GENERATED);
    }
}
