package me.sirmonkeyboy.bank;

import me.sirmonkeyboy.bank.Commands.CommandManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import net.milkbowl.vault.economy.Economy;

import java.util.Objects;

public final class Bank extends JavaPlugin {

    private static Economy econ = null;

    @Override
    public void onEnable() {
        if (!setupEconomy() ) {
            System.out.println("Disabled due to no Vault dependency found!");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        Objects.requireNonNull(getCommand("Bank")).setExecutor(new CommandManager(this));
        getLogger().info("Bank has started");
    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }

        econ = rsp.getProvider();
        //noinspection ConstantValue
        return econ != null;
    }

    public static Economy getEconomy() {
        return econ;
    }

    @Override
    public void onDisable() {
        getLogger().info("Bank has stopped");
    }
}