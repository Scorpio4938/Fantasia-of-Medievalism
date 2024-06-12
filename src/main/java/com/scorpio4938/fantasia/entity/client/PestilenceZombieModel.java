package com.scorpio4938.fantasia.entity.client;

import com.scorpio4938.fantasia.entity.custom.PestilenceZombieEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
// Note. The model parts (folders in Blockbench) from Blockbench could create issues which minecraft client cannot read this model
public class PestilenceZombieModel<T extends PestilenceZombieEntity> extends SinglePartEntityModel<T> {
    private final ModelPart pestilence_zombie;

    public PestilenceZombieModel(ModelPart root) {
        this.pestilence_zombie = root.getChild("pestilence_zombie");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData pestilence_zombie = modelPartData.addChild("pestilence_zombie", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData body = pestilence_zombie.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData torso = body.addChild("torso", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData head = torso.addChild("head", ModelPartBuilder.create().uv(0, 16).cuboid(0.0F, -32.0F, -4.0F, 4.0F, 8.0F, 7.0F, new Dilation(0.0F))
                .uv(0, 31).cuboid(-4.0F, -31.0F, -4.0F, 1.0F, 7.0F, 7.0F, new Dilation(0.0F))
                .uv(0, 45).cuboid(-3.0F, -29.0F, -4.0F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F))
                .uv(24, 0).cuboid(-3.0F, -32.0F, -4.0F, 3.0F, 3.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData bone = torso.addChild("bone", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F))
                .uv(34, 29).cuboid(-4.0F, -22.0F, 2.0F, 8.0F, 8.0F, 2.0F, new Dilation(0.0F))
                .uv(44, 6).cuboid(-1.0F, -14.0F, 2.0F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData right_arm = body.addChild("right_arm", ModelPartBuilder.create().uv(34, 39).cuboid(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -22.0F, 0.0F, -1.3963F, -0.0873F, 0.0F));

        ModelPartData left_arm = body.addChild("left_arm", ModelPartBuilder.create().uv(22, 12).cuboid(-1.0F, -3.0F, -2.0F, 4.0F, 13.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -22.0F, 0.0F, -1.309F, 0.0873F, 0.0F));

        ModelPartData right_leg = body.addChild("right_leg", ModelPartBuilder.create().uv(38, 10).cuboid(-2.0F, 0.0F, -2.0F, 3.0F, 12.0F, 4.0F, new Dilation(0.0F))
                .uv(14, 45).cuboid(1.0F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-1.9F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

        ModelPartData left_leg = body.addChild("left_leg", ModelPartBuilder.create().uv(18, 29).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
                .uv(37, 0).cuboid(-2.0F, 11.0F, -3.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(1.9F, -12.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(PestilenceZombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        pestilence_zombie.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return this.pestilence_zombie;
    }
}