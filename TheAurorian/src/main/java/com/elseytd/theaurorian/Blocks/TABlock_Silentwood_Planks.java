package com.elseytd.theaurorian.Blocks;

import com.elseytd.theaurorian.TAMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TABlock_Silentwood_Planks extends Block {

	public static final String BLOCKNAME = "silentwoodplanks";

	public TABlock_Silentwood_Planks() {
		super(Material.WOOD);
		this.setCreativeTab(TAMod.CREATIVE_TAB);
		this.setHardness(2.0F);
		this.setRegistryName(BLOCKNAME);
		this.setSoundType(SoundType.WOOD);
		this.setUnlocalizedName(TAMod.MODID + "." + BLOCKNAME);
	}

}
