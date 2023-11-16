package cn.dsxbmotw.client.mod;

import cn.dsxbmotw.client.mod.mods.combat.AutoAttackMod;
import cn.dsxbmotw.client.mod.mods.draw.TabMod;
import cn.dsxbmotw.client.mod.mods.movement.SprintMod;
import cn.dsxbmotw.client.mod.mods.render.LogoMod;
import cn.dsxbmotw.client.mod.mods.render.ModListMod;
import cn.dsxbmotw.client.mod.mods.render.TitleOverride;
import cn.dsxbmotw.client.mod.mods.world.BlockInMod;
import cn.dsxbmotw.client.mod.mods.world.ScaffoldMod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModManager {
    private final List<Mod> mods = new ArrayList<>();

    public List<Mod> getMods() {
        return mods;
    }

    public void onKey(int key) {
        for (Mod enableMod : mods) {
            if (enableMod.getKey() == key) {
                enableMod.setEnable(!enableMod.isEnable());
            }
        }
    }

    public void load() {
        mods.add(new LogoMod());
        mods.add(new ModListMod());
        mods.add(new TitleOverride());
        mods.add(new SprintMod());
        mods.add(new AutoAttackMod());
        mods.add(new ScaffoldMod());
        mods.add(new BlockInMod());
        mods.add(new TabMod());
    }

    public List<Mod> getEnabledMods() {
        return mods.stream().filter(Mod::isEnable).collect(Collectors.toList());
    }
}

