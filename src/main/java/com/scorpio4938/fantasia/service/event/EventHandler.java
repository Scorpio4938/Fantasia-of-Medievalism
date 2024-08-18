package com.scorpio4938.fantasia.service.event;

import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class EventHandler {
    public static void onPlayerJoin(ServerPlayerEntity player) {
        player.sendMessage(Text.literal("Welcome to the server, " + player.getName().getString() + "!"), false);
    }

    public static void registerEventHandler() {
        ServerPlayerEvents.AFTER_RESPAWN.register(((oldPlayer, newPlayer, alive) -> {
            onPlayerJoin(newPlayer);
        }));
    }
}
