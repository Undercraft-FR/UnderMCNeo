package fr.undercraft.mcneo.util;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.undercraft.mcneo.init.BlockInit;

public class RegistryHandler {
    public static void registerBlocks() {

        GameRegistry.registerBlock(BlockInit.amethyst_block, "amethyst_block");
    }
}