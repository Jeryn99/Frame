package dev.jeryn.frame.forge;

import dev.jeryn.frame.FrameMain;
import net.minecraftforge.fml.common.Mod;

@Mod(FrameMain.MOD_ID)
public final class FrameMainForge {
    public FrameMainForge() {
        // Run our common setup.
        FrameMain.init();
    }
}
