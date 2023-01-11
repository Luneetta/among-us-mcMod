package com.penguujr.spaceandmore.core.init;

import com.penguujr.spaceandmore.SpaceAndMore;
import com.penguujr.spaceandmore.common.entity.ExampleEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
	private EntityInit() {}
	
	
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES,
			SpaceAndMore.MOD_ID);
	
	
	
	
	/// all the entities
	public static final RegistryObject<EntityType<ExampleEntity>> EXAMPLE_ENTITY = ENTITIES.register("example_entity",
			() -> EntityType.Builder.of(ExampleEntity::new, MobCategory.CREATURE).sized(0.8f, 0.8f)
			.build(new ResourceLocation(SpaceAndMore.MOD_ID, "example_entity").toString()));
	
}
