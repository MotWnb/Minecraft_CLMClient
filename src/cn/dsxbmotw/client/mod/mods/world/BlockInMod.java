package cn.dsxbmotw.client.mod.mods.world;

import cn.dsxbmotw.client.Client;
import cn.dsxbmotw.client.mod.Mod;
import cn.dsxbmotw.client.mod.api.CalcDirectionYawAndPitch;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BlockInMod extends Mod {
    public BlockInMod() {
        super("BlockIn");
    }

    @Override
    public void update() {
        final List<double[]> posList = new ArrayList<>();
        posList.add(new double[]{Minecraft.getMinecraft().thePlayer.posX - 1,Minecraft.getMinecraft().thePlayer.posY,Minecraft.getMinecraft().thePlayer.posZ});
        posList.add(new double[]{Minecraft.getMinecraft().thePlayer.posX + 1,Minecraft.getMinecraft().thePlayer.posY,Minecraft.getMinecraft().thePlayer.posZ});
        posList.add(new double[]{Minecraft.getMinecraft().thePlayer.posX,Minecraft.getMinecraft().thePlayer.posY,Minecraft.getMinecraft().thePlayer.posZ - 1});
        posList.add(new double[]{Minecraft.getMinecraft().thePlayer.posX,Minecraft.getMinecraft().thePlayer.posY,Minecraft.getMinecraft().thePlayer.posZ + 1});
        posList.add(new double[]{Minecraft.getMinecraft().thePlayer.posX - 1,Minecraft.getMinecraft().thePlayer.posY + 1,Minecraft.getMinecraft().thePlayer.posZ});
        posList.add(new double[]{Minecraft.getMinecraft().thePlayer.posX + 1,Minecraft.getMinecraft().thePlayer.posY + 1,Minecraft.getMinecraft().thePlayer.posZ});
        posList.add(new double[]{Minecraft.getMinecraft().thePlayer.posX,Minecraft.getMinecraft().thePlayer.posY + 1,Minecraft.getMinecraft().thePlayer.posZ - 1});
        posList.add(new double[]{Minecraft.getMinecraft().thePlayer.posX,Minecraft.getMinecraft().thePlayer.posY + 1,Minecraft.getMinecraft().thePlayer.posZ + 1});
        for (double[] pos : posList) {
            double[] yawAndPitch = CalcDirectionYawAndPitch.calcPosition(pos);
            System.out.println(Arrays.toString(yawAndPitch));
            float yaw = (float) yawAndPitch[0];
            float pitch = (float) yawAndPitch[1];
            Minecraft.getMinecraft().thePlayer.setRotation(yaw,pitch);
            Minecraft.getMinecraft().thePlayer.swingItem();
            Minecraft.getMinecraft().entityRenderer.itemRenderer.resetEquippedProgress();

        }
        this.setEnable(Boolean.FALSE);
    }
}
