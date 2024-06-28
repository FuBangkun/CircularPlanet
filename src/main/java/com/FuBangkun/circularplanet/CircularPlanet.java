package com.FuBangkun.circularplanet;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
    modid = "circularplanet",
    name = "Circular Planet",
    version = "1.0.1",
    acceptedMinecraftVersions = "[1.12.2]",
    dependencies =
            "required-after:galacticraftcore;" +
                    "after:galacticraftplanets;" +
                    "after:galaxyspace;" +
                    "after:exoplanets;" +
                    "after:moreplanets;" +
                    "after:asmodeuscore;" +
                    "after:starmaker;" +
                    "after:sol"
)
public class CircularPlanet {
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Logger logger = event.getModLog();
    }
}
