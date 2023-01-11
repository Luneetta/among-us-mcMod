package com.penguujr.spaceandmore.items.tools.pickaxe;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class obsidianPickaxe extends PickaxeItem {

	public obsidianPickaxe(Tier tier, int AttackDamageMod, float AttackSpeedMod, Properties properties) {
		super(tier, AttackDamageMod, AttackSpeedMod, properties);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity player, int slot, boolean isInHand) {
		if(isInHand && stack.getDamageValue() != stack.getMaxDamage() + 1) {
			stack.setDamageValue(stack.getDamageValue() +1);
		} 
		
		super.inventoryTick(stack, level, player, slot, isInHand);
	}

	
}
