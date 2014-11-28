package com.github.sdg13.makeshiftmod.init;

import com.github.sdg13.makeshiftmod.item.ItemMS;
import com.github.sdg13.makeshiftmod.item.Twig;
import com.github.sdg13.makeshiftmod.item.WoodClickCrafter;
import com.github.sdg13.makeshiftmod.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ItemMS twig = new Twig();
    public static final ItemMS woodCC = new WoodClickCrafter();

    public static void init() {
        GameRegistry.registerItem(twig, Names.Items.TWIG);
        GameRegistry.registerItem(woodCC, Names.Items.ClickCrafters.WOOD_CC);

    }
}
