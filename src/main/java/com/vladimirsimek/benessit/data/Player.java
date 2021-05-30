package com.vladimirsimek.benessit.data;

public class Player {
    private String characterClass;
    private String characterName;
    private int level;
    private int xpCount;

    public Player(String characterClass, String characterName) {
        this.characterClass = characterClass;
        this.characterName = characterName;
        this.level = 0;
        this.xpCount = 0;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXpCount() {
        return xpCount;
    }

    public void setXpCount(int xpCount) {
        this.xpCount = xpCount;
    }
}
