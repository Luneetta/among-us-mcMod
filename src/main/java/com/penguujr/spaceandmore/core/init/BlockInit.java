package com.penguujr.spaceandmore.core.init;

import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.penguujr.spaceandmore.SpaceAndMore;
import com.penguujr.spaceandmore.blocks.exampleBlock;
import com.penguujr.spaceandmore.blocks.testingBlock;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SpaceAndMore.MOD_ID);
	
	private static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;
	
	
	//all the blocks
	
	
	
	//testing block
	public static final RegistryObject<Block> EXAMPLE_BLOCK = register("example_block",
			() -> new exampleBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(3).requiresCorrectToolForDrops().friction(100)), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SpaceAndMore.SPACEANDMORE_BLOCKS_TAB)));
	public static final RegistryObject<testingBlock> TESTING_BLOCK = register("testing_block",
			() -> new testingBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(1).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SpaceAndMore.SPACEANDMORE_BLOCKS_TAB)));
	
	
	//real blocks


	
	
	
	
	private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<?extends T> block) {
			return BLOCKS.register(name,  block);
		}
	
	private static<T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block,
			Function<RegistryObject<T>, Supplier<? extends Item>> item) {
		RegistryObject<T> obj = registerBlock(name, block);
		ITEMS.register(name, item.apply(obj));
		return obj;
		
		}
	
	}
