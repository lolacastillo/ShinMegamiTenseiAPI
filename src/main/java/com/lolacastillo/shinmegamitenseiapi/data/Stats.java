package com.lolacastillo.shinmegamitenseiapi.data;

public class Stats {
    private int level;
    private int healthPoints;
    private int magicPoints;
    private int comp;
    private int power;
    private int accuracy;
    private int defense;
    private int evade;

    public Stats(int level, int healthPoints, int magicPoints, int comp, int power, int accuracy, int defense, int evade, int magicPower, int magicEffect, int strength, int intelligence, int magic, int stamina, int speed, int luck) {
        this.level = level;
        this.healthPoints = healthPoints;
        this.magicPoints = magicPoints;
        this.comp = comp;
        this.power = power;
        this.accuracy = accuracy;
        this.defense = defense;
        this.evade = evade;
        this.magicPower = magicPower;
        this.magicEffect = magicEffect;
        this.strength = strength;
        this.intelligence = intelligence;
        this.magic = magic;
        this.stamina = stamina;
        this.speed = speed;
        this.luck = luck;
    }

    private int magicPower;
    private int magicEffect;
    private int strength;
    private int intelligence;
    private int magic;
    private int stamina;
    private int speed;
    private int luck;
}
