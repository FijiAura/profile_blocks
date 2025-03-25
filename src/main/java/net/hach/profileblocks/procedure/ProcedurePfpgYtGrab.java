package net.hach.profileblocks.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.GuiTextField;

import net.hach.profileblocks.block.BlockYoutubeBlock;
import net.hach.profileblocks.block.BlockFijiauraBlockYT;
import net.hach.profileblocks.ElementsProfileBlocksMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

@ElementsProfileBlocksMod.ModElement.Tag
public class ProcedurePfpgYtGrab extends ElementsProfileBlocksMod.ModElement {
	public ProcedurePfpgYtGrab(ElementsProfileBlocksMod instance) {
		super(instance, 8);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PfpgYtGrab!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			System.err.println("Failed to load dependency guistate for procedure PfpgYtGrab!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		String YT_Username = "";
		if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(BlockYoutubeBlock.block, (int) (1)).getItem())) {
			YT_Username = (String) (new Object() {
				public String getText() {
					GuiTextField textField = (GuiTextField) guistate.get("text:UsernameYT");
					if (textField != null) {
						return textField.getText();
					}
					return "";
				}
			}.getText());
			if ((((YT_Username)).equals("FijiAura"))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockFijiauraBlockYT.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
		}
	}
}
