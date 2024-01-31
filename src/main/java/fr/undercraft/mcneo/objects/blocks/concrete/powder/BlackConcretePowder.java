package fr.undercraft.mcneo.objects.blocks.concrete.powder;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class BlackConcretePowder extends Block {
    protected IIcon fastIcon;
    public BlackConcretePowder(String name) {
        super(Material.sand);
        this.setStepSound(soundTypeSand);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockTextureName(Main.MODID + ":black_concrete_powder");
        setBlockName(name);

    }

}