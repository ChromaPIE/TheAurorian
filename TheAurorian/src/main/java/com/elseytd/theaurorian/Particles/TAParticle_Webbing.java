package com.elseytd.theaurorian.Particles;

import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TAParticle_Webbing extends Particle {
	public TAParticle_Webbing(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn) {
		super(worldIn, xCoordIn, yCoordIn, zCoordIn);
	}

	@SideOnly(Side.CLIENT)
	public static class Factory implements IParticleFactory {
		public Particle createParticle(int particleID, World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn, int... p_178902_15_) {
			return new TAParticle_Webbing(worldIn, xCoordIn, yCoordIn, zCoordIn);
		}
	}
}
