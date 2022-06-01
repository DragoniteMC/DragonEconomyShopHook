package org.dragonitemc.dragonshophook;

import com.ericlam.mc.eld.bukkit.ELDLifeCycle;
import org.bukkit.plugin.java.JavaPlugin;
import org.dragonitemc.dragonshop.api.ShopTaskService;
import org.dragonitemc.dragonshophook.dshop.LocalWrldPrice;
import org.dragonitemc.dragonshophook.dshop.LocalWrldReward;
import org.dragonitemc.dragonshophook.dshop.WRLDPrice;
import org.dragonitemc.dragonshophook.dshop.WRLDReward;

import javax.inject.Inject;

public class DragonEconomyShopHookLifeCycle implements ELDLifeCycle {

    @Inject
    private LocalWrldPrice localWrldPrice;
    @Inject
    private LocalWrldReward localWrldReward;
    @Inject
    private WRLDPrice wrldPrice;
    @Inject
    private WRLDReward wrldReward;

    @Inject
    private ShopTaskService taskService;

    @Override
    public void onEnable(JavaPlugin plugin) {
        taskService.addPriceTask(localWrldPrice);
        taskService.addRewardTask(localWrldReward);

        taskService.addPriceTask(wrldPrice);
        taskService.addRewardTask(wrldReward);
    }

    @Override
    public void onDisable(JavaPlugin plugin) {

    }
}
