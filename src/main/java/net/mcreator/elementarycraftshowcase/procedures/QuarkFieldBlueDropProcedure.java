package net.mcreator.elementarycraftshowcase.procedures;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.elementarycraftshowcase.block.UpQuarkBlueBlock;
import net.mcreator.elementarycraftshowcase.block.DownQuarkBlueBlock;
import net.mcreator.elementarycraftshowcase.ElementaryCraftShowcaseModElements;

@ElementaryCraftShowcaseModElements.ModElement.Tag
public class QuarkFieldBlueDropProcedure extends ElementaryCraftShowcaseModElements.ModElement {
	public QuarkFieldBlueDropProcedure(ElementaryCraftShowcaseModElements instance) {
		super(instance, 25);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure QuarkFieldBlueDrop!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure QuarkFieldBlueDrop!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure QuarkFieldBlueDrop!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure QuarkFieldBlueDrop!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((Math.random() < 0.5)) {
			if (!world.isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(UpQuarkBlueBlock.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		} else {
			if (!world.isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(DownQuarkBlueBlock.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
