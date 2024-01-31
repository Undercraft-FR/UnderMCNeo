package fr.undercraft.mcneo.objects.blocks.glazed;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class LightBlueGlazedTerracotta extends Block {
    protected IIcon fastIcon;
    public LightBlueGlazedTerracotta(String name) {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabDecorations);
        setBlockTextureName(Main.MODID + ":light_blue_glazed_terracotta");
        setBlockName(name);

    }

}