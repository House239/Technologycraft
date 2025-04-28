package com.House239.technologycraft;

import java.util.List;
import java.util.ArrayList;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block{
    public BlockBase(String name, Material material){
        super(material);
        // setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        blockInit.BLOCKS.add(this);
        itemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    // @Override
    public void registerModels(){
        ClientProxy.registerItemRenderer(ItemBlock.getItemFromBlock(this), 0, "inventory");
    }
}