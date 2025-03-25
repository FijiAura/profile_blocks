package net.hach.profileblocks.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.hach.profileblocks.gui.GuiPFPGrabber;
import net.hach.profileblocks.ProfileBlocksMod;
import net.hach.profileblocks.ElementsProfileBlocksMod;

import java.util.Map;

@ElementsProfileBlocksMod.ModElement.Tag
public class ProcedureProfileGrabberOnBlockRightClicked extends ElementsProfileBlocksMod.ModElement {
	public ProcedureProfileGrabberOnBlockRightClicked(ElementsProfileBlocksMod instance) {
		super(instance, 7);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ProfileGrabberOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ProfileGrabberOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ProfileGrabberOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ProfileGrabberOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ProfileGrabberOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(ProfileBlocksMod.instance, GuiPFPGrabber.GUIID, world, x, y, z);
	}
}
