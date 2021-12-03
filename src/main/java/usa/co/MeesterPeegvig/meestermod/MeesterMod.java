package usa.co.MeesterPeegvig.meestermod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MeesterMod.MODID, version = MeesterMod.VERSION, name = MeesterMod.NAME)
public class MeesterMod {
    public static final String MODID = "meestermod";
    public static final String VERSION = "1.0";
    public static final String NAME = "MeesterMod";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @EventHandler
    public void init(FMLInitializationEvent event){
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
