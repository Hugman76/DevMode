package hugman.devmode;

import net.fabricmc.api.ModInitializer;
import net.minecraft.SharedConstants;

public class DevMode implements ModInitializer {
	@Override
	public void onInitialize() {
		SharedConstants.isDevelopment = true;
	}
}
