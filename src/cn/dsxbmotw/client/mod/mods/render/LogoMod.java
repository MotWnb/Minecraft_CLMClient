package cn.dsxbmotw.client.mod.mods.render;

import cn.dsxbmotw.client.Client;
import cn.dsxbmotw.client.mod.Mod;
import cn.dsxbmotw.client.mod.mods.Category;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;

import java.awt.*;

public class LogoMod extends Mod {
    public LogoMod() {
        super("Logo", Category.RENDER);
    }

    @Override
    public void draw() {
        ScaledResolution sr= new ScaledResolution(Minecraft.getMinecraft());
        String text = Client.NAME + " | " + Client.VERSION;
        FontRenderer font = Minecraft.getMinecraft().fontRendererObj;
        font.drawString(text, 0, 0, new Color(40, 86, 20).getRGB());
    }
}
