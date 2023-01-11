package com.penguujr.spaceandmore;

import com.penguujr.spaceandmore.core.init.BlockInit;
import com.penguujr.spaceandmore.core.init.EntityInit;
import com.penguujr.spaceandmore.core.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("spaceandmore")
public class SpaceAndMore {
	public static final String MOD_ID = "spaceandmore";
	
	public static final CreativeModeTab SPACEANDMORE_ITEMS_TAB = new CreativeModeTab("itemgrouptab") {
		
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
		}
	};
	
	public static final CreativeModeTab SPACEANDMORE_BLOCKS_TAB = new CreativeModeTab("blockgrouptab") {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(BlockInit.EXAMPLE_BLOCK.get());
		}
	};
	
	public static final CreativeModeTab SPACEANDMORE_SPECIAL_TAB = new CreativeModeTab("specialgrouptab") {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.AETHER_ALEX_ITEM.get());
		}
	};
	
	
	
	
	

	public SpaceAndMore() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		EntityInit.ENTITIES.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
}
