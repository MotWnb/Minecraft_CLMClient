package cn.dsxbmotw.client.mod.mods.config;

import cn.dsxbmotw.client.Client;
import net.minecraft.client.Minecraft;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Config {
    private final String name;

    public Config(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Path getPath() {
        return Paths.get(Minecraft.getMinecraft().mcDataDir.getAbsolutePath(), Client.NAME, "config", name + ".json");
    }

    public void load() {

    }

    public void save() {

    }
}
