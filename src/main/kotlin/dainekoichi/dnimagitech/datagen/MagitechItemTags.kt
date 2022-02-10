package dainekoichi.dnimagitech.datagen

import dainekoichi.dnimagitech.DniMagiTech
import dainekoichi.dnimagitech.ModRegistry
import net.minecraft.data.DataGenerator
import net.minecraft.data.tags.BlockTagsProvider
import net.minecraft.data.tags.ItemTagsProvider
import net.minecraftforge.common.Tags
import net.minecraftforge.common.data.ExistingFileHelper

class MagitechItemTags(gen: DataGenerator, blockTags: BlockTagsProvider, helper: ExistingFileHelper)
    : ItemTagsProvider(gen, blockTags, DniMagiTech.ID, helper)
{
    override fun addTags() {
        tag(Tags.Items.ORES)
            .add(ModRegistry.KRYSTA_ORE_OVERWORLD_ITEM.get())
            .add(ModRegistry.KRYSTA_ORE_DEEPSLATE_ITEM.get())
    }

    override fun getName() = "DNI MagiTech Tags"
}