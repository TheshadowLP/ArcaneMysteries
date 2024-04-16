package net.shadowbeast.arcanemysteries.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static net.shadowbeast.arcanemysteries.ArcaneMysteries.MODID;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = MODID)
public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final RegistryObject<CreativeModeTab> MISC = TAB.register("misc", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.arcanemysteries.misc")).icon(() -> new ItemStack(ItemRegistry.aquanium_nugget.get())).displayItems((pParameters, pOutput) -> {
        pOutput.accept(ItemRegistry.raw_silver.get());
        pOutput.accept(ItemRegistry.raw_platinum.get());
        pOutput.accept(ItemRegistry.raw_titanium.get());
        pOutput.accept(ItemRegistry.raw_luminite.get());
        pOutput.accept(ItemRegistry.raw_enderium.get());
        pOutput.accept(ItemRegistry.sulfur.get());

        pOutput.accept(ItemRegistry.silver_nugget.get());
        pOutput.accept(ItemRegistry.platinum_nugget.get());
        pOutput.accept(ItemRegistry.titanium_nugget.get());
        pOutput.accept(ItemRegistry.luminite_nugget.get());
        pOutput.accept(ItemRegistry.enderium_nugget.get());
        pOutput.accept(ItemRegistry.aquanium_nugget.get());
        pOutput.accept(ItemRegistry.steel_nugget.get());
        pOutput.accept(ItemRegistry.copper_nugget.get());

        pOutput.accept(ItemRegistry.silver_ingot.get());
        pOutput.accept(ItemRegistry.platinum_ingot.get());
        pOutput.accept(ItemRegistry.titanium_ingot.get());
        pOutput.accept(ItemRegistry.luminite_ingot.get());
        pOutput.accept(ItemRegistry.enderium_ingot.get());
        pOutput.accept(ItemRegistry.aquanium_ingot.get());
        pOutput.accept(ItemRegistry.steel_ingot.get());
        pOutput.accept(ItemRegistry.ender_ingot.get());
        pOutput.accept(ItemRegistry.aluminium_ingot.get());

        pOutput.accept(ItemRegistry.ruby.get());
        pOutput.accept(ItemRegistry.frozen_gem.get());
        pOutput.accept(ItemRegistry.firerite_gem.get());

        pOutput.accept(ItemRegistry.aquanium_shard.get());
        pOutput.accept(ItemRegistry.diamond_shard.get());

        pOutput.accept(ItemRegistry.heal_staff.get());
        pOutput.accept(ItemRegistry.teleportation_staff.get());
        pOutput.accept(ItemRegistry.levitation_staff.get());

        pOutput.accept(ItemRegistry.steel_helmet.get());
        pOutput.accept(ItemRegistry.copper_helmet.get());
    }).build());


}
