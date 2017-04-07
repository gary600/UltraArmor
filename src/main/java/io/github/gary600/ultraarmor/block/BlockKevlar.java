package io.github.gary600.ultraarmor.block;

import io.github.gary600.ultraarmor.UltraArmor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockKevlar extends Block {
    public BlockKevlar() {
        super(Material.IRON);
        setUnlocalizedName("blockKevlar");
        setRegistryName("blockKevlar");
        setCreativeTab(UltraArmor.getCreativeTab());
        setHardness(25f);
        setResistance(2000f);
        setHarvestLevel("pickaxe", 2);
    }
}
