package com.scorpio4938.fantasia.entity;

import com.scorpio4938.fantasia.Fantasia;
import com.scorpio4938.fantasia.entity.custom.PestilenceZombieEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.HuskEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<PestilenceZombieEntity> PestilenceZombie = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Fantasia.MOD_ID, "PestilenceZombie"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, PestilenceZombieEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());
}
