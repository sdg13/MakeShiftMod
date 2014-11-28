package com.github.sdg13.makeshiftmod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ClickCrafter extends ItemMS {

    public ClickCrafter() {
        super();

    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        // ToDo:
        //      check if internal storage has item
        //          (faux item stuff, does it need to move into another class?)
        //      if it does:
        //          use item
        //          return
        //      check if recipe set
        //      if set:
        //          check if input resources available
        //              (how it finds resources may recurse, check for loops)
        //          if so: craft
        //          else: fail
        //      else:
        //          initGui
        


        return stack;
    }

}
