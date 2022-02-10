package dainekoichi.dnimagitech.datagen

import dainekoichi.dnimagitech.DniMagiTech
import dainekoichi.dnimagitech.ModRegistry
import net.minecraft.data.DataGenerator
import net.minecraft.data.tags.BlockTagsProvider
import net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE
import net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL
import net.minecraftforge.common.Tags
import net.minecraftforge.common.data.ExistingFileHelper

class MagitechBlockTags(gen: DataGenerator, helper: ExistingFileHelper) : BlockTagsProvider(gen, DniMagiTech.ID, helper) {

    override fun addTags() {
        tag(MINEABLE_WITH_PICKAXE)
            .add(ModRegistry.KRYSTA_ORE_OVERWORLD.get())
            .add(ModRegistry.KRYSTA_ORE_DEEPSLATE.get())
        tag(NEEDS_IRON_TOOL)
            .add(ModRegistry.KRYSTA_ORE_OVERWORLD.get())
            .add(ModRegistry.KRYSTA_ORE_DEEPSLATE.get())
        tag(Tags.Blocks.ORES)
            .add(ModRegistry.KRYSTA_ORE_OVERWORLD.get())
            .add(ModRegistry.KRYSTA_ORE_DEEPSLATE.get())
    }

    override fun getName() = "DNI MagiTech Tags"

}