package com.penguujr.spaceandmore.items;

import com.penguujr.spaceandmore.core.init.ItemInit;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;

public class ExampleItem extends Item {

	public ExampleItem(Properties properties) {
		
		super(properties);
		// TODO Auto-generated constructor stub
	}
	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
		// TODO Auto-generated method stub
		if (!world.isClientSide()) {
			System.out.println(player.getName().getString() + " has used item " + hand.name());
			if(player.getItemInHand(hand).getItem().equals(ItemInit.EXAMPLE_ITEM.get())) {
					player.level.explode(player, player.position().x, player.position().y, player.position().z, 100.0F, Explosion.BlockInteraction.BREAK);
			}
		}
		
		
		return super.use(world, player, hand);
	}
	
	
	

}
