package com.penguujr.spaceandmore.core.init;

import com.google.common.base.Supplier;
import com.penguujr.spaceandmore.SpaceAndMore;
import com.penguujr.spaceandmore.items.AetherAlexLoveItem;
import com.penguujr.spaceandmore.items.AetherItem;
import com.penguujr.spaceandmore.items.AlexItem;
import com.penguujr.spaceandmore.items.ExampleItem;
import com.penguujr.spaceandmore.items.TestItem;
import com.penguujr.spaceandmore.items.tools.pickaxe.obsidianPickaxe;
import com.penguujr.spaceandmore.items.tools.sword.obsidianSword;
import com.penguujr.spaceandmore.items.tools.tiers.SpaceAndMoreTiers;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpaceAndMore.MOD_ID); // register, registers items
	
	
	
	
	/// ALL THE ITEMS
	
	//test items
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", //item used as an example
			() -> new ExampleItem(new Item.Properties().tab(SpaceAndMore.SPACEANDMORE_SPECIAL_TAB)));
	
	public static final RegistryObject<Item> TEST_ITEM = register("test_item",
			() -> new TestItem(new Item.Properties().tab(SpaceAndMore.SPACEANDMORE_SPECIAL_TAB)));
	
	
	//special items to me / unknown random items 
	public static final RegistryObject<Item> AETHER_ITEM = register("aether_item",
			() -> new AetherItem(new Item.Properties().tab(SpaceAndMore.SPACEANDMORE_SPECIAL_TAB)));
	
	public static final RegistryObject<Item> ALEX_ITEM = register("alex_item",
			() -> new AlexItem(new Item.Properties().tab(SpaceAndMore.SPACEANDMORE_SPECIAL_TAB)));
	
	public static final RegistryObject<Item> AETHER_ALEX_ITEM = register("aether_alex_love_item",
			() -> new AetherAlexLoveItem(new Item.Properties().tab(SpaceAndMore.SPACEANDMORE_SPECIAL_TAB)));
	
	
	
	
	//// tools
	
	///////////////  pickaxe \\\\\\\\\\\\\
	public static final RegistryObject<Item> OBSIDIAN_PICKAXE = register("obsidian_pickaxe_item",
			() -> new obsidianPickaxe(SpaceAndMoreTiers.OBSIDIAN, 1, 1f, new Item.Properties().tab(SpaceAndMore.SPACEANDMORE_ITEMS_TAB)));
	
	///////// swords \\\\\\\\
	
	public static final RegistryObject<Item> OBSIDIAN_SWORD = register("obsidian_sword_item",
			() -> new obsidianSword(SpaceAndMoreTiers.OBSIDIAN, 5, 1f, new Item.Properties().tab(SpaceAndMore.SPACEANDMORE_ITEMS_TAB)));
	
	//////////////// ORE IN GROUND \\\\\\\\\\\
	
	
	
	
	
	/////////////// SMELTED ORES \\\\\\\\\\\
	
	public static final RegistryObject<Item> OBSIDIAN_INGOT = register("obsidian_ingot_item",
			() -> new Item(new Item.Properties().tab(SpaceAndMore.SPACEANDMORE_ITEMS_TAB)));
	
	
	
	
	
	
	
	
	
	//registering the items functions
	
	
	private static<T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){//register function
		return ITEMS.register(name,  item);		
	} //registry object, contains items
	
	
	
	
	
	
	//ignore
	private ItemInit() {
		//never going to use this
	}
	
	
}
