package fr.undercraft.mcneo.objects.blocks.copper;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CutCopper extends Block {

    public CutCopper(String name) {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockTextureName(Main.MODID + ":cut_copper");
        setBlockName(name);

    }

}
