package com.lshooter.basicmod.init;

import com.lshooter.basicmod.item.ItemBM;
import com.lshooter.basicmod.item.ItemMapleLeaf;
import com.lshooter.basicmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemBM mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
