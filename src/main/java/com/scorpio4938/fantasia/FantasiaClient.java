package com.scorpio4938.fantasia;

import com.scorpio4938.fantasia.entity.ModEntities;
import com.scorpio4938.fantasia.entity.client.ModModelLayers;
import com.scorpio4938.fantasia.entity.client.PestilenceZombieModel;
import com.scorpio4938.fantasia.entity.client.PestilenceZombieRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class FantasiaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PESTILENCEZOMBIE, PestilenceZombieModel::getTexturedModelData); // entity extend zombie issue of bug
        EntityRendererRegistry.register(ModEntities.PESTILENCEZOMBIE, PestilenceZombieRenderer::new); // entity extend zombie issue of bug
    }
}
