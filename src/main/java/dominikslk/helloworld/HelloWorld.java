package dominikslk.helloworld;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class HelloWorld extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("HelloWorld plugin has been loaded!");

    }

    @Override
    public void onDisable() {
        getLogger().info("HelloWorld plugin has been unloaded!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("helloworld")) {
            sender.sendMessage("Hello World!");
            return true;
        }  //If this has happened the function will return true.
        // If this hasn't happened the value of false will be returned.
        return false;
    }
}
