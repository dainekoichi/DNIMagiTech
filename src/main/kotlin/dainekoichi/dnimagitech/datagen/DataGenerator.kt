package dainekoichi.dnimagitech.datagen

import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
object DataGenerator {
    @SubscribeEvent
    fun gatherData(event: GatherDataEvent) {
        val generator = event.generator
        val helper = event.existingFileHelper
        if (event.includeServer()) {
            //generator.addProvider(MagitechRecipes(generator))
            //generator.addProvider(MagitechLootTables(generator))
            val magitechBlockTags = MagitechBlockTags(generator, helper)
            generator.addProvider(magitechBlockTags)
            generator.addProvider(MagitechItemTags(generator, magitechBlockTags, helper))
        }
        if (event.includeClient()) {
            generator.addProvider(MagitechBlockStates(generator, helper))
            generator.addProvider(MagitechItemModels(generator, helper))
            generator.addProvider(MagitechLanguageProvider(generator, "en_us"))
        }
    }
}