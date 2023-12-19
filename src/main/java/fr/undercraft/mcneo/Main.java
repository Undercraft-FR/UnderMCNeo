package fr.undercraft.mcneo;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.undercraft.mcneo.blocks.door.Acacia_Door;
import fr.undercraft.mcneo.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "mcneo";
    public static final String NAME = "UnderMcNeo";
    public static final String VERSION = "1.0";

    public static final String CLIENT = "fr.undercraft.mcneo.proxy.ClientProxy";
    public static final String COMMON = "fr.undercraft.mcneo.proxy.CommonProxy";


    @Mod.Instance(MODID)
    public static Main instance;

    public Main() {
        super();
    }


    @SidedProxy(clientSide = Main.CLIENT, serverSide = Main.COMMON)
    public static CommonProxy proxy;


    public static final BlockDoor Acacia_Door = new Acacia_Door();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Register your custom door block
        GameRegistry.registerBlock(Acacia_Door, "door.AcaciaDoor");
    }



    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }





}
