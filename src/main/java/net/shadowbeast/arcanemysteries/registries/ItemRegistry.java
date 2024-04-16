package net.shadowbeast.arcanemysteries.registries;

import net.minecraft.world.item.*;
import net.minecraftforge.registries.*;
import net.shadowbeast.arcanemysteries.enums.ArmorStats;
import net.shadowbeast.arcanemysteries.items.*;
import net.shadowbeast.arcanemysteries.items.armor.ArmorAquanium;
import net.shadowbeast.arcanemysteries.items.armor.ArmorEnderium;
import net.shadowbeast.arcanemysteries.items.armor.ArmorFirerite;
import net.shadowbeast.arcanemysteries.items.armor.ArmorSteel;

import java.util.function.Supplier;

import static net.shadowbeast.arcanemysteries.ArcaneMysteries.MODID;
public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final RegistryObject<Item>
            //MISC
            raw_silver = registerItem("raw_silver"),
            raw_platinum = registerItem("raw_platinum"),
            raw_titanium = registerItem("raw_titanium"),
            raw_luminite = registerItem("raw_luminite"),
            raw_enderium = registerItem("raw_enderium"),
            sulfur = registerItem("sulfur"),
            aquanium_ingot = registerItem("aquanium_ingot"),
            ender_ingot = registerItem("ender_ingot"),
            enderium_ingot = registerItem("enderium_ingot"),
            luminite_ingot = registerItem("luminite_ingot"),
            platinum_ingot = registerItem("platinum_ingot"),
            silver_ingot = registerItem("silver_ingot"),
            steel_ingot = registerItem("steel_ingot"),
            titanium_ingot = registerItem("titanium_ingot"),
            aluminium_ingot = registerItem("aluminium_ingot"),
            aquanium_nugget = registerItem("aquanium_nugget"),
            copper_nugget = registerItem("copper_nugget"),
            enderium_nugget = registerItem("enderium_nugget"),
            luminite_nugget = registerItem("luminite_nugget"),
            platinum_nugget = registerItem("platinum_nugget"),
            silver_nugget = registerItem("silver_nugget"),
            steel_nugget = registerItem("steel_nugget"),
            titanium_nugget = registerItem("titanium_nugget"),

            //SHARDS
            ruby = registerItem("ruby"),
            firerite_gem = registerItem("firerite_gem"),
            frozen_gem = registerItem("frozen_gem"),
            aquanium_shard = registerItem("aquanium_shard"),
            diamond_shard = registerItem("diamond_shard"),

            //TECH STUFF
            ender_arch = registerItem("ender_arch"),
            ender_arch_fragment = registerItem("ender_arch_fragment"),
            gold_stick = registerItem("gold_stick"),
            silver_stick = registerItem("silver_stick"),
            iron_plate = registerItem("iron_plate"),
            saw_blade = registerItem("saw_blade"),
            stronghold_compass = registerItem("stronghold_compass"),
            molten_sulfur_bucket = registerItem("molten_sulfur_bucket"),

            //DUSTS
            copper_dust = registerItem("copper_dust"),
            diamond_dust = registerItem("diamond_dust"),
            ender_pearl_dust = registerItem("ender_pearl_dust"),
            gold_dust = registerItem("gold_dust"),
            iron_dust = registerItem("iron_dust"),
            platinum_dust = registerItem("platinum_dust"),
            silver_dust = registerItem("silver_dust"),
            sulfur_dust = registerItem("sulfur_dust"),
            titanium_dust = registerItem("titanium_dust"),

            //ADVANCED
            heal_staff = registerItem("heal_staff", ItemHealStaff::new),
            teleportation_staff = registerItem("teleportation_staff", ItemTeleportationStaff::new),
            levitation_staff = registerItem("levitation_staff", ItemLevitationStaff::new),

            //ARMOR
            aquanium_helmet = registerItem("aquanium_helmet", () -> ArmorAquanium.getInstance(ArmorItem.Type.HELMET)),
                    aquanium_chestplate = registerItem("aquanium_chestplate", () -> ArmorAquanium.getInstance(ArmorItem.Type.CHESTPLATE)),
                    aquanium_leggings = registerItem("aquanium_leggings", () -> ArmorAquanium.getInstance(ArmorItem.Type.LEGGINGS)),
                    aquanium_boots = registerItem("aquanium_boots", () -> ArmorAquanium.getInstance(ArmorItem.Type.BOOTS)),

            enderium_helmet = registerItem("enderium_helmet", () -> ArmorEnderium.getInstance(ArmorItem.Type.HELMET)),
                    enderium_chestplate = registerItem("enderium_chestplate", () -> ArmorEnderium.getInstance(ArmorItem.Type.CHESTPLATE)),
                    enderium_leggings = registerItem("enderium_leggings", () -> ArmorEnderium.getInstance(ArmorItem.Type.LEGGINGS)),
                    enderium_boots = registerItem("enderium_boots", () -> ArmorEnderium.getInstance(ArmorItem.Type.BOOTS)),

            luminite_helmet = registerItem("luminite_helmet", () -> new ItemArmor(ArmorStats.LUMINITE, ArmorItem.Type.HELMET)),
                    luminite_chestplate = registerItem("luminite_chestplate", () -> new ItemArmor(ArmorStats.LUMINITE, ArmorItem.Type.CHESTPLATE)),
                    luminite_leggings = registerItem("luminite_leggings", () -> new ItemArmor(ArmorStats.LUMINITE, ArmorItem.Type.LEGGINGS)),
                    luminite_boots = registerItem("luminite_boots", () -> new ItemArmor(ArmorStats.LUMINITE, ArmorItem.Type.BOOTS)),

            platinum_helmet = registerItem("platinum_helmet", () -> new ItemArmor(ArmorStats.PLATINUM, ArmorItem.Type.HELMET)),
                    platinum_chestplate = registerItem("platinum_chestplate", () -> new ItemArmor(ArmorStats.PLATINUM, ArmorItem.Type.CHESTPLATE)),
                    platinum_leggings = registerItem("platinum_leggings", () -> new ItemArmor(ArmorStats.PLATINUM, ArmorItem.Type.LEGGINGS)),
                    platinum_boots = registerItem("platinum_boots", () -> new ItemArmor(ArmorStats.PLATINUM, ArmorItem.Type.BOOTS)),

            silver_helmet = registerItem("silver_helmet", () -> new ItemArmor(ArmorStats.SILVER, ArmorItem.Type.HELMET)),
                    silver_chestplate = registerItem("silver_chestplate", () -> new ItemArmor(ArmorStats.SILVER, ArmorItem.Type.CHESTPLATE)),
                    silver_leggings = registerItem("silver_leggings", () -> new ItemArmor(ArmorStats.SILVER, ArmorItem.Type.LEGGINGS)),
                    silver_boots = registerItem("silver_boots", () -> new ItemArmor(ArmorStats.SILVER, ArmorItem.Type.BOOTS)),

            steel_helmet = registerItem("steel_helmet", () -> ArmorSteel.getInstance(ArmorItem.Type.HELMET)),
                    steel_chestplate = registerItem("steel_chestplate", () -> ArmorSteel.getInstance(ArmorItem.Type.CHESTPLATE)),
                    steel_leggings = registerItem("steel_leggings", () -> ArmorSteel.getInstance(ArmorItem.Type.LEGGINGS)),
                    steel_boots = registerItem("steel_boots", () -> ArmorSteel.getInstance(ArmorItem.Type.BOOTS)),

            titanium_helmet = registerItem("titanium_helmet", () -> new ItemArmor(ArmorStats.TITANIUM, ArmorItem.Type.HELMET)),
                    titanium_chestplate = registerItem("titanium_chestplate", () -> new ItemArmor(ArmorStats.TITANIUM, ArmorItem.Type.CHESTPLATE)),
                    titanium_leggings = registerItem("titanium_leggings", () -> new ItemArmor(ArmorStats.TITANIUM, ArmorItem.Type.LEGGINGS)),
                    titanium_boots = registerItem("titanium_boots", () -> new ItemArmor(ArmorStats.TITANIUM, ArmorItem.Type.BOOTS)),

            firerite_helmet = registerItem("firerite_helmet", () -> ArmorFirerite.getInstance(ArmorItem.Type.HELMET)),
                    firerite_chestplate = registerItem("firerite_chestplate", () -> ArmorFirerite.getInstance(ArmorItem.Type.CHESTPLATE)),
                    firerite_leggings = registerItem("firerite_leggings", () -> ArmorFirerite.getInstance(ArmorItem.Type.LEGGINGS)),
                    firerite_boots = registerItem("firerite_boots", () -> ArmorFirerite.getInstance(ArmorItem.Type.BOOTS)),

            frozen_helmet = registerItem("frozen_helmet", () -> new ItemArmor(ArmorStats.FROZEN, ArmorItem.Type.HELMET)),
                    frozen_chestplate = registerItem("frozen_chestplate", () -> new ItemArmor(ArmorStats.FROZEN, ArmorItem.Type.CHESTPLATE)),
                    frozen_leggings = registerItem("frozen_leggings", () -> new ItemArmor(ArmorStats.FROZEN, ArmorItem.Type.LEGGINGS)),
                    frozen_boots = registerItem("frozen_boots", () -> new ItemArmor(ArmorStats.FROZEN, ArmorItem.Type.BOOTS)),

            copper_helmet = registerItem("copper_helmet", () -> new ItemArmor(ArmorStats.COPPER, ArmorItem.Type.HELMET)),
                    copper_chestplate = registerItem("copper_chestplate", () -> new ItemArmor(ArmorStats.COPPER, ArmorItem.Type.CHESTPLATE)),
                    copper_leggings = registerItem("copper_leggings", () -> new ItemArmor(ArmorStats.COPPER, ArmorItem.Type.LEGGINGS)),
                    copper_boots = registerItem("copper_boots", () -> new ItemArmor(ArmorStats.COPPER, ArmorItem.Type.BOOTS));



    private static RegistryObject<Item> registerItem(String registryId) {
        return ITEMS.register(registryId, ItemMod::new);
    }
    private static <T extends Item> RegistryObject<T> registerItem(String registryId, Supplier<T> item) {
        return ITEMS.register(registryId, item);
    }
}