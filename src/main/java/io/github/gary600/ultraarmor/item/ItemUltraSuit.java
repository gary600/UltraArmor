package io.github.gary600.ultraarmor.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemUltraSuit extends ItemArmor {

    public ItemUltraSuit(EntityEquipmentSlot slot) {
        super(ItemRegistry.armorMaterial, 1, slot);
        setUnlocalizedName("itemUltraSuit");
    }
}
