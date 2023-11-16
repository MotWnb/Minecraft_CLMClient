package cn.dsxbmotw.client.mod.mods.render;

import cn.dsxbmotw.client.Client;
import cn.dsxbmotw.client.mod.Mod;
import cn.dsxbmotw.client.mod.mods.Category;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;

import java.util.List;

public class ModListMod extends Mod {
    public ModListMod() {
        super("ModList", Category.RENDER);
    }

    @Override
    public void draw() {
        ScaledResolution scaledResolution = new ScaledResolution(Minecraft.getMinecraft());
        int width = scaledResolution.getScaledWidth();
        int height = scaledResolution.getScaledHeight();

        List<Mod> enabledMods = Client.modManager.getEnabledMods();
        FontRenderer font = Minecraft.getMinecraft().fontRendererObj;
        enabledMods.sort((o1, o2) -> font.getStringWidth(o2.getName()) - font.getStringWidth(o1.getName()));

        int y = 0;
        for (Mod enableMod : enabledMods) {
            font.drawString(enableMod.getName(),width - font.getStringWidth(enableMod.getName()),y,0xFFFFFFFF);
            y += font.FONT_HEIGHT + 5;
        }
    }
}
