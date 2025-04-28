package com.House239.technologycraft;

import com.House239.technologycraft.itemInit;
import com.House239.technologycraft.blockInit;
import java.util.Arrays;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(itemInit.ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(blockInit.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : itemInit.ITEMS) {
            if (item instanceof iHasModel) {
                ((iHasModel)item).RegisterModels();
            }
        }
        for(Block block : blockInit.BLOCKS){
            if (block instanceof iHasModel){
                ((iHasModel)block).RegisterModels();
            }
        }
    }
}