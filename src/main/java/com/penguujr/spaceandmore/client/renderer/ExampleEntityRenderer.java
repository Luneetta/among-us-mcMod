package com.penguujr.spaceandmore.client.renderer;
import com.penguujr.spaceandmore.SpaceAndMore;
import com.penguujr.spaceandmore.client.renderer.model.ExampleEntityModel;
import com.penguujr.spaceandmore.common.entity.ExampleEntity;


import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ExampleEntityRenderer<Type extends ExampleEntity> extends MobRenderer<Type, ExampleEntityModel<Type>> {
	
	private static final ResourceLocation TEXTURE = new ResourceLocation(SpaceAndMore.MOD_ID, "textures/entities/example_entity.png");

	public ExampleEntityRenderer(Context context) {
		super(context, new ExampleEntityModel<>(context.bakeLayer(ExampleEntityModel.LAYER_LOCATION)), 0.5f);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResourceLocation getTextureLocation(Type p_114482_) {
		// TODO Auto-generated method stub
		return TEXTURE;
	}
	
}