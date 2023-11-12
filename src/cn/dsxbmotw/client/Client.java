package cn.dsxbmotw.client;

import cn.dsxbmotw.client.mod.ModManager;
import cn.dsxbmotw.client.mod.mods.config.ConfigManager;
import org.lwjgl.opengl.Display;

public class Client {
    public static String NAME = "CoolLinkMC";
    public static String VERSION = "0.0.1";
    public static ModManager modManager;

    public static ConfigManager configManager;

    public static void start(){
        modManager = new ModManager();
        configManager = new ConfigManager();
        modManager.load();
        configManager.load();
        Display.setTitle(NAME + " " + VERSION);
    }
    public static void stop(){
        configManager.save();
    }
}
