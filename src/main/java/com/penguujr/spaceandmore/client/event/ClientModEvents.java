package com.penguujr.spaceandmore.client.event;

import com.penguujr.spaceandmore.SpaceAndMore;
import com.penguujr.spaceandmore.client.renderer.ExampleEntityRenderer;
import com.penguujr.spaceandmore.client.renderer.model.ExampleEntityModel;
import com.penguujr.spaceandmore.core.init.EntityInit;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RenderLevelLastEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = SpaceAndMore.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)

public class ClientModEvents {
	
	private ClientModEvents() {
		
	}
	
	
	@SubscribeEvent
	public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ExampleEntityModel.LAYER_LOCATION, ExampleEntityModel::createBodyLayer);
	}
	
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EntityInit.EXAMPLE_ENTITY.get(), ExampleEntityRenderer::new);
	}
	
		
	
	
	
}
