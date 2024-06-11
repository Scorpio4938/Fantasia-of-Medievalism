package com.scorpio4938.fantasia.entity.client;

import com.scorpio4938.fantasia.entity.custom.PestilenceZombieEntity;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.ZombieEntityModel;

public class PestilenceZombieModel<T extends PestilenceZombieEntity> extends ZombieEntityModel<T> {
    public PestilenceZombieModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        return TexturedModelData.of(modelData, 64, 64);
    }
}
