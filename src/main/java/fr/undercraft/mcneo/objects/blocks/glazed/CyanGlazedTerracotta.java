package fr.undercraft.mcneo.objects.blocks.glazed;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class CyanGlazedTerracotta extends Block {
    protected IIcon fastIcon;
    public CyanGlazedTerracotta(String name) {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabDecorations);
        setBlockTextureName(Main.MODID + ":cyan_glazed_terracotta");
        setBlockName(name);

    }

}
