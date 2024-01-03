package fr.undercraft.mcneo.objects.blocks.bamboo;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class BambooBlock extends Block {
    protected IIcon fastIcon;
    public BambooBlock(String name) {
        super(Material.wood);
        this.setStepSound(soundTypeWood);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockTextureName(Main.MODID + ":bamboo_block");
        setBlockName(name);

    }

}