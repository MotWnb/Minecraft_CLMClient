package cn.dsxbmotw.client.mod.mods.render;

import cn.dsxbmotw.client.mod.Mod;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;

public class TitleOverride extends Mod {
    public TitleOverride() {
        super("TitleOverride");
    }

    @Override
    public void update() {
        Display.setTitle(Minecraft.getDebugFPS() + "fps");
    }
}
