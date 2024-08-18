package com.scorpio4938.fantasia.service.debug;


import com.scorpio4938.fantasia.Fantasia;
import com.scorpio4938.fantasia.config.Configs;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DebugHandler {
    public static final Logger LOGGER = LoggerFactory.getLogger(Fantasia.MOD_ID);

    public static void printDebug(String args) {
        if (Configs.DO_DEBUG_CONSOLE) {
            LOGGER.info(args);
        }
    }

    public static void printDebug(String key, Object... args) {
        if (Configs.DO_DEBUG_CONSOLE) {
            LOGGER.info(key, args);
        }
    }

    public static void printClientMessage(String message) {
        MinecraftClient.getInstance().player.sendMessage(Text.literal(message), false);
    }
}
