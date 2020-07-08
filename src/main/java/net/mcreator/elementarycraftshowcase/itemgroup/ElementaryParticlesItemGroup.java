
package net.mcreator.elementarycraftshowcase.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.elementarycraftshowcase.block.GluonFieldBlock;
import net.mcreator.elementarycraftshowcase.ElementaryCraftShowcaseModElements;

@ElementaryCraftShowcaseModElements.ModElement.Tag
public class ElementaryParticlesItemGroup extends ElementaryCraftShowcaseModElements.ModElement {
	public ElementaryParticlesItemGroup(ElementaryCraftShowcaseModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabelementary_particles") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GluonFieldBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
