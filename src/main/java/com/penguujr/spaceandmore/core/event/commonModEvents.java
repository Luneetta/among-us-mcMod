package com.penguujr.spaceandmore.core.event;

import com.penguujr.spaceandmore.SpaceAndMore;
import com.penguujr.spaceandmore.common.entity.ExampleEntity;
import com.penguujr.spaceandmore.core.init.EntityInit;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = SpaceAndMore.MOD_ID, bus = Bus.MOD)


public class commonModEvents {
	
	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(EntityInit.EXAMPLE_ENTITY.get(), ExampleEntity.createAttributes().build());
	}
	
}