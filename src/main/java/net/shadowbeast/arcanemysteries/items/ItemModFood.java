package net.shadowbeast.arcanemysteries.items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import org.jetbrains.annotations.NotNull;

public class ItemModFood extends ItemMod {
    FoodProperties food;
    boolean fastFood;
    public ItemModFood(Properties properties) {super(properties);}
    public ItemModFood(FoodProperties food) {
        super(new Properties().food(food));
        this.food = food;
    }
    public ItemModFood(FoodProperties food, boolean fastFood) { //TODO Delete when no usage
        super(new Item.Properties().food(food));
        this.food = food;
        this.fastFood = fastFood;
    }
    @Override public int getUseDuration(@NotNull ItemStack stack) {return fastFood ? 1 : super.getUseDuration(stack);}
}
