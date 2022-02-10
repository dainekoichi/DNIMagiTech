package dainekoichi.dnimagitech

import net.minecraft.world.item.*
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.material.Material
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import net.minecraftforge.registries.RegistryObject

object ModRegistry {
    val BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DniMagiTech.ID)
    val ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DniMagiTech.ID)

    val TAB_NAME = "DNI Magitech"
    val ITEM_GROUP = object : CreativeModeTab(TAB_NAME) {
        override fun makeIcon() = ItemStack(Items.DIAMOND)
    }

    private val ORE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f)
    private val ITEM_PROPERTIES = Item.Properties().tab(ITEM_GROUP)

    val KRYSTA_ORE_OVERWORLD = BLOCKS.register("krysta_ore_overworld") { Block(ORE_PROPERTIES) }
    val KRYSTA_ORE_OVERWORLD_ITEM = generateBlockItemFrom(KRYSTA_ORE_OVERWORLD)
    val KRYSTA_ORE_DEEPSLATE = BLOCKS.register("krysta_ore_deepslate") { Block(ORE_PROPERTIES) }
    val KRYSTA_ORE_DEEPSLATE_ITEM = generateBlockItemFrom(KRYSTA_ORE_DEEPSLATE)

    private fun <B : Block> generateBlockItemFrom(block: RegistryObject<B>): RegistryObject<Item> {
        return ITEMS.register(block.id.path) { BlockItem(block.get(), ITEM_PROPERTIES) }
    }


}