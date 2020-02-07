package com.elseytd.theaurorian.Items;

import com.elseytd.theaurorian.TAMod;
import com.elseytd.theaurorian.Entities.Projectiles.TAEntity_CeruleanArrow;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TAItem_Tool_Cerulean_Arrow extends ItemArrow {

	public static final String ITEMNAME = "ceruleanarrow";

	public TAItem_Tool_Cerulean_Arrow() {
		super();
		this.setCreativeTab(TAMod.CREATIVE_TAB);
		this.setRegistryName(ITEMNAME);
		this.setUnlocalizedName(TAMod.MODID + "." + ITEMNAME);
	}

	@Override
	public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter) {
		TAEntity_CeruleanArrow ceruleanarrow = new TAEntity_CeruleanArrow(worldIn, shooter);
		return ceruleanarrow;
	}

}
