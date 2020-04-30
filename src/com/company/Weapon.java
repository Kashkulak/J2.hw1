package com.company;

public class Weapon {
    private String lassoOfTruth;
    private String indestructibleBracelets;

    public Weapon(String lassoOfTruth, String indestructibleBracelets) {
        this.lassoOfTruth = lassoOfTruth;
        this.indestructibleBracelets = indestructibleBracelets;
    }

    public String getLassoOfTruth() {
        return "\nЗаставляет говорить правду";
    }

    public String getIndestructibleBracelets() {
        return "\nПри прикосновении выделяет световую защиту";
    }
}
