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

public class DragonEconomyShopHookLifeCycle implements ELDLifeCycle {

    @Override
    public void onEnable(JavaPlugin plugin) {
        EconomyService economyService = ELDependenci.getApi().exposeService(EconomyService.class);
        NFTokenService tokenService = ELDependenci.getApi().exposeService(NFTokenService.class);
        ShopTaskService taskService = ELDependenci.getApi().exposeService(ShopTaskService.class);
        DragonEconomyMessage message = ELDependenci.getApi().exposeService(DragonEconomyMessage.class);

        taskService.addPriceTask(new GemsPrice(economyService, message));
        taskService.addRewardTask(new GemsReward(message, economyService));

        taskService.addPriceTask(new WRLDPrice(tokenService));
        taskService.addRewardTask(new WRLDReward(tokenService));
    }

    @Override
    public void onDisable(JavaPlugin plugin) {

    }
}
