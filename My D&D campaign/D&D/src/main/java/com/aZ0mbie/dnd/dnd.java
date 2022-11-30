package com.aZ0mbie.dnd;

import com.aZ0mbie.dnd.init.Iteminit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(dnd.mod_id)
public class dnd {
	public static final String mod_id = "dnd";
	public static final CreativeModeTab Dnd_tab = new CreativeModeTab(mod_id) {
		
		@Override
		@OnlyIn(Dist.CLIENT) 
		public ItemStack makeIcon() {
			return new ItemStack(Iteminit.DAGGER.get());
		}
	};
	public dnd() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		Iteminit.ITEM.register(bus);
		MinecraftForge.EVENT_BUS.register(this);
	}

}
