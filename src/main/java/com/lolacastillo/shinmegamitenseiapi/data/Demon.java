package com.lolacastillo.shinmegamitenseiapi.data;

import lombok.*;


import javax.persistence.*;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="demons")
public class Demon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = true, length = 100)
    private String name;

    @Column(nullable = true, length = 100)
    private String type;

    @Column(nullable = true, length = 100)
    private int level;

    @Column(nullable = true, length = 100)
    private int healthPoints;

    @Column(nullable = true, length = 100)
    private int magicPoints;

    @Column(nullable = true, length = 100)
    private int cPoints;

    @Column(nullable = true, length = 100)
    private String alignment;

    @Column(nullable = true, length = 100)
    private int power;

    @Column(nullable = true, length = 100)
    private int accuracy;

    @Column(nullable = true, length = 100)
    private int defense;

    @Column(nullable = true, length = 100)
    private int evade;

    @Column(nullable = true, length = 100)
    private int magicPower;

    @Column(nullable = true, length = 100)
    private int magicEffect;

    @Column(nullable = true, length = 100)
    private int strength;

    @Column(nullable = true, length = 100)
    private int intelligence;

    @Column(nullable = true, length = 100)
    private int magic;

    @Column(nullable = true, length = 100)
    private int stamina;

    @Column(nullable = true, length = 100)
    private int speed;

    @Column(nullable = true, length = 100)
    private int luck;

//    private List<Ability> abilities;


}
