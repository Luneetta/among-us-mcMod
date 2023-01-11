package com.penguujr.spaceandmore.client.event;

import com.penguujr.spaceandmore.SpaceAndMore;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = SpaceAndMore.MOD_ID, bus = Bus.FORGE, value = Dist.CLIENT)

public class ClientForgeEvents {
	
	public static ItemStack itemstack = null;
	
	public ClientForgeEvents() {
		
	}
	
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent event) {
		itemstack = event.player.getItemInHand(InteractionHand.MAIN_HAND);
	}
	
	/*@SubscribeEvent
    public static void pickupItem(EntityItemPickupEvent event) {
        System.out.println("Item picked up!");
    }*/
}
