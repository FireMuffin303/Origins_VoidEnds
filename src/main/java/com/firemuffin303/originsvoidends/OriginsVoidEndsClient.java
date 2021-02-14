package com.firemuffin303.originsvoidends;

import com.firemuffin303.originsvoidends.client.renderer.DragonianFireBallEntityRenderer;
import com.firemuffin303.originsvoidends.regitries.OVEEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.DragonFireballEntityRenderer;

@Environment(EnvType.CLIENT)
public class OriginsVoidEndsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(OVEEntities.DRAGONIAN_FIREBALL,
                ((entityRenderDispatcher, context) -> new DragonianFireBallEntityRenderer(entityRenderDispatcher)));
    }
}
