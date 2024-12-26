package dev.jeryn.frame.forge;

import dev.jeryn.frame.FrameMain;
import dev.jeryn.frame.model.bedrock.ModelLayerManager;
import net.minecraft.client.Minecraft;
import net.minecraft.server.packs.resources.PreparableReloadListener;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = FrameMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModBus {


    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onRegisterClientReloadListeners(RegisterClientReloadListenersEvent event) {
        Minecraft mc = Minecraft.getInstance();
        List<PreparableReloadListener> listeners = ((ReloadableResourceManagerMixin) mc.getResourceManager()).getListeners();
        int idx = listeners.indexOf(mc.getEntityModels());
        listeners.add(idx + 1, new ModelLayerManager());
    }


}
