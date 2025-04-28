package com.House239.technologycraft;

import com.House239.technologycraft.itemInit;
import com.House239.technologycraft.iHasModel;
import com.House239.technologycraft.ClientProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;
import java.util.List;
import net.minecraft.item.Item;


public class ItemBase extends Item{
    public ItemBase(String name){
        // setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        itemInit.ITEMS.add(this);
    }

    // @Override
    public void registerModels(){
        ClientProxy.registerItemRenderer(this, 0, "inventory");
    }
}