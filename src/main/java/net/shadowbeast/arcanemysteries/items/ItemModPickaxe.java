package net.shadowbeast.arcanemysteries.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.*;

import javax.annotation.Nullable;
import java.util.List;

public class ItemModPickaxe extends PickaxeItem {
    public ItemModPickaxe(Tier tier, Rarity rarity) {
        super(tier, 1, -2.8F, new Properties().rarity(rarity));
    }
    public ItemModPickaxe(Tier tier) {
        super(tier, 1, -2.8F, new Properties());
    }
    public ItemModPickaxe(Tier tier, Properties properties) {
        super(tier, 1, -2.8F, properties);
    }
}
