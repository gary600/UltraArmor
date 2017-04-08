package io.github.gary600.ultraarmor.proxy;

import io.github.gary600.ultraarmor.block.BlockRegistry;
import io.github.gary600.ultraarmor.item.ItemRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ItemRegistry.createItems();
        ItemRegistry.registerItems();
        BlockRegistry.createBlocks();
        BlockRegistry.registerBlocks();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
