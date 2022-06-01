package org.dragonitemc.dragonshophook;

import com.ericlam.mc.eld.*;
import org.dragonitemc.dragonshophook.dshop.LocalWrldPrice;
import org.dragonitemc.dragonshophook.dshop.LocalWrldReward;
import org.dragonitemc.dragonshophook.dshop.WRLDPrice;
import org.dragonitemc.dragonshophook.dshop.WRLDReward;

@ELDBukkit(
        registry = DragonEconomyShopHookRegistry.class,
        lifeCycle = DragonEconomyShopHookLifeCycle.class
)
public class DragonEconomyShopHook extends ELDBukkitPlugin {

    @Override
    public void bindServices(ServiceCollection collection) {

        collection.addSingleton(WRLDPrice.class);
        collection.addSingleton(WRLDReward.class);
        collection.addSingleton(LocalWrldPrice.class);
        collection.addSingleton(LocalWrldReward.class);

    }

    @Override
    protected void manageProvider(BukkitManagerProvider provider) {

    }

}
