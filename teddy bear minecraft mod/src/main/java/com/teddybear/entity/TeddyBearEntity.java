package com.teddybear.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class TeddyBearEntity extends PathAwareEntity {

    private TeddyBearVariant variant = TeddyBearVariant.BROWN;
    private int outfitId = 0;

    public TeddyBearEntity(EntityType<? extends PathAwareEntity> type, World world) {
        super(type, world);
    }

    public void setOutfitId(int id) {
        this.outfitId = Math.max(0, Math.min(99, id));
    }

    @Override
    protected void initGoals() {}

    @Override
    public void tick() {
        super.tick();
    }
}
