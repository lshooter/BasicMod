package com.lshooter.basicmod.creativetab;

import com.lshooter.basicmod.init.ModItems;
import com.lshooter.basicmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBM
{
    public static final CreativeTabs BM_Tab = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Basic Mod";
        }
    };
}
