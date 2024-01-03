package fr.undercraft.mcneo.objects.blocks.concrete;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class PinkConcrete extends Block {
    protected IIcon fastIcon;
    public PinkConcrete(String name) {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockTextureName(Main.MODID + ":pink_concrete");
        setBlockName(name);

    }

}