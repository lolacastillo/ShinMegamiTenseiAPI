package com.lolacastillo.shinmegamitenseiapi.controller;

import com.lolacastillo.shinmegamitenseiapi.data.Ability;
import com.lolacastillo.shinmegamitenseiapi.data.Demon;
import com.lolacastillo.shinmegamitenseiapi.data.Stats;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value ="/api/demons", headers = "Accept=application/json")
public class DemonController {
    @GetMapping
    public List<Demon> getAll() {
        List<Demon> demons = new ArrayList<>();

        List<Ability> werecat = new ArrayList<Ability>();
        List<Ability> jaki = new ArrayList<Ability>();

        werecat.add(new Ability("Haplima", 2));
        werecat.add(new Ability("Taru-kai", 4));

        jaki.add(new Ability("Bufula", 8));
        jaki.add(new Ability("Maha-Bufula", 11));

        demons.add(new Demon("Werecat","Jujin","Neutral", new Stats(23,130,56,6,49,18,26,15,8,11,14,10,7,10,14,8), werecat));
        demons.add(new Demon("Jaki","Wendigo","Law", new Stats(28,129,28,15,57,17,35,14,8,7,15,6,7,13,13,7), jaki));

        return demons;
    }
}
