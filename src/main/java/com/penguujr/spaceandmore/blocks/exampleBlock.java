package com.penguujr.spaceandmore.blocks;

import com.penguujr.spaceandmore.core.init.ItemInit;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class exampleBlock extends Block {

	public exampleBlock(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}
	
	
	@SuppressWarnings("deprecation")
	@Override
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player,
			InteractionHand hand, BlockHitResult result) {
		if(!world.isClientSide()) {
			if(player.getItemInHand(hand).getItem().equals(ItemInit.EXAMPLE_ITEM.get())) {
				player.level.explode(player, player.position().x, player.position().y, player.position().z, 50.0F, Explosion.BlockInteraction.BREAK);
			}
			
			return InteractionResult.CONSUME;
		}
		
		
		// TODO Auto-generated method stub
		return super.use(state, world, pos, player, hand, result);
	}

}
