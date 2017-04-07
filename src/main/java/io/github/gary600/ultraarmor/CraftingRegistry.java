package io.github.gary600.ultraarmor;

import io.github.gary600.ultraarmor.block.BlockRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRegistry {
    public static void registerCrafting() {
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
    }
}
