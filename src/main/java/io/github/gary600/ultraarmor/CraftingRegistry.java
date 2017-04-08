package io.github.gary600.ultraarmor;

import io.github.gary600.ultraarmor.block.BlockRegistry;
import io.github.gary600.ultraarmor.item.ItemRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRegistry {
    public static void registerCrafting() {
        // BLOCKS
        GameRegistry.addShapedRecipe(
                new ItemStack(BlockRegistry.blockKevlar),
                "GDG",
                "RDL",
                "GDG",
                "G", Blocks.GLASS,
                "D", Items.DIAMOND,
                "L", new ItemStack(Items.DYE, 1, 4), // Lapis Lazuli
                "R", Items.REDSTONE
                );
        // ITEMS
        GameRegistry.addShapedRecipe(
                new ItemStack(ItemRegistry.itemBattery),
                "GGG",
                "RLR",
                "GGG",
                "G", Items.GOLD_INGOT,
                "R", Items.REDSTONE,
                "L", new ItemStack(Items.DYE, 1, 4) // Lapis Lazuli
        );
    }
}
