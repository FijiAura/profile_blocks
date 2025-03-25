
package net.hach.profileblocks.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.hach.profileblocks.creativetab.TabYTProfiles;
import net.hach.profileblocks.ElementsProfileBlocksMod;

@ElementsProfileBlocksMod.ModElement.Tag
public class BlockFijiauraBlockYT extends ElementsProfileBlocksMod.ModElement {
	@GameRegistry.ObjectHolder("profile_blocks:fijiaura_block_yt")
	public static final Block block = null;
	public BlockFijiauraBlockYT(ElementsProfileBlocksMod instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("fijiaura_block_yt"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("profile_blocks:fijiaura_block_yt", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("fijiaura_block_yt");
			setSoundType(SoundType.STONE);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabYTProfiles.tab);
		}
	}
}
