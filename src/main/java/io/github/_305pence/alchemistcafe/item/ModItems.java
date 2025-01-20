package io.github._305pence.alchemistcafe.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static io.github._305pence.alchemistcafe.AlchemistCafe.ITEMS;
import static io.github._305pence.alchemistcafe.AlchemistCafe.MODID;

public class ModItems {
    // Create a Deferred Register to hold Items
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    //Soda bottle item for storing soda liquid
    public static final DeferredItem<Item> SODA_BOTTLE = ITEMS.registerSimpleItem("soda_bottle");
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
