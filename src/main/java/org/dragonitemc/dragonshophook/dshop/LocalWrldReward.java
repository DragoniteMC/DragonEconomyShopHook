package org.dragonitemc.dragonshophook.dshop;

import org.bukkit.entity.Player;
import org.dragonitemc.dragoneconomy.api.EconomyService;
import org.dragonitemc.dragoneconomy.config.DragonEconomyMessage;
import org.dragonitemc.dragonshop.api.AsyncRewardTask;

import javax.inject.Inject;
import java.util.concurrent.CompletableFuture;

public final class LocalWrldReward extends AsyncRewardTask<Object> {


    @Inject
    private DragonEconomyMessage msg;
    @Inject
    private EconomyService economyService;

    public LocalWrldReward() {
        super("wrld");
    }

    @Override
    public CompletableFuture<Void> giveRewardAsync(Object c, Player player) {
        var price = LocalWrldPrice.toDouble(c, player);
        return CompletableFuture.runAsync(() -> {
            var result = economyService.depositPlayer(player.getUniqueId(), price);
            player.sendMessage(msg.getResultMessage(result));
        });
    }


}