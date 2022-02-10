package dainekoichi.dnimagitech.datagen

import dainekoichi.dnimagitech.DniMagiTech
import dainekoichi.dnimagitech.ModRegistry
import net.minecraft.data.DataGenerator
import net.minecraftforge.client.model.generators.BlockStateProvider
import net.minecraftforge.common.data.ExistingFileHelper

class MagitechBlockStates(gen: DataGenerator, helper: ExistingFileHelper) : BlockStateProvider(gen, DniMagiTech.ID, helper) {
    override fun registerStatesAndModels() {
        simpleBlock(ModRegistry.KRYSTA_ORE_OVERWORLD.get())
        simpleBlock(ModRegistry.KRYSTA_ORE_DEEPSLATE.get())
    }
}