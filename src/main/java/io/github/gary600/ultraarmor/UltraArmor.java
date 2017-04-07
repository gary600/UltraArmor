package io.github.gary600.ultraarmor;

import io.github.gary600.ultraarmor.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = UltraArmor.MODID, version = UltraArmor.VERSION)
public class UltraArmor
{
    public static final String MODID = "ultraarmor";
    public static final String VERSION = "0.1";

    @SidedProxy(clientSide="io.github.gary600.ultraarmor.proxy.ClientProxy", serverSide="io.github.gary600.ultraarmor.proxy.ServerProxy")
    public static CommonProxy proxy;

    private static CreativeTabs creativeTab = new CreativeTabs("ultraArmor") {
        @Override
        public Item getTabIconItem() {
            return Items.DIAMOND;
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    public static CreativeTabs getCreativeTab() {
        return creativeTab;
    }
}
