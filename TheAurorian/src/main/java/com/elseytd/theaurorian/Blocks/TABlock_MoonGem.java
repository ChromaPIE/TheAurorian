package com.elseytd.theaurorian.Blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.elseytd.theaurorian.TAMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TABlock_MoonGem extends Block {

	public static final String BLOCKNAME = "moongem";

	public TABlock_MoonGem() {
		super(Material.IRON);
		this.setCreativeTab(TAMod.CREATIVE_TAB);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setRegistryName(BLOCKNAME);
		this.setSoundType(SoundType.METAL);
		this.setUnlocalizedName(TAMod.MODID + "." + BLOCKNAME);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (!GuiScreen.isShiftKeyDown()) {
			tooltip.add(TextFormatting.ITALIC + I18n.format("string.theaurorian.tooltip.shiftinfo") + TextFormatting.RESET);
		} else {
			tooltip.add(I18n.format("string.theaurorian.tooltip.moongem"));
		}
	}
}
