package com.scorpio4938.fantasia.entity.client;

import com.scorpio4938.fantasia.Fantasia;
import com.scorpio4938.fantasia.entity.custom.PestilenceZombieEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.ZombieEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.Identifier;

public class PestilenceZombieRenderer extends MobEntityRenderer<PestilenceZombieEntity, PestilenceZombieModel<PestilenceZombieEntity>> {
    private static final Identifier TEXTURE = new Identifier(Fantasia.MOD_ID, "textures/entity/pestilence_zombie.png");

    public PestilenceZombieRenderer(EntityRendererFactory.Context context) {
        super(context, new PestilenceZombieModel<>(context.getPart(ModModelLayers.PESTILENCEZOMBIE)), 0.5f);
    }

    @Override
    public Identifier getTexture(PestilenceZombieEntity entity) {
        return TEXTURE;
    }

//    @Override
//    public void render(PestilenceZombieEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
//        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
//    }

    @Override
    public void render(PestilenceZombieEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if (mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
