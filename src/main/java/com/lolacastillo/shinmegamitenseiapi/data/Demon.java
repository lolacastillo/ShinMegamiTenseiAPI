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
    private String alignment;

//    private Stats stats;
//    private List<Ability> abilities;


}
