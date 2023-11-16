package cn.dsxbmotw.client.mod.mods.movement;

import cn.dsxbmotw.client.mod.Mod;
import cn.dsxbmotw.client.mod.mods.Category;
import net.minecraft.client.Minecraft;

public class SprintMod extends Mod {

    public SprintMod() {
        super("Sprint", Category.MOVEMENT);
    }

    @Override
    public void update() {
        if (Minecraft.getMinecraft().gameSettings.keyBindForward.isKeyDown()
                && !Minecraft.getMinecraft().thePlayer.isInWater()) {
            Minecraft.getMinecraft().thePlayer.setSprinting(true);
            if (Minecraft.getMinecraft().thePlayer.onGround) {
                Minecraft.getMinecraft().thePlayer.jump();
            }
        }

    }
}
