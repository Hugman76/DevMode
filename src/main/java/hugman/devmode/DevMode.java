package hugman.devmode;

import net.fabricmc.api.ModInitializer;
import net.minecraft.SharedConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DevMode implements ModInitializer {
	@Override
	public void onInitialize() {
		SharedConstants.isDevelopment = true;
	}
}
