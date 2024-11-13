package com.pingwel.pingumod.creativetabs;

import com.pingwel.pingumod.PinguMod;
import com.pingwel.pingumod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.checkerframework.checker.units.qual.C;

import java.util.function.Supplier;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab>CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PinguMod.MOD_ID);


    public static final Supplier<CreativeModeTab> REDBRICK_ITEMS_TAB = CREATIVE_MODE_TAB.register("redbrick_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack((ModItems.REDBRICK.get())))
                    .title(Component.translatable("creativetab.pingumo.redbrick_items"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(ModItems.REDBRICK);
                    })
                    .build());


    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
