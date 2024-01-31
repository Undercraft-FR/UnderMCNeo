package fr.undercraft.mcneo.objects.blocks.concrete.powder;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class RedConcretePowder extends Block {
    protected IIcon fastIcon;
    public RedConcretePowder(String name) {
        super(Material.sand);
        setCreativeTab(CreativeTabs.tabBlock);
        this.setStepSound(soundTypeSand);
        setBlockTextureName(Main.MODID + ":red_concrete_powder");
        setBlockName(name);

    }


}
