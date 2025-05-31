package name.modid.item;

import name.modid.Disenchanter;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item DISENCHANTER = registerItem("disenchanter", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Disenchanter.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Disenchanter.LOGGER.info("Registering Mod Items for" + Disenchanter.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(DISENCHANTER);
        });
    }
}
