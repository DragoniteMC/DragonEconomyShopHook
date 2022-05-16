package org.dragonitemc.dragonshophook;

import com.ericlam.mc.eld.ELDBukkitPlugin;
import com.ericlam.mc.eld.ManagerProvider;
import com.ericlam.mc.eld.ServiceCollection;
import com.ericlam.mc.eld.annotations.ELDPlugin;

@ELDPlugin(
        registry = DragonEconomyShopHookRegistry.class,
        lifeCycle = DragonEconomyShopHookLifeCycle.class
)
public class DragonEconomyShopHook extends ELDBukkitPlugin {

    @Override
    protected void manageProvider(ManagerProvider provider) {

    }

    @Override
    protected void bindServices(ServiceCollection collection) {

    }
}
