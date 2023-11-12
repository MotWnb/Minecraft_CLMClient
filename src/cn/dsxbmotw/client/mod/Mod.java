package cn.dsxbmotw.client.mod;

public class Mod {
    private final String name;
    private Boolean enable;

    private int key;

    public Mod(String name) {
        this.name = name;
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
    public void render() {

    }
    public void update() {

    }


}
