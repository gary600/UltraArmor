package io.github.gary600.ultraarmor.block;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRegistry {
    public static Block blockKevlar;

    public static void createBlocks() {
        blockKevlar = new BlockKevlar();
    }

    public static void registerBlocks() {
        GameRegistry.registerBlock(blockKevlar);
    }

    private static void registerBlockRender(Block block, int meta, ModelResourceLocation loc) {
        ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
        mesher.register(Item.getItemFromBlock(block), meta, loc);
    }

    public static void registerBlockRenders() {
        registerBlockRender(blockKevlar, 0, new ModelResourceLocation("ultraarmor:blockKevlar"));
    }
}
