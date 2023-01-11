package com.penguujr.spaceandmore.items.tools.tiers;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class SpaceAndMoreTiers { ///////////////// tier durability speed attackDamage enchantmentValue, type of blocks it can mine
	public static final ForgeTier OBSIDIAN = new ForgeTier(5, 200, 40, 8, 252, BlockTags.NEEDS_DIAMOND_TOOL,
			() -> Ingredient.of(Items.OBSIDIAN));
	
}
