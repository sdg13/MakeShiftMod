package com.github.sdg13.makeshiftmod.item;

import com.github.sdg13.makeshiftmod.init.ModCreativeTabs;
import com.github.sdg13.makeshiftmod.utility.ResourceStringHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMS extends Item {


    public ItemMS() {
        super();
        setCreativeTab(ModCreativeTabs.MS_ITEM_TAB);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
        itemIcon = register.registerIcon(ResourceStringHelper.stripType(getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName() {
        return ResourceStringHelper.constructUnlocalizedName("item", getStrippedName());
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return getUnlocalizedName();
    }

    protected String getStrippedName() {
        return ResourceStringHelper.stripType(super.getUnlocalizedName());
    }
}
