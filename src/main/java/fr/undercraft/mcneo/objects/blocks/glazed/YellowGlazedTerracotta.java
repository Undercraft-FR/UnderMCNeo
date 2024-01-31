package fr.undercraft.mcneo.objects.blocks.glazed;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class YellowGlazedTerracotta extends Block {
    protected IIcon fastIcon;
    public YellowGlazedTerracotta(String name) {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabDecorations);
        setBlockTextureName(Main.MODID + ":yellow_glazed_terracotta");
        setBlockName(name);

    }

}
