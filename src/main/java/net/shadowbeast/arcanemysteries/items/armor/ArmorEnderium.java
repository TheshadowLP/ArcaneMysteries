package net.shadowbeast.arcanemysteries.items.armor;

import com.google.common.collect.ImmutableMap;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.shadowbeast.arcanemysteries.enums.ArmorStats;
import net.shadowbeast.arcanemysteries.util.LocalizeUtils;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class ArmorEnderium extends ArmorItem {
    public static final Map<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
                    .put(ArmorStats.ENDERIUM, new MobEffectInstance(MobEffects.DOLPHINS_GRACE/*PLACEHOLDER*/,
                            200,
                            0, false, false, false)).build();
    private ArmorEnderium(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }
    @SuppressWarnings("removal")
    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if(hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }
    }
    private void evaluateArmorEffects(Player player) {
        for(Map.Entry<ArmorMaterial, MobEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            MobEffectInstance mapStatusEffect = entry.getValue();

            if(hasCorrectArmorOn(player)) {
                addStatusEffectForMaterial(player, mapStatusEffect);
            }
        }
    }
    private void addStatusEffectForMaterial(Player player, MobEffectInstance pEffect) {
        boolean hasPlayerEffect = player.hasEffect(pEffect.getEffect());

        if(hasCorrectArmorOn(player) && !hasPlayerEffect) {
            // player.addEffect(pEffect); // Rewrite this code when we decided which effect we add for this armor
        }
    }
    private boolean hasCorrectArmorOn(Player player) {
        for(ItemStack armorStack : player.getInventory().armor) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }
        ArmorItem helmet = ((ArmorItem) player.getInventory().getArmor(0).getItem());
        ArmorItem chestplate = ((ArmorItem) player.getInventory().getArmor(1).getItem());
        ArmorItem leggings = ((ArmorItem) player.getInventory().getArmor(2).getItem());
        ArmorItem boots = ((ArmorItem) player.getInventory().getArmor(3).getItem());

        return helmet.getMaterial() == ArmorStats.ENDERIUM && chestplate.getMaterial() == ArmorStats.ENDERIUM
                && leggings.getMaterial() == ArmorStats.ENDERIUM && boots.getMaterial() == ArmorStats.ENDERIUM;
    }
    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack helmet = player.getInventory().getArmor(0);
        ItemStack chestplate = player.getInventory().getArmor(1);
        ItemStack leggings = player.getInventory().getArmor(2);
        ItemStack boots = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !chestplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }
    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, @NotNull TooltipFlag flagIn) {
        tooltip.add(LocalizeUtils.i18n("tooltip.arcanemysteries.enderium_fullset"));
    }
    public static ArmorEnderium getInstance(Type ptype) {
        return new ArmorEnderium(ArmorStats.ENDERIUM, ptype, new Properties().stacksTo(1));
    }
}
