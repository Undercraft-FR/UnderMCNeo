package fr.undercraft.mcneo.objects.blocks.calcite;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class Calcite extends Block {
    protected IIcon fastIcon;
    public Calcite(String name) {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockTextureName(Main.MODID + ":calcite");
        setBlockName(name);

    }

}