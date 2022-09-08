package com.lolacastillo.shinmegamitenseiapi.data;

import java.util.List;

public class Demon {
    private String name;
    private String type;
    private String alignment;
    private Stats stats;

    public Demon(String name, String type, String alignment, Stats stats, List<Ability> abilities) {
        this.name = name;
        this.type = type;
        this.alignment = alignment;
        this.stats = stats;
        this.abilities = abilities;
    }

    private List<Ability> abilities;


}
