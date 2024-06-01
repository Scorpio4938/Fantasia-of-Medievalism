package com.scorpio4938.fantasia.item;

import com.scorpio4938.fantasia.Fantasia;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FANTASIA_MISC = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Fantasia.MOD_ID, "fantasia_misc"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.fantasia_misc"))
                    .icon(() -> new ItemStack(ModItems.WIT_COIN)).entries((displayContext, entries) -> {
                        entries.add(ModItems.WIT_COIN);
                    }).build());

    public static void registerModItemGroup() {

    }
}
