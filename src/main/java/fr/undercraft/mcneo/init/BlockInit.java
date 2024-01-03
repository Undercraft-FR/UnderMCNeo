package fr.undercraft.mcneo.init;

import fr.undercraft.mcneo.objects.blocks.amethyst.AmethystBlock;
import fr.undercraft.mcneo.objects.blocks.bamboo.BambooBlock;
import fr.undercraft.mcneo.objects.blocks.azalea.AzaleaLeaves;
import fr.undercraft.mcneo.objects.blocks.concrete.*;
import fr.undercraft.mcneo.objects.blocks.roche.Deepslate;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static List<Block> BLOCKS = new ArrayList<Block>();
    public static final Block amethyst_block = new AmethystBlock("amethyst_block");
    public static final Block azalea_leaves = new AzaleaLeaves("azalea_leaves");
    public static final Block bamboo_block = new BambooBlock("bamboo_block");
    public static final Block deepslate = new Deepslate("deepslate");
    public static final Block black_concrete = new BlackConcrete("black_concrete");
    public static final Block blue_concrete = new BlueConcrete("blue_concrete");
    public static final Block brown_concrete = new BrownConcrete("brown_concrete");
    public static final Block green_concrete = new GreenConcrete("green_concrete");
    public static final Block light_blue_concrete = new LightBlueConcrete("light_blue_concrete");
    public static final Block light_gray_concrete = new LightGrayConcrete("light_gray_concrete");
    public static final Block lime_concrete = new LimeConcrete("lime_concrete");
    public static final Block magenta_concrete = new MagentaConcrete("magenta_concrete");
    public static final Block orange_concrete = new OrangeConcrete("orange_concrete");
    public static final Block pink_concrete = new PinkConcrete("pink_concrete");
    public static final Block purple_concrete = new PurpleConcrete("purple_concrete");
    public static final Block red_concrete = new RedConcrete("red_concrete");
    public static final Block white_concrete = new RedConcrete("white_concrete");
    public static final Block yellow_concrete = new RedConcrete("yellow_concrete");


}