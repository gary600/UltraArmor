package io.github.gary600.ultraarmor.item;

import io.github.gary600.ultraarmor.UltraArmor;
import net.minecraft.item.Item;

public class ItemBattery extends Item {
    public ItemBattery() {
        setUnlocalizedName("itemBattery");
        setRegistryName("itemBattery");
        setCreativeTab(UltraArmor.getCreativeTab());
    }
}
