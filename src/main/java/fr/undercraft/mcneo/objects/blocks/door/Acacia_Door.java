package fr.undercraft.mcneo.object.blocks.door;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraft.client.renderer.texture.IIconRegister;

public class Acacia_Door extends BlockDoor {

    // Define icons for the bottom and top textures
    private IIcon iconBottom;
    private IIcon iconTop;

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        // Assuming your textures are directly in the 'blocks' folder
        this.iconBottom = iconRegister.registerIcon("block/acacia/acacia_door_bottom.png");
        this.iconTop = iconRegister.registerIcon("block/acacia/acacia_door_top.png");
    }

    // Override getIcon to return the appropriate texture based on the side and metadata
    @Override
    public IIcon getIcon(int side, int metadata) {
        if (side == 0 || side == 1) {
            // Bottom or top side
            return this.iconTop;
        } else {
            // Other sides
            return this.iconBottom;
        }
    }


    public Acacia_Door() {
        super(Material.wood);
        setCreativeTab(CreativeTabs.tabRedstone);
        setBlockTextureName("block/" + "acacia_door_top.png");

    }

    // Override registerBlockIcons to set custom textures

}
