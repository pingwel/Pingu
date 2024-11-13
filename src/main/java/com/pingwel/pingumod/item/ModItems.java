package com.pingwel.pingumod.item;

import com.pingwel.pingumod.PinguMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PinguMod.MOD_ID);

    /* Adding new items here */
    public static final DeferredItem<Item> REDBRICK = ITEMS.register("redbrick", () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
