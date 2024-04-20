package net.shadowbeast.arcanemysteries;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.shadowbeast.arcanemysteries.client.BoatModRenderer;
import net.shadowbeast.arcanemysteries.items.ItemModProperties;
import net.shadowbeast.arcanemysteries.registries.CreativeTabRegistry;
import net.shadowbeast.arcanemysteries.registries.EntityRegistry;
import net.shadowbeast.arcanemysteries.registries.ItemRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ArcaneMysteries.MODID)
public class ArcaneMysteries {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "arcanemysteries";
    public ArcaneMysteries() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemRegistry.ITEMS.register(bus);
        EntityRegistry.ENTITIES.register(bus);
        CreativeTabRegistry.TAB.register(bus);


        bus.addListener(this::commonSetup);
        bus.addListener(this::addCreative);
        MinecraftForge.EVENT_BUS.register(this);

    }
    private void commonSetup(final FMLCommonSetupEvent event) {}
    private void addCreative(BuildCreativeModeTabContentsEvent event) {}
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
        @SubscribeEvent
        public static void registerRenderers(FMLClientSetupEvent event) {
            ItemModProperties.addCustomItemProperties();
            EntityRenderers.register(EntityRegistry.MUDBALL_PROJECTILE.get(), ThrownItemRenderer::new);
            EntityRenderers.register(EntityRegistry.MOD_BOAT.get(), pContext -> new BoatModRenderer(pContext, false));
            EntityRenderers.register(EntityRegistry.MOD_CHEST_BOAT.get(), pContext -> new BoatModRenderer(pContext, true));
        }
    }
}