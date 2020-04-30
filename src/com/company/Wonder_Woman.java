package com.company;

public final class Wonder_Woman extends Amazons {
    private String superAbilities;

    public Wonder_Woman(String name, Weapon weapon, Appearance appearance, int age, String
            origin, String superAbilities) {
        super(name, weapon, appearance, age, origin, weapon);
        this.superAbilities = superAbilities;
    }

    public String getSuperAbilities() {
        return superAbilities;
    }

    @Override
    public void AbilityToSpeak(String speak) {
        System.out.println("Говорит: " + speak + "...");
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "\nСуперспособность: " + superAbilities;
    }

    public void copying(Wonder_Woman w_m) {
        superAbilities = w_m.superAbilities;
    }
}
