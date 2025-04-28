package com.House239.technologycraft;

import java.util.List;
import java.util.ArrayList;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blockInit{
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
}