package info.zthings.minecraft.crashmyserver;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;

@Mod(modid = CrashMyServerMod.MODID, name = CrashMyServerMod.NAME, version = CrashMyServerMod.VERSION)
public class CrashMyServerMod {
	public static final String MODID = "crashpls";
	public static final String NAME = "Crash My Server";
	public static final String VERSION = "1.0";
	public static String crashMsg = "Crashed the server as requested";
	
	@EventHandler
	public static void onServerDone(@SuppressWarnings("unused") FMLServerStartedEvent event) {
		throw new Error(crashMsg);
	}
}
