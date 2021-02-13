package com.firemuffin303.originsvoidends.regitries;

import com.firemuffin303.originsvoidends.OriginsVoidEnds;
import com.firemuffin303.originsvoidends.entities.DragonianFireBallEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class OVEEntities {
    public static final EntityType DRAGONIAN_FIREBALL;

    static {
        DRAGONIAN_FIREBALL = FabricEntityTypeBuilder.<DragonianFireBallEntity>create(SpawnGroup.MISC,(type, world) -> new DragonianFireBallEntity(type,world)).dimensions(EntityDimensions.fixed(0.25f,0.25f)).trackable(64,10).build();
    }
    public static void init(){
        Registry.register(Registry.ENTITY_TYPE,new Identifier(OriginsVoidEnds.MODID,"dragonian_fireball"), DRAGONIAN_FIREBALL);
    }
}
