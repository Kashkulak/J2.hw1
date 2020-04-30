package com.company;

public class Main {

    public static void main(String[] args) {
        Entity entity = new Entity("Sparta", Appearance.CIVIL_CLOTHES);
        Wonder_Woman wonder_woman = new Wonder_Woman("Чудо женщина", new Weapon("Сила", "Защита"),
                Appearance.SUPER_CUSTOM, 35, "Древний", "Говорить с животными");
        Wonder_Woman wonder_woman1 = new Wonder_Woman("Чудо девочка", new Weapon("Сила", "Защита"),
                Appearance.CIVIL_CLOTHES, 14, "Современный", "Скорость");
        System.out.println(entity.printInfo());
        System.out.println(wonder_woman.printInfo());
        wonder_woman.AbilityToSpeak("Привет красавчик, кчау");
        System.out.println(wonder_woman1.printInfo());
        wonder_woman1.AbilityToSpeak("Здравствуйте, Мистер");
    }
}
