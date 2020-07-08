
package net.mcreator.elementarycraftshowcase.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.elementarycraftshowcase.itemgroup.ElementaryParticlesItemGroup;
import net.mcreator.elementarycraftshowcase.ElementaryCraftShowcaseModElements;

import java.util.List;
import java.util.Collections;

@ElementaryCraftShowcaseModElements.ModElement.Tag
public class NeutronBlock extends ElementaryCraftShowcaseModElements.ModElement {
	@ObjectHolder("elementary_craft_showcase:neutron")
	public static final Block block = null;
	public NeutronBlock(ElementaryCraftShowcaseModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(ElementaryParticlesItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).lightValue(0));
			setRegistryName("neutron");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
