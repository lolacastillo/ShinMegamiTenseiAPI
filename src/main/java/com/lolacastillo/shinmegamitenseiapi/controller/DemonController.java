package com.lolacastillo.shinmegamitenseiapi.controller;

import com.lolacastillo.shinmegamitenseiapi.data.Ability;
import com.lolacastillo.shinmegamitenseiapi.data.Demon;
import com.lolacastillo.shinmegamitenseiapi.data.Stats;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value ="/api/demons", produces = "application/json")
public class DemonController {
    List<Demon> demons = new ArrayList<>();
//    @GetMapping("/")
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public List<Demon> getAll() {
//
//        List<Ability> werecatAb = new ArrayList<Ability>();
//        Stats werecatStats = new Stats(23,130,56,6,49,18,26,15,8,11,14,10,7,10,14,8);
//        werecatAb.add(new Ability("Haplima", 2));
//        werecatAb.add(new Ability("Taru-kai", 4));
//
//        demons.add(new Demon("Werecat","Jujin","Neutral", werecatStats , werecatAb));
//
//        List<Ability> jakiAb = new ArrayList<Ability>();
//        Stats jakiStats = new Stats(28,129,28,15,57,17,35,14,8,7,15,6,7,13,13,7);
//        jakiAb.add(new Ability("Bufula", 8));
//        jakiAb.add(new Ability("Maha-Bufula", 11));
//
//        demons.add(new Demon("Jaki","Wendigo","Law", jakiStats, jakiAb));
//
//        List<Ability> ArchangelAb = new ArrayList<Ability>();
//        Stats ArchangelStats = new Stats(34,323,140,27,78,17,37,14,14,14,20,12,12,12,12,12);
//        ArchangelAb.add(new Ability("Agirao", 7));
//        ArchangelAb.add(new Ability("Hanma", 5));
//        ArchangelAb.add(new Ability("Diarama", 4));
//
//        demons.add(new Demon("Archangel","Tenshi","27", ArchangelStats, ArchangelAb));
//
//        List<Ability> HakutakuAb = new ArrayList<Ability>();
//        Stats HakutakuStats = new Stats(22,171,51,15,54,16,16,26,11,7,16,6,10,10,12,12);
//        ArchangelAb.add(new Ability("Diarama", 4));
//        ArchangelAb.add(new Ability("Torfuri", 2));
//        ArchangelAb.add(new Ability("Parala-d", 6));
//
//        demons.add(new Demon("Hakutaku","Seijuu","Law", HakutakuStats, HakutakuAb));
//
//        List<Ability> IsoraAb = new ArrayList<Ability>();
//        Stats IsoraStats = new Stats(34,313,131,20,63,23,32,20,15,13,15,11,14,10,19,7);
//        ArchangelAb.add(new Ability("Zionga", 9));
//        ArchangelAb.add(new Ability("Diarama", 4));
//        ArchangelAb.add(new Ability("Wall of MP", 1));
//
//        demons.add(new Demon("Isora","Youma","Law", IsoraStats, IsoraAb));
//
//        List<Ability> chireisAb = new ArrayList<Ability>();
//        Stats chireiStats = new Stats(35,213,72,19,77,15,47,11,13,10,19,8,12,17,10,10);
//        chireisAb.add(new Ability("Hanma", 5));
//        chireisAb.add(new Ability("Diarama", 4));
//        chireisAb.add(new Ability("Parala", 6));
//
//        demons.add(new Demon("Kwanca","Chirei","Law", chireiStats, chireisAb));
//
//        List<Ability> buccaboAb = new ArrayList<Ability>();
//        Stats buccaboStats = new Stats(,213,72,19,77,15,47,11,13,10,19,8,12,17,10,10);
//        buccaboAb.add(new Ability("Bufula", 8));
//        buccaboAb.add(new Ability("Maha-buf", 6));
//        buccaboAb.add(new Ability("Raku-kaj",4);
//        demons.add(new Demon("Kwanca","Chirei","Law", chireiStats, chireisAb));
//
//        return demons;
//    }
}
