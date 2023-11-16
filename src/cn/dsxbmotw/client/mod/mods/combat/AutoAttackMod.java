package cn.dsxbmotw.client.mod.mods.combat;

import cn.dsxbmotw.client.mod.Mod;
import cn.dsxbmotw.client.mod.api.CalcDirectionYawAndPitch;
import cn.dsxbmotw.client.mod.mods.Category;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.input.Keyboard;

import java.util.Random;


public class AutoAttackMod extends Mod {
    public AutoAttackMod() {
        super("AutoAttack", Category.COMBAT);
        setKey(Keyboard.KEY_R);
    }

    @Override
    public void update() {
        double probability = 0.4;
        Random random = new Random();
        double randomNumber = random.nextDouble();
        if (randomNumber < probability) {
            for (Entity entity : Minecraft.getMinecraft().theWorld.loadedEntityList) {

                if (entity instanceof EntityLivingBase) {
                    EntityLivingBase livingBase = (EntityLivingBase) entity;
                    if (!livingBase.equals(Minecraft.getMinecraft().thePlayer) && livingBase.getDistanceToEntity(Minecraft.getMinecraft().thePlayer) <= 3 && livingBase.getHealth() > 0 && livingBase.canEntityBeSeen(Minecraft.getMinecraft().thePlayer)) {
                        double[] yawAndPitch = CalcDirectionYawAndPitch.calcEntity(entity);

                        float yaw = (float) yawAndPitch[0];
                        float pitch = (float) yawAndPitch[1];

                        Minecraft.getMinecraft().thePlayer.rotationYaw = yaw;
                        Minecraft.getMinecraft().thePlayer.rotationPitch = pitch;
                        Minecraft.getMinecraft().clickMouse();
                    }
                }
            }
        }


    }


}
