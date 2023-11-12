package cn.dsxbmotw.client.mod.mods.world;

import cn.dsxbmotw.client.Client;
import cn.dsxbmotw.client.mod.Mod;
import cn.dsxbmotw.client.mod.api.CalcDirectionYawAndPitch;
import net.minecraft.client.Minecraft;

import java.util.Arrays;


public class BlockInMod extends Mod {
    public float yawOld;
    public float pitchOld;
    public BlockInMod() {
        super("BlockIn");
    }
    @Override
    public void update() {
        switch (Minecraft.getMinecraft().thePlayer.currentIndex) {
            case 0:
                yawOld = Minecraft.getMinecraft().thePlayer.rotationYaw;
                pitchOld = Minecraft.getMinecraft().thePlayer.rotationPitch;
                double[] pos = (new double[]{Minecraft.getMinecraft().thePlayer.posX - 1, Minecraft.getMinecraft().thePlayer.posY, Minecraft.getMinecraft().thePlayer.posZ});
                double[] yawAndPitch = CalcDirectionYawAndPitch.calcPosition(pos);
                System.out.println(Arrays.toString(yawAndPitch));
                float yaw = (float) yawAndPitch[0];
                float pitch = (float) yawAndPitch[1];
                Minecraft.getMinecraft().thePlayer.setRotation(yaw, pitch);
                Minecraft.getMinecraft().thePlayer.currentIndex = 1;
                break;
            case 1:
                pos = (new double[]{Minecraft.getMinecraft().thePlayer.posX + 1, Minecraft.getMinecraft().thePlayer.posY, Minecraft.getMinecraft().thePlayer.posZ});
                yawAndPitch = CalcDirectionYawAndPitch.calcPosition(pos);
                System.out.println(Arrays.toString(yawAndPitch));
                yaw = (float) yawAndPitch[0];
                pitch = (float) yawAndPitch[1];
                Minecraft.getMinecraft().thePlayer.setRotation(yaw, pitch);
                Minecraft.getMinecraft().thePlayer.currentIndex = 2;
                Minecraft.getMinecraft().rightClickMouse();
                break;
            case 2:
                pos = (new double[]{Minecraft.getMinecraft().thePlayer.posX,Minecraft.getMinecraft().thePlayer.posY,Minecraft.getMinecraft().thePlayer.posZ - 1});
                yawAndPitch = CalcDirectionYawAndPitch.calcPosition(pos);
                System.out.println(Arrays.toString(yawAndPitch));
                yaw = (float) yawAndPitch[0];
                pitch = (float) yawAndPitch[1];
                Minecraft.getMinecraft().thePlayer.setRotation(yaw, pitch);
                Minecraft.getMinecraft().thePlayer.currentIndex = 3;
                Minecraft.getMinecraft().rightClickMouse();
                break;
            case 3:
                pos = (new double[]{Minecraft.getMinecraft().thePlayer.posX,Minecraft.getMinecraft().thePlayer.posY,Minecraft.getMinecraft().thePlayer.posZ + 1});
                yawAndPitch = CalcDirectionYawAndPitch.calcPosition(pos);
                System.out.println(Arrays.toString(yawAndPitch));
                yaw = (float) yawAndPitch[0];
                pitch = (float) yawAndPitch[1];
                Minecraft.getMinecraft().thePlayer.setRotation(yaw, pitch);
                Minecraft.getMinecraft().thePlayer.currentIndex = 4;
                Minecraft.getMinecraft().rightClickMouse();
                break;
            case 4:
                pos = (new double[]{Minecraft.getMinecraft().thePlayer.posX - 1,Minecraft.getMinecraft().thePlayer.posY + 1,Minecraft.getMinecraft().thePlayer.posZ});
                yawAndPitch = CalcDirectionYawAndPitch.calcPosition(pos);
                System.out.println(Arrays.toString(yawAndPitch));
                yaw = (float) yawAndPitch[0];
                pitch = (float) yawAndPitch[1];
                Minecraft.getMinecraft().thePlayer.setRotation(yaw, pitch);
                Minecraft.getMinecraft().thePlayer.currentIndex = 5;
                Minecraft.getMinecraft().rightClickMouse();
                break;
            case 5:
                pos = (new double[]{Minecraft.getMinecraft().thePlayer.posX + 1,Minecraft.getMinecraft().thePlayer.posY + 1,Minecraft.getMinecraft().thePlayer.posZ});
                yawAndPitch = CalcDirectionYawAndPitch.calcPosition(pos);
                System.out.println(Arrays.toString(yawAndPitch));
                yaw = (float) yawAndPitch[0];
                pitch = (float) yawAndPitch[1];
                Minecraft.getMinecraft().thePlayer.setRotation(yaw, pitch);
                Minecraft.getMinecraft().thePlayer.currentIndex = 6;
                Minecraft.getMinecraft().rightClickMouse();
                break;
            case 6:
                pos = (new double[]{Minecraft.getMinecraft().thePlayer.posX,Minecraft.getMinecraft().thePlayer.posY + 1,Minecraft.getMinecraft().thePlayer.posZ - 1});
                yawAndPitch = CalcDirectionYawAndPitch.calcPosition(pos);
                System.out.println(Arrays.toString(yawAndPitch));
                yaw = (float) yawAndPitch[0];
                pitch = (float) yawAndPitch[1];
                Minecraft.getMinecraft().thePlayer.setRotation(yaw, pitch);
                Minecraft.getMinecraft().thePlayer.currentIndex = 7;
                Minecraft.getMinecraft().rightClickMouse();
                break;
            case 7:
                pos = (new double[]{Minecraft.getMinecraft().thePlayer.posX,Minecraft.getMinecraft().thePlayer.posY + 1,Minecraft.getMinecraft().thePlayer.posZ + 1});
                yawAndPitch = CalcDirectionYawAndPitch.calcPosition(pos);
                System.out.println(Arrays.toString(yawAndPitch));
                yaw = (float) yawAndPitch[0];
                pitch = (float) yawAndPitch[1];
                Minecraft.getMinecraft().thePlayer.setRotation(yaw, pitch);
                Minecraft.getMinecraft().thePlayer.currentIndex = 8;
                Minecraft.getMinecraft().rightClickMouse();
                break;
            case 8:
                Minecraft.getMinecraft().thePlayer.setRotation(yawOld,pitchOld);
                Minecraft.getMinecraft().thePlayer.currentIndex = 0;
                this.setEnable(false);
                Minecraft.getMinecraft().rightClickMouse();


        }
    }

}
