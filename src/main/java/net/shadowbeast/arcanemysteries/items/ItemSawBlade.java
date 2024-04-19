package net.shadowbeast.arcanemysteries.items;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
public class ItemSawBlade extends Item {
    int maxDamage;
    public ItemSawBlade(Properties pProperties, int maxDamage) {
        super(pProperties);
        this.maxDamage = maxDamage;
    }
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
        CompoundTag tag = pStack.getOrCreateTagElement("DamageData");
        int damage = tag.getInt("Damage");

        pTooltipComponents.add(Component.literal(damage+"/"+this.maxDamage));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}

