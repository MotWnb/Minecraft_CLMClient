package cn.dsxbmotw.client.mod.mods.draw;

import cn.dsxbmotw.client.mod.Mod;
import cn.dsxbmotw.client.mod.mods.Category;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import org.lwjgl.input.Keyboard;

import java.awt.*;

public class TabMod extends Mod {
    private int currentCategory = 0;

    public TabMod() {
        super("Tab", Category.DRAW);
    }
    @Override
    public void key(int key) {
        if (key == Keyboard.KEY_UP) {
            if (currentCategory > 0) {
                currentCategory--;
            } else {
                currentCategory = Category.values().length - 1;
            }
        } else if (key == Keyboard.KEY_DOWN) {
            if (currentCategory < Category.values().length - 1) {
                currentCategory++;
            } else {
                currentCategory = 0;
            }
        }
    }
    @Override
    public void draw() {
        drawTab(0, 0);
    }

    private void drawTab(int x, int y) {
        FontRenderer fontRendererObj = Minecraft.getMinecraft().fontRendererObj;
        Gui.drawRect(x, y
                , x + fontRendererObj.getStringWidth(Category.MOVEMENT.name())
                , y + Category.values().length * fontRendererObj.FONT_HEIGHT
                , new Color(40, 200, 200, 127).getRGB());
        int index = y;
        Category[] values = Category.values();
        for (int i = 0; i < values.length; i++) {
            Category value = values[i];
            if (i == currentCategory) {
                Gui.drawRect(x, index
                        , x + fontRendererObj.getStringWidth(Category.MOVEMENT.name())
                        , index + fontRendererObj.FONT_HEIGHT
                        , new Color(40, 200, 200, 255).getRGB());
            }

            fontRendererObj.drawString(value.name(), x, index, 0xFFFFFFFF);
            index += fontRendererObj.FONT_HEIGHT;
        }
    }
}
