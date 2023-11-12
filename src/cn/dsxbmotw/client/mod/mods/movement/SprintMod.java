package cn.dsxbmotw.client.mod.mods.movement;

import cn.dsxbmotw.client.mod.Mod;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class SprintMod extends Mod {

    public SprintMod() {
        super("Sprint");
        setKey(Keyboard.KEY_V);
    }

    @Override
    public void update() {
        if (Minecraft.getMinecraft().gameSettings.keyBindForward.isPressed()
                || !Minecraft.getMinecraft().thePlayer.isInWater()) {
            Minecraft.getMinecraft().thePlayer.setSprinting(true);
        }

    }
}
