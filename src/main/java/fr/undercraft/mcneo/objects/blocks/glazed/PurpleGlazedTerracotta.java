package fr.undercraft.mcneo.objects.blocks.glazed;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraft.block.material.Material;

public class PurpleGlazedTerracotta extends Block {
    protected IIcon fastIcon;
    public PurpleGlazedTerracotta(String name) {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabDecorations);
        setBlockTextureName(Main.MODID + ":purple_glazed_terracotta");
        setBlockName(name);

    }

}
