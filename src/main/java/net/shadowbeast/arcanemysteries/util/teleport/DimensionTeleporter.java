package net.shadowbeast.arcanemysteries.util.teleport;

import net.minecraft.core.*;
import net.minecraft.server.level.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.level.portal.*;

import java.util.Objects;
import java.util.function.*;
public class DimensionTeleporter extends PortalForcer {
    BlockPos pos;
    public DimensionTeleporter (ServerLevel world) {
        super(world);
    }
    public void placeInPortal(Entity entity) {
        if (entity instanceof ServerPlayer player) {
            if (player.getRespawnPosition() != null) {
                BlockPos spawnPoint = player.getRespawnPosition();
                entity.teleportTo(spawnPoint.getX(), spawnPoint.getY(), spawnPoint.getZ());
            }
        }
    }
    @Override
    public Entity placeEntity(Entity entity, ServerLevel currentWorld, ServerLevel destWorld, float yaw, Function<Boolean, Entity> repositionEntity) {
        if (entity instanceof ServerPlayer) {
            this.placeInPortal(entity);
        }
        entity.setPortalCooldown();
        entity = repositionEntity.apply(false);
        if (pos == null) {
            ServerPlayer spe = (ServerPlayer) entity;
            entity.teleportTo(Objects.requireNonNull(spe.getRespawnPosition()).getX(), spe.getRespawnPosition().getY() + 1, spe.getRespawnPosition().getZ());
        } else {
            entity.teleportTo(pos.getX(), pos.getY() + 1, pos.getZ());
        }
        return entity;
    }
}
