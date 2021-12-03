package usa.co.MeesterPeegvig.meestermod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = MeesterMod.MODID, version = MeesterMod.VERSION)
public class MeesterMod
{
    public static final String MODID = "meestermod";
    public static final String VERSION = "1.0";
    public static final String NAME = "MeesterMod";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
