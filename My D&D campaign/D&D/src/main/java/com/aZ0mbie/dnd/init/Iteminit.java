package com.aZ0mbie.dnd.init;

import com.aZ0mbie.dnd.dnd;
import com.google.common.base.Supplier;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Iteminit {
	
	public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, dnd.mod_id);
	public static final RegistryObject<Item> DAGGER = Register("Dagger", ()-> new Item(new Item.Properties().tab(dnd.Dnd_tab)));
	private static <T extends Item> RegistryObject<T> Register(final String name, final Supplier<T> item){
		return ITEM.register(name, item);
	}
}
