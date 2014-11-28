package com.github.sdg13.makeshiftmod.init;

import com.github.sdg13.makeshiftmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModCreativeTabs {

    public static final CreativeTabs MS_ITEM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() { return ModItems.twig; }
    };
}
