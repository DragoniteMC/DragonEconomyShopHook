package org.dragonitemc.dragonshophook;

import com.ericlam.mc.eld.ELDBukkitPlugin;
import com.ericlam.mc.eld.ManagerProvider;
import com.ericlam.mc.eld.ServiceCollection;
import com.ericlam.mc.eld.annotations.ELDPlugin;
import org.dragonitemc.dragoneconomy.api.EconomyService;
import org.dragonitemc.dragoneconomy.api.NFTokenService;
import org.dragonitemc.dragoneconomy.config.DragonEconomyMessage;
import org.dragonitemc.dragonshophook.dshop.GemsPrice;
import org.dragonitemc.dragonshophook.dshop.GemsReward;
import org.dragonitemc.dragonshophook.dshop.WRLDPrice;
import org.dragonitemc.dragonshophook.dshop.WRLDReward;

@ELDPlugin(
        registry = DragonEconomyShopHookRegistry.class,
        lifeCycle = DragonEconomyShopHookLifeCycle.class
)
public class DragonEconomyShopHook extends ELDBukkitPlugin {

    @Override
    protected void bindServices(ServiceCollection collection) {

        collection.addSingleton(WRLDPrice.class);
        collection.addSingleton(WRLDReward.class);
        collection.addSingleton(GemsPrice.class);
        collection.addSingleton(GemsReward.class);

    }

    @Override
    protected void manageProvider(ManagerProvider provider) {

    }

}
