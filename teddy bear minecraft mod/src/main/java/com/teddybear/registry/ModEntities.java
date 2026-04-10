package com.teddybear.registry;

import com.teddybear.entity.TeddyBearEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<TeddyBearEntity> TEDDY_BEAR =
        Registry.register(Registries.ENTITY_TYPE,
            new Identifier("teddybear", "teddy_bear"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TeddyBearEntity::new)
                .dimensions(EntityDimensions.fixed(0.6f, 1.0f))
                .build()
        );

    public static void register() {}
}
