package dainekoichi.dnimagitech

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import thedarkcolour.kotlinforforge.forge.MOD_BUS
import thedarkcolour.kotlinforforge.forge.runForDist

@Mod(DniMagiTech.ID)
object DniMagiTech {
    const val ID = "dnimagitech"

    val LOGGER = LogManager.getLogger()

    init {
        LOGGER.log(Level.INFO, "DNI MagiTech loading...")

        ModRegistry.BLOCKS.register(MOD_BUS)
        ModRegistry.ITEMS.register(MOD_BUS)

        val obj = runForDist(
            clientTarget = {
                MOD_BUS.addListener(::onClientSetup)
            },
            serverTarget = {
                MOD_BUS.addListener(::onServerSetup)
            }
        )

        println(obj)
    }

    private fun onClientSetup(event: FMLClientSetupEvent) {
        LOGGER.log(Level.INFO, "Client-side setup...")
    }

    private fun onServerSetup(event: FMLDedicatedServerSetupEvent) {
        LOGGER.log(Level.INFO, "Server-side setup...")
    }
}