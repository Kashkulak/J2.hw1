package com.company;

public class Amazons extends Entity {
    private int age;
    private String origin;
    private Weapon weapon;


    public Amazons(String name, Weapon weapon1, Appearance appearance, int age, String origin, Weapon weapon) {
        super(name, appearance);
        this.age = age;
        this.origin = origin;
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
//                "Сила: "+weapon.getLassoOfTruth()+
//                "\nЗащита: "+weapon.getIndestructibleBracelets();
    }

    public int getAge() {
        return age;
    }

    public String getOrigin() {
        return origin;
    }

    public final void AbilityToSpeak(String speak, String withWhom) {
        System.out.println("Говорит: " + speak +
                "\nС ");
    }

    public void AbilityToSpeak(String speak) {
        System.out.println("Орёт: " + speak + "!");
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "\nВозраст: " + age +
                "\nПроисхождение: " + origin + "\nОружия: " + weapon.getIndestructibleBracelets() + weapon.getLassoOfTruth();
    }
}
