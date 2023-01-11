package com.penguujr.spaceandmore.common.entity;

import com.penguujr.spaceandmore.core.init.EntityInit;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MoveTowardsTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class ExampleEntity extends Animal {

	public ExampleEntity(EntityType<? extends Animal> entityType, Level world) {
		super(entityType, world);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void registerGoals() {
		this.goalSelector.addGoal(0, new FloatGoal(this));
		this.goalSelector.addGoal(1,  new WaterAvoidingRandomStrollGoal(this, 20.0D));
	}
	
	public static AttributeSupplier.Builder createAttributes(){
		return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 20.0D).add(Attributes.MOVEMENT_SPEED, 0.2D);
	}
	
	
	@Override
	public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob parent) {
		// TODO Auto-generated method stub
		return EntityInit.EXAMPLE_ENTITY.get().create(world);
	}

}
