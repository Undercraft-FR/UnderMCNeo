package fr.undercraft.mcneo;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fr.undercraft.mcneo.proxy.CommonProxy;
import fr.undercraft.mcneo.util.RegistryHandler;

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

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.registerRender();
        RegistryHandler.registerBlocks();
    }


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }



    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }





}
