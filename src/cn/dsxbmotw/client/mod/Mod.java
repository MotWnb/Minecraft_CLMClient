package cn.dsxbmotw.client.mod;

import cn.dsxbmotw.client.mod.mods.Category;

public class Mod {
    private final String name;
    private Boolean enable;

    private final Category category;

    private int key;

    public Mod(String name, Category category) {
        this.name = name;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public Boolean isEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }
    public Category getCategory() {
        return category;
    }

    public void draw() {

    }
    public void update() {

    }
    public void key(int key) {
    }

}
