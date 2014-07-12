package com.lshooter.basicmod.init;

import com.lshooter.basicmod.block.BlockBM;
import com.lshooter.basicmod.block.BlockFlag;
import com.lshooter.basicmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockBM flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
