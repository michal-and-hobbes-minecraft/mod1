package com.nadatarama.mod1;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class Mod1WorldGenerator implements IWorldGenerator {

	private Block block;
	private int veinSize;

	Mod1WorldGenerator(Block block, int veinSize) {
		this.block = block;
		this.veinSize = veinSize;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) {
			this.runGenerator(new WorldGenMinable(block.getBlockState().getBaseState(), veinSize), world, random,
					chunkX, chunkZ, 20, 0, 64, chunkGenerator, chunkProvider);
		}
	}

	private void runGenerator(WorldGenMinable generator, World world, Random rand, int chunk_X, int chunk_Z,
			int chancesToSpawn, int minHeight, int maxHeight, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		}

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}
