package com.penguujr.spaceandmore.items;

import com.penguujr.spaceandmore.SpaceAndMore;
import com.penguujr.spaceandmore.core.init.ItemInit;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = SpaceAndMore.MOD_ID, bus = Bus.FORGE, value = Dist.CLIENT)
public class TestItem extends Item {
	public TestItem(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}
	
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent event) {
		
		if(event.player.getItemInHand(InteractionHand.MAIN_HAND).getItem().equals(ItemInit.TEST_ITEM.get()) && event.player.level.isClientSide() ) { 
			//event.player.level.setBlock(null, null, EAT_DURATION);
		}
	}
	
	
	
}
