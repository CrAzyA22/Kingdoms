package de.crazya22.kingdoms.player;

import java.util.HashMap;

public class PlayerMirror {
    double health;
    double intelligence;
    double defense;
    double critChance;
    double critDamage;
    double damage;
    double strength;
    double speed;
    double luck;
    double breakingSpeed;
    double fortune;
    double spellbound;
    double manaRegen;

    PlayerMirror(double health, double intelligence, double defense, double critChance, double critDamage, double damage, double strength, double speed, double luck, double breakingSpeed, double fortune, double spellbound, double manaRegen) {
        this.health = health;
        this.intelligence = intelligence;
        this.defense = defense;
        this.critChance = critChance;
        this.critDamage = critDamage;
        this.damage = damage;
        this.strength = strength;
        this.speed = speed;
        this.luck = luck;
        this.breakingSpeed = breakingSpeed;
        this.fortune = fortune;
        this.spellbound = spellbound;
        this.manaRegen = manaRegen;
    }

    public HashMap<String, Double> getStats() {

        HashMap<String, Double> stats = new HashMap<>();

        stats.put("health", this.health);
        stats.put("intelligence", this.intelligence);
        stats.put("defense", this.defense);
        stats.put("critChance", this.critChance);
        stats.put("critDamage", this.critDamage);
        stats.put("damage", this.damage);
        stats.put("strength", this.strength);
        stats.put("speed", this.speed);
        stats.put("luck", this.luck);
        stats.put("breakingSpeed", this.breakingSpeed);
        stats.put("fortune", this.fortune);
        stats.put("spellbound", this.spellbound);
        stats.put("manaRegen", this.manaRegen);

        return stats;
    }

}
