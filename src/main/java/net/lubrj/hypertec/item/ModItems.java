package net.lubrj.hypertec.item;

import net.lubrj.hypertec.Hypertec;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, Hypertec.MOD_ID);

    public static final RegistryObject<Item> hardenedSteel = Items.register("hardenedsteel",() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static void register(IEventBus eventBus)
    {
        Items.register(eventBus);
    }
}
