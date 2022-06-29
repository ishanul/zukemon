package com.zukemon.fight.zukemons;

import com.zukemon.fight.Zukemon;

import java.util.List;

public class Krookodile implements Zukemon {

    List<Zukemon> teamMembers = List.of(new Blastoise(), new Mew(), new Wartortle(), new Mudkip(), new Pikachu(), new Psyduck());

    @Override
    public int hit() {
        int damage = 0;
        for (Zukemon zukemon: teamMembers) {
            damage += zukemon.hit();
        }
        return damage;
    }

    @Override
    public int getNumber() {
        return 553;
    }
}
