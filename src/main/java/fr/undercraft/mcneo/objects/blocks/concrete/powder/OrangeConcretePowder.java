package fr.undercraft.mcneo.objects.blocks.concrete.powder;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class OrangeConcretePowder extends Block {
    protected IIcon fastIcon;
    public OrangeConcretePowder(String name) {
        super(Material.sand);
        setCreativeTab(CreativeTabs.tabBlock);
        this.setStepSound(soundTypeSand);
        setBlockTextureName(Main.MODID + ":orange_concrete_powder");
        setBlockName(name);

    }


}
