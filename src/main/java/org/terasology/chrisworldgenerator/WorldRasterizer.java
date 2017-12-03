public class TutorialWorldRasterizer implements WorldRasterizer {
    
	private Block dirt;

    	@Override
    	public void initialize() {
		dirt = CoreRegistry.get(BlockManager.class).getBlock("Core:Dirt");
    	}

    	@Override
    	public void generateChunk(CoreChunk chunk, Region chunkRegion) {
		for (Vector3i position : chunkRegion.getRegion()) {
			if(position.y < 0)
				chunk.setBlock(ChunkMath.calcBlockPos(position), dirt);
		}
    	}
}
