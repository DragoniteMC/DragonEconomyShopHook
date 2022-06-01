package org.dragonitemc.dragonshophook.dshop;

import org.bukkit.entity.Player;
import org.dragonitemc.dragoneconomy.api.NFTokenService;
import org.dragonitemc.dragonshop.api.RewardTask;

import javax.inject.Inject;

public class WRLDReward extends RewardTask<Object> {

    @Inject
    private NFTokenService tokenService;

    public WRLDReward() {
        super("web3_wrld");
    }


    @Override
    public void giveReward(Object c, Player player) {
        var price = LocalWrldPrice.toDouble(c, player);
        tokenService.depositToken(player, price, "&eDragonShop 的交易");
    }
}
