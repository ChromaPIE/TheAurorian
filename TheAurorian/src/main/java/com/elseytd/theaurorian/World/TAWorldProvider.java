package com.elseytd.theaurorian.World;

import com.elseytd.theaurorian.TADimensions;
import com.elseytd.theaurorian.TASounds;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TAWorldProvider extends WorldProvider {

	@Override
	public void init() {
		this.hasSkyLight = true;
		this.biomeProvider = new TABiomeProvider(this.world.getWorldInfo());
	}

	@Override
	@SideOnly(Side.CLIENT)
	public net.minecraft.client.audio.MusicTicker.MusicType getMusicType() {
		return TASounds.MUSICTYPE;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public float getSunBrightness(float par1) {
		return 0.75F;
	}

	@Override
	public float getSunBrightnessFactor(float par1) {
		return 0.75F;
	}

	@SideOnly(Side.CLIENT)
	public Vec3d getSkyColor(net.minecraft.entity.Entity cameraEntity, float partialTicks) {
		double r = 0;
		double g = 1;
		double b = 2;
		double muli = 0.15;
		return new Vec3d(r * muli, g * muli, b * muli);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public float getStarBrightness(float par1) {
		return world.getStarBrightnessBody(par1) * 1.85F;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public float getCloudHeight() {
		return 255F;
	}

	@Override
	public int getMoonPhase(long worldTime) {
		float rot = worldTime * 0.0025f;
		int phase = (int) ((int) 8 - (rot % 8));
		if (phase >= 8) {
			return 7;
		}
		return phase;
	}

	@Override
	public float calculateCelestialAngle(long worldTime, float partialTicks) {
		return 0.4f;
	}

	@Override
	public DimensionType getDimensionType() {
		return TADimensions.theauroriandimension;
	}

	@Override
	public String getSaveFolder() {
		return "TheAurorian";
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new TAChunkGenerator(world);
	}

	@Override
	public WorldSleepResult canSleepAt(net.minecraft.entity.player.EntityPlayer player, BlockPos pos) {
		return WorldSleepResult.DENY;
	}

	@Override
	public boolean isDaytime() {
		return false;
	}

	@Override
	public boolean canDoLightning(net.minecraft.world.chunk.Chunk chunk) {
		return false;
	}

	@Override
	public boolean canDoRainSnowIce(net.minecraft.world.chunk.Chunk chunk) {
		return false;
	}

	@Override
	public boolean canRespawnHere() {
		return false;
	}

}
