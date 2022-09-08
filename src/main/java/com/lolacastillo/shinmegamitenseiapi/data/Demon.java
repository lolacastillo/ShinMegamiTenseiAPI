package com.lolacastillo.shinmegamitenseiapi.data;

import lombok.*;


import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Demon {
    private String name;
    private String type;
    private String alignment;
    private Stats stats;
    private List<Ability> abilities;


}
