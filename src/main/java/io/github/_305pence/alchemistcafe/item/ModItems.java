package io.github._305pence.alchemistcafe.item;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

import static io.github._305pence.alchemistcafe.AlchemistCafe.ITEMS;

public class ModItems {
    public static final DeferredItem<Item> SODA_BOTTLE = ITEMS.registerSimpleItem("soda_bottle",new Item.Properties());
}
