package usa.co.MeesterPeegvig.meestermod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import usa.co.MeesterPeegvig.meestermod.proxy.CommonProxy;

@Mod(modid = MeesterMod.MODID, version = MeesterMod.VERSION, name = MeesterMod.NAME)
public class MeesterMod {
    public static final String MODID = "meestermod";
    public static final String VERSION = "1.0";
    public static final String NAME = "MeesterMod";

    @SidedProxy(clientSide = "usa.co.MeesterPeegvig.meestermod.proxy.ClientProxy", serverSide = "usa.co.MeesterPeegvig.meestermod.proxy.CommonProxy")
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){

        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        MinecraftForge.EVENT_BUS.register(new MeesterModEventHandler());
        proxy.postInit(event);
    }
}
