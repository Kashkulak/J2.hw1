package com.company;

public class Entity {
    private String name;
    private Appearance appearance;

    public Entity(String name, Appearance appearance) {
        this.name = name;
        this.appearance = appearance;
    }

    public String getName() {
        return name;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public String printInfo() {
        return "__________________________" + "\nИмя: " + name + "\nВнешность: " + appearance;
    }
}
