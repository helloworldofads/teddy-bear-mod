package com.teddybear;

import com.teddybear.registry.ModEntities;
import net.fabricmc.api.ModInitializer;

public class TeddyBearMod implements ModInitializer {
    @Override
    public void onInitialize() {
        ModEntities.register();
        System.out.println("Teddy Bear Mod Loaded!");
    }
}
