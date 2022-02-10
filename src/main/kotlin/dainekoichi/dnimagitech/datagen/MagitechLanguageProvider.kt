package dainekoichi.dnimagitech.datagen

import dainekoichi.dnimagitech.DniMagiTech
import dainekoichi.dnimagitech.ModRegistry
import dainekoichi.dnimagitech.ModRegistry.TAB_NAME
import net.minecraft.data.DataGenerator
import net.minecraftforge.common.data.LanguageProvider

class MagitechLanguageProvider(gen: DataGenerator, locale: String) : LanguageProvider(gen, DniMagiTech.ID, locale) {
    override fun addTranslations() {
        add("itemGroup.$TAB_NAME", "DNI MagiTech")
        add(ModRegistry.KRYSTA_ORE_OVERWORLD.get(),"Krysta-infused Stone")
        add(ModRegistry.KRYSTA_ORE_DEEPSLATE.get(), "Krysta-infused Deepslate")

    }
}