package com.github.sdg13.makeshiftmod;

import com.github.sdg13.makeshiftmod.init.ModItems;
import com.github.sdg13.makeshiftmod.reference.Reference;
import com.github.sdg13.makeshiftmod.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class MakeshiftMod {

    @Mod.Instance(Reference.MOD_ID)
    public static MakeshiftMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        ModItems.init();

        LogHelper.info("Pre Initialization Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {


        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {


        LogHelper.info("Post Initialization Complete");
    }
}
