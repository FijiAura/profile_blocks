
package net.hach.profileblocks.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.hach.profileblocks.block.BlockYoutubeBlock;
import net.hach.profileblocks.ElementsProfileBlocksMod;

@ElementsProfileBlocksMod.ModElement.Tag
public class TabYTProfiles extends ElementsProfileBlocksMod.ModElement {
	public TabYTProfiles(ElementsProfileBlocksMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabyt_profiles") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockYoutubeBlock.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
