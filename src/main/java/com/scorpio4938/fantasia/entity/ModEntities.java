package com.scorpio4938.fantasia.entity;

import com.scorpio4938.fantasia.Fantasia;
import com.scorpio4938.fantasia.entity.custom.PestilenceZombieEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<PestilenceZombieEntity> PESTILENCEZOMBIE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Fantasia.MOD_ID, "pestilence_zombie"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PestilenceZombieEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());
}
