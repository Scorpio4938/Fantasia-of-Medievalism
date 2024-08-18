package com.scorpio4938.fantasia;

import com.scorpio4938.fantasia.block.ModBlocks;
import com.scorpio4938.fantasia.entity.ModEntities;
import com.scorpio4938.fantasia.entity.custom.PestilenceZombieEntity;
import com.scorpio4938.fantasia.item.ModItemGroup;
import com.scorpio4938.fantasia.item.ModItems;
import com.scorpio4938.fantasia.service.event.EventHandler;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fantasia implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "fantasia";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Hello Fabric world!");
        ModItems.registerModItems();
        ModItemGroup.registerModItemGroup();
        ModBlocks.registerModBlocks();

        FabricDefaultAttributeRegistry.register(ModEntities.PESTILENCE_ZOMBIE, PestilenceZombieEntity.createPestilenceZombieAttributes()); // entity extend zombie issue of bug

        EventHandler.registerEventHandler();
    }
}