package fr.undercraft.mcneo.objects.blocks.amethyst;

import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class AmethystBlock extends Block {
    protected IIcon fastIcon;
    public AmethystBlock(String name) {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockTextureName(Main.MODID + ":amethyst_block");
        setBlockName(name);

    }

}
