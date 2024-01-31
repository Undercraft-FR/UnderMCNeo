package fr.undercraft.mcneo.objects.blocks.bamboo;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class BambooPlanks  extends Block {
    public BambooPlanks(String name) {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockTextureName(Main.MODID + ":bamboo_planks");
        setBlockName(name);

    }

}
