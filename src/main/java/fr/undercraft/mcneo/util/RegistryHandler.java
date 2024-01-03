package fr.undercraft.mcneo.util;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.undercraft.mcneo.init.BlockInit;

public class RegistryHandler {
    public static void registerBlocks() {

        GameRegistry.registerBlock(BlockInit.amethyst_block, "amethyst_block");
        GameRegistry.registerBlock(BlockInit.azalea_leaves, "azalea_leaves");
        GameRegistry.registerBlock(BlockInit.bamboo_block, "bamboo_block");
        GameRegistry.registerBlock(BlockInit.deepslate, "deepslate");
        GameRegistry.registerBlock(BlockInit.black_concrete, "black_concrete");
        GameRegistry.registerBlock(BlockInit.blue_concrete, "blue_concrete");
        GameRegistry.registerBlock(BlockInit.brown_concrete, "brown_concrete");
        GameRegistry.registerBlock(BlockInit.green_concrete, "green_concrete");
        GameRegistry.registerBlock(BlockInit.light_blue_concrete, "light_blue_concrete");
        GameRegistry.registerBlock(BlockInit.light_gray_concrete, "light_gray_concrete");
        GameRegistry.registerBlock(BlockInit.lime_concrete, "lime_concrete");
        GameRegistry.registerBlock(BlockInit.magenta_concrete, "magenta_concrete");
        GameRegistry.registerBlock(BlockInit.orange_concrete, "orange_concrete");
        GameRegistry.registerBlock(BlockInit.pink_concrete, "pink_concrete");
        GameRegistry.registerBlock(BlockInit.purple_concrete, "purple_concrete");
        GameRegistry.registerBlock(BlockInit.red_concrete, "red_concrete");
        GameRegistry.registerBlock(BlockInit.white_concrete, "white_concrete");
        GameRegistry.registerBlock(BlockInit.yellow_concrete, "yellow_concrete");

    }
}