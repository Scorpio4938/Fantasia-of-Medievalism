package com.scorpio4938.fantasia.util;

import com.scorpio4938.fantasia.Fantasia;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> CITY_CRAFTING_BLOCKS = createTag("city_crafting_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Fantasia.MOD_ID, name));
        }
    }

    public static class Items {

    }
}
