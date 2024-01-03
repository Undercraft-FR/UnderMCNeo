package fr.undercraft.mcneo.objects.blocks.concrete;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class GreenConcrete extends Block {
    protected IIcon fastIcon;
    public GreenConcrete(String name) {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockTextureName(Main.MODID + ":green_concrete");
        setBlockName(name);

    }

}