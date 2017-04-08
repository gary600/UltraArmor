package io.github.gary600.ultraarmor.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRegistry {
    public static ItemArmor.ArmorMaterial armorMaterial = EnumHelper.addArmorMaterial(
            "itemUltraHelm",
            "ultraarmor:itemUltraHelm",
            33,
            new int[]{3, 8, 6, 3},
            25,
            new SoundEvent(new ResourceLocation("minecraft:item.armor.equip_gold")),
            10
    );

    public static Item itemBattery;
    public static Item itemUltraSuitHelm;
    public static Item itemUltraSuitChest;
    public static Item itemUltraSuitLegs;
    public static Item itemUltraSuitBoots;

    public static void createItems() {
        itemBattery = new ItemBattery();
        itemUltraSuitHelm = new ItemUltraSuit(EntityEquipmentSlot.HEAD);
        itemUltraSuitHelm.setUnlocalizedName("itemUltraSuitHelm");
        itemUltraSuitHelm.setRegistryName("itemUltraSuitHelm");
        itemUltraSuitChest = new ItemUltraSuit(EntityEquipmentSlot.CHEST);
        itemUltraSuitChest.setUnlocalizedName("itemUltraSuitChest");
        itemUltraSuitChest.setRegistryName("itemUltraSuitChest");
        itemUltraSuitLegs = new ItemUltraSuit(EntityEquipmentSlot.LEGS);
        itemUltraSuitLegs.setUnlocalizedName("itemUltraSuitLegs");
        itemUltraSuitLegs.setRegistryName("itemUltraSuitLegs");
        itemUltraSuitBoots = new ItemUltraSuit(EntityEquipmentSlot.FEET);
        itemUltraSuitBoots.setUnlocalizedName("itemUltraSuitBoots");
        itemUltraSuitBoots.setRegistryName("itemUltraSuitBoots");
    }

    public static void registerItems() {
        GameRegistry.registerItem(itemBattery);
        GameRegistry.registerItem(itemUltraSuitHelm);
        GameRegistry.registerItem(itemUltraSuitChest);
        GameRegistry.registerItem(itemUltraSuitLegs);
        GameRegistry.registerItem(itemUltraSuitBoots);
    }
}
