package fr.undercraft.mcneo.objects.blocks.chery;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.undercraft.mcneo.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class CheryLeaves extends Block {
    protected IIcon fastIcon;

    public CheryLeaves(String name) {
        super(Material.leaves);
        this.setStepSound(soundTypeGrass);
        setCreativeTab(CreativeTabs.tabDecorations);
        setBlockName(name);
        setHardness(0.2F);
        setLightOpacity(255);

    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        fastIcon = iconRegister.registerIcon(Main.MODID + ":cherry_leaves" + "_opaque");
        blockIcon = iconRegister.registerIcon(Main.MODID + ":cherry_leaves");
    }

    @Override
    public boolean isOpaqueCube() {
        return Blocks.leaves.isOpaqueCube();
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess blockaccess, int x, int y, int z, int side) {
        return !this.isOpaqueCube() ? true : super.shouldSideBeRendered(blockaccess, x, y, z, side);
    }

    @Override
    public IIcon getIcon(int side, int metadata) {
        return (isOpaqueCube() ? fastIcon : blockIcon);
    }
}