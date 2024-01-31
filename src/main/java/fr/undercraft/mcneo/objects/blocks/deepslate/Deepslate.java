package fr.undercraft.mcneo.objects.blocks.deepslate;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class Deepslate extends Block {
    protected IIcon fastIcon;
    public Deepslate(String name) {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockTextureName(Main.MODID + ":deepslate");
        setBlockName(name);

    }

}
