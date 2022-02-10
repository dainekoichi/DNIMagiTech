package dainekoichi.dnimagitech.datagen

import dainekoichi.dnimagitech.DniMagiTech
import dainekoichi.dnimagitech.ModRegistry
import net.minecraft.data.DataGenerator
import net.minecraftforge.client.model.generators.ItemModelProvider
import net.minecraftforge.common.data.ExistingFileHelper

class MagitechItemModels(gen: DataGenerator, helper: ExistingFileHelper) : ItemModelProvider(gen, DniMagiTech.ID, helper) {
    override fun registerModels() {
        withExistingParent(ModRegistry.KRYSTA_ORE_OVERWORLD.get().registryName!!.path, modLoc("block/krysta_ore_overworld"))
        withExistingParent(ModRegistry.KRYSTA_ORE_DEEPSLATE.get().registryName!!.path, modLoc("block/krysta_ore_deepslate"))
    }

}