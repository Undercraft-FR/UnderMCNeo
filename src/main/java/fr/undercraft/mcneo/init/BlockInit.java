package fr.undercraft.mcneo.init;

import fr.undercraft.mcneo.Main;
import fr.undercraft.mcneo.objects.blocks.amethyst.AmethystBlock;
import fr.undercraft.mcneo.objects.blocks.bamboo.BambooBlock;
import fr.undercraft.mcneo.objects.blocks.azalea.AzaleaLeaves;
import fr.undercraft.mcneo.objects.blocks.chery.CherryPlanks;
import fr.undercraft.mcneo.objects.blocks.chery.CheryLeaves;
import fr.undercraft.mcneo.objects.blocks.concrete.*;
import fr.undercraft.mcneo.objects.blocks.concrete.powder.*;
import fr.undercraft.mcneo.objects.blocks.copper.CutCopper;
import fr.undercraft.mcneo.objects.blocks.deepslate.CobbledDeepslate;
import fr.undercraft.mcneo.objects.blocks.deepslate.DeepslateBricks;
import fr.undercraft.mcneo.objects.blocks.acacia.AcaciaDoor;
import fr.undercraft.mcneo.objects.blocks.glazed.*;
import fr.undercraft.mcneo.objects.blocks.roche.Calcite;
import fr.undercraft.mcneo.objects.blocks.deepslate.Deepslate;
import fr.undercraft.mcneo.objects.items.acacia.ItemAcaciaDoor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class  BlockInit {

// BLOCK

    public static List<Block> BLOCKS = new ArrayList<Block>();
    public static final Block amethyst_block = new AmethystBlock("amethyst_block");
    public static final Block azalea_leaves = new AzaleaLeaves("azalea_leaves");
    public static final Block bamboo_block = new BambooBlock("bamboo_block");
    public static final Block deepslate = new Deepslate("deepslate");
    public static final Block black_concrete = new BlackConcrete("black_concrete");
    public static final Block blue_concrete = new BlueConcrete("blue_concrete");
    public static final Block brown_concrete = new BrownConcrete("brown_concrete");
    public static final Block green_concrete = new GreenConcrete("green_concrete");
    public static final Block cyan_concrete = new CyanConcrete("cyan_concrete");
    public static final Block gray_concrete = new GrayConcrete("gray_concrete");
    public static final Block light_blue_concrete = new LightBlueConcrete("light_blue_concrete");
    public static final Block light_gray_concrete = new LightGrayConcrete("light_gray_concrete");
    public static final Block lime_concrete = new LimeConcrete("lime_concrete");
    public static final Block magenta_concrete = new MagentaConcrete("magenta_concrete");
    public static final Block orange_concrete = new OrangeConcrete("orange_concrete");
    public static final Block pink_concrete = new PinkConcrete("pink_concrete");
    public static final Block purple_concrete = new PurpleConcrete("purple_concrete");
    public static final Block red_concrete = new RedConcrete("red_concrete");
    public static final Block white_concrete = new WhiteConcrete("white_concrete");
    public static final Block yellow_concrete = new YellowConcrete("yellow_concrete");
    public static final Block black_concrete_powder = new BlackConcretePowder("black_concrete_powder");
    public static final Block blue_concrete_powder = new BlueConcretePowder("blue_concrete_powder");
    public static final Block brown_concrete_powder = new BrownConcretePowder("brown_concrete_powder");
    public static final Block cyan_concrete_powder = new CyanConcretePowder("cyan_concrete_powder");
    public static final Block gray_concrete_powder = new GrayConcretePowder("gray_concrete_powder");
    public static final Block green_concrete_powder = new GreenConcretePowder("green_concrete_powder");
    public static final Block light_blue_concrete_powder = new LightBlueConcretePowder("light_blue_concrete_powder");
    public static final Block light_gray_concrete_powder = new LightGrayConcretePowder("light_gray_concrete_powder");
    public static final Block lime_concrete_powder = new LimeConcretePowder("lime_concrete_powder");
    public static final Block magenta_concrete_powder = new MagentaConcretePowder("magenta_concrete_powder");
    public static final Block orange_concrete_powder = new OrangeConcretePowder("orange_concrete_powder");
    public static final Block pink_concrete_powder = new PinkConcretePowder("pink_concrete_powder");
    public static final Block red_concrete_powder = new RedConcretePowder("red_concrete_powder");
    public static final Block white_concrete_powder = new WhiteConcretePowder("white_concrete_powder");
    public static final Block yellow_concrete_powder = new YellowConcretePowder("yellow_concrete_powder");
    public static final Block cherry_leaves = new CheryLeaves("cherry_leaves");
    public static final Block cherry_planks = new CherryPlanks("cherry_planks");
    //public static final Block bamboo_planks = new BambooPlanks("bamboo_planks");
    public static final Block calcite = new Calcite("calcite");
    public static final Block cut_copper = new CutCopper("cut_copper");
    public static final Block black_glazed_terracotta = new BlackGlazedTerracotta("black_glazed_terracotta");
    public static final Block blue_glazed_terracotta = new BlueGlazedTerracotta("black_glazed_terracotta");
    public static final Block cyan_glazed_terracotta = new CyanConcretePowder("cyan_glazed_terracotta");
    public static final Block gray_glazed_terracotta = new GrayGlazedTerracotta("gray_glazed_terracotta");
    public static final Block green_glazed_terracotta = new GreenGlazedTerracotta("green_glazed_terracotta");
    public static final Block light_blue_glazed_terracotta = new LightBlueGlazedTerracotta("light_blue_glazed_terracotta");
    public static final Block light_gray_glazed_terracotta = new LightGrayConcretePowder("light_gray_glazed_terracotta");
    public static final Block lime_glazed_terracotta = new LimeGlazedTerracotta("lime_glazed_terracotta");
    public static final Block magenta_glazed_terracotta = new MagentaGlazedTerracotta("magenta_glazed_terracotta");
    public static final Block orange_glazed_terracotta = new OrangeGlazedTerracotta("orange_glazed_terracotta");
    public static final Block pink_glazed_terracotta = new PinkGlazedTerracotta("pink_glazed_terracotta");
    public static final Block purple_glazed_terracotta = new PurpleGlazedTerracotta("purple_glazed_terracotta");
    public static final Block red_glazed_terracotta = new RedGlazedTerracotta("red_glazed_terracotta");
    public static final Block white_glazed_terracotta = new WhiteGlazedTerracotta("white_glazed_terracotta");
    public static final Block yellow_glazed_terracotta = new YellowGlazedTerracotta("yellow_glazed_terracotta");
    public static final Block deepslate_bricks = new DeepslateBricks("deepslate_brick");
    public static final Block cobbled_deepslate = new CobbledDeepslate("cobbled_deepslate");

    // DOOR
  //  public static final Block acaciaDoor = new AcaciaDoor(Material.wood).setBlockName("acacia_door");
   // public static final Item itemAcaciaDoor = new ItemAcaciaDoor(Material.wood).setUnlocalizedName("itemacaciadoor").setTextureName(Main.MODID + ":acacia_door");

}