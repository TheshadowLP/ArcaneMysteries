package net.shadowbeast.arcanemysteries.registries;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shadowbeast.arcanemysteries.entities.boats.EntityBoat;
import net.shadowbeast.arcanemysteries.entities.boats.EntityChestBoat;
import net.shadowbeast.arcanemysteries.entities.projectile.EntityMudBall;

import static net.shadowbeast.arcanemysteries.ArcaneMysteries.MODID;
@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);
    public static final RegistryObject<EntityType<EntityMudBall>> MUDBALL_PROJECTILE =
            ENTITIES.register("mudball_projectile",
                    () -> EntityType.Builder.<EntityMudBall>of(EntityMudBall::new, MobCategory.MISC)
                            .sized(0.25f, 0.25f)
                            .clientTrackingRange(4)
                            .updateInterval(10)
                            .setCustomClientFactory((spawnEntity, level) -> new EntityMudBall(level))
                            .build("mudball_projectile"));
    public static final RegistryObject<EntityType<EntityBoat>> MOD_BOAT =
            ENTITIES.register("mod_boat", () -> EntityType.Builder.<EntityBoat>of(EntityBoat::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("mod_boat"));
    public static final RegistryObject<EntityType<EntityChestBoat>> MOD_CHEST_BOAT =
            ENTITIES.register("mod_chest_boat", () -> EntityType.Builder.<EntityChestBoat>of(EntityChestBoat::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("mod_chest_boat"));
}
