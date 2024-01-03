package fr.undercraft.mcneo.init;

import fr.undercraft.mcneo.object.blocks.amethyst.AmethystBlock;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static List<Block> BLOCKS = new ArrayList<Block>();
    public static final Block amethyst_block = new AmethystBlock("amethyst_block");

}