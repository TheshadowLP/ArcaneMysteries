package net.shadowbeast.arcanemysteries.events;

import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.shadowbeast.arcanemysteries.ArcaneMysteries;
import net.shadowbeast.arcanemysteries.client.ModelLayers;

@Mod.EventBusSubscriber(modid = ArcaneMysteries.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModelLayers.FROZEN_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModelLayers.FROZEN_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
    }
}
