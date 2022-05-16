package org.dragonitemc.dragonshophook;

import com.ericlam.mc.eld.ELDLifeCycle;
import com.ericlam.mc.eld.ELDependenci;
import org.bukkit.plugin.java.JavaPlugin;
import org.dragonitemc.dragoneconomy.api.EconomyService;
import org.dragonitemc.dragoneconomy.api.NFTokenService;
import org.dragonitemc.dragoneconomy.config.DragonEconomyMessage;
import org.dragonitemc.dragonshop.api.ShopTaskService;
import org.dragonitemc.dragonshophook.dshop.GemsPrice;
import org.dragonitemc.dragonshophook.dshop.GemsReward;
import org.dragonitemc.dragonshophook.dshop.WRLDPrice;
import org.dragonitemc.dragonshophook.dshop.WRLDReward;

import javax.inject.Inject;

public class DragonEconomyShopHookLifeCycle implements ELDLifeCycle {

    @Inject
    private GemsPrice gemsPrice;
    @Inject
    private GemsReward gemsReward;
    @Inject
    private WRLDPrice wrldPrice;
    @Inject
    private WRLDReward wrldReward;

    @Inject
    private ShopTaskService taskService;

    @Override
    public void onEnable(JavaPlugin plugin) {
        taskService.addPriceTask(gemsPrice);
        taskService.addRewardTask(gemsReward);

        taskService.addPriceTask(wrldPrice);
        taskService.addRewardTask(wrldReward);
    }

    @Override
    public void onDisable(JavaPlugin plugin) {

    }
}
