package com.firemuffin303.originsvoidends;

import com.firemuffin303.originsvoidends.regitries.OVEEntities;
import com.firemuffin303.originsvoidends.regitries.OVEPowers;
import net.fabricmc.api.ModInitializer;

public class OriginsVoidEnds implements ModInitializer {
    public static final String MODID = "originsvoidends";

    @Override
    public void onInitialize() {
        OVEEntities.init();
    }
}
