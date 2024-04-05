package com.FuBangkun.circularplanet;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
    modid = "circularplanet",
    name = "Circular Planet",
    version = "1.0.0",
    acceptedMinecraftVersions = "[1.12.2]",
    dependencies =
        "required-after:forge@[14.23.5.2860,);" +
        "required-after:galacticraftcore@[4.0.6,);" +
        "after:galaxyspace;" +
        "after:exoplanets;" +
        "after:moreplanets;" +
        "after:asmodeuscore"
)
public class CircularPlanet {
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Logger logger = event.getModLog();
    }
}
