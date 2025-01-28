package de.crazya22.kingdoms.stats;

public enum Stat {
    HEALTH("health", "Health", "❤"),
    DEFENSE("defense", "Defense", "⛨"),
    INTELLIGENCE("intelligence", "Intelligence", "✎"),
    MANA_REGENERATION("mana_regen", "Mana Regeneration", "ɸ"),
    CRIT_CHANCE("crit_chance", "Crit Chance", "☣"),
    CRIT_DAMAGE("crit_damage", "Crit Damage", "☠"),
    DAMAGE("damage", "Damage", "⚔"),
    STRENGTH("strength", "Strength", "⚒"),
    SPEED("speed", "Speed", "⚡"),
    LUCK("luck", "Luck", "♠"),
    BREAKING_SPEED("breaking_speed", "Breaking Speed", "⛏"),
    FORTUNE("fortune", "Fortune", "☘"),
    SPELLBOUND("spellbound", "Spellbound", "۞");

    final String icon;
    final String displayName;

    Stat(String id, String displayName, String icon) {
        this.displayName = displayName;
        this.icon = icon;
    }
}
