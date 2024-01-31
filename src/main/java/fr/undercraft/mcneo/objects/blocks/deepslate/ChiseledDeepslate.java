package fr.undercraft.mcneo.objects.blocks.deepslate;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class ChiseledDeepslate extends Block {
    protected IIcon fastIcon;
    public ChiseledDeepslate(String name) {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockTextureName(Main.MODID + ":chiseled_deepslate");
        setBlockName(name);

    }

}
