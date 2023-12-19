package fr.undercraft.mcneo.proxy;
import net.minecraftforge.common.MinecraftForge;


public class ClientProxy extends CommonProxy {

    public ClientProxy() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}