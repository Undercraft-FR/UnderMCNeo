package fr.undercraft.mcneo.objects.blocks.chery;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class CherryPlanks extends Block {
    protected IIcon fastIcon;
    public CherryPlanks(String name) {
        super(Material.wood);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockTextureName(Main.MODID + ":cherry_planks");
        setBlockName(name);

    }

}
