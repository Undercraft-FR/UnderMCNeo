package fr.undercraft.mcneo.objects.blocks.concrete;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class BrownConcrete  extends Block {
    protected IIcon fastIcon;
    public BrownConcrete(String name) {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockTextureName(Main.MODID + ":brown_concrete");
        setBlockName(name);

    }

}