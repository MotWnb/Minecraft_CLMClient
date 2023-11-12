package cn.dsxbmotw.client.mod.api;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

public class CalcDirectionYawAndPitch {

    public static double wrapAngle(double angle, double min, double max) {
        double range = max - min;
        while (angle < min || angle > max) {
            if (angle < min) {
                angle += range;
            }
            if (angle > max) {
                angle -= range;
            }
        }
        return angle;
    }

    public static double[] calcEntity(Entity entity) {
        double[] playerPos = {Minecraft.getMinecraft().thePlayer.posX, Minecraft.getMinecraft().thePlayer.posY + Minecraft.getMinecraft().thePlayer.getEyeHeight(), Minecraft.getMinecraft().thePlayer.posZ};
        double[] entityPos = {entity.posX, entity.posY, entity.posZ};

        double dx = entityPos[0] - playerPos[0];
        double dy = entityPos[1] - playerPos[1];
        double dz = entityPos[2] - playerPos[2];

        // 计算yaw（水平方向旋转角度）
        double yaw = Math.toDegrees(Math.atan2(dz, dx));

        // 计算pitch（垂直方向旋转角度）
        double horizontalDistance = Math.sqrt(dx * dx + dz * dz);
        double pitch = Math.toDegrees(Math.atan2(dy, horizontalDistance));

        // 将yaw和pitch限制在特定范围内
        yaw = wrapAngle(yaw, -180, 180) - 90;
        pitch = -wrapAngle(pitch, -90, 90);

        return new double[]{yaw, pitch};
    }

    public static double[] calcPosition(double[] Pos) {
        double[] playerPos = {Minecraft.getMinecraft().thePlayer.posX, Minecraft.getMinecraft().thePlayer.posY + Minecraft.getMinecraft().thePlayer.getEyeHeight(), Minecraft.getMinecraft().thePlayer.posZ};

        double dx = Pos[0] - playerPos[0];
        double dy = Pos[1] - playerPos[1];
        double dz = Pos[2] - playerPos[2];

        // 计算yaw（水平方向旋转角度）
        double yaw = Math.toDegrees(Math.atan2(dz, dx));

        // 计算pitch（垂直方向旋转角度）
        double horizontalDistance = Math.sqrt(dx * dx + dz * dz);
        double pitch = Math.toDegrees(Math.atan2(dy, horizontalDistance));

        // 将yaw和pitch限制在特定范围内
        yaw = wrapAngle(yaw, -180, 180) - 90;
        pitch = -wrapAngle(pitch, -90, 90);

        return new double[]{yaw, pitch};
    }

}
