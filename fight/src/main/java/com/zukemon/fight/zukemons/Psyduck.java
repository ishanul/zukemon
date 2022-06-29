package com.zukemon.fight.zukemons;

import com.zukemon.fight.CriticalHit;
import com.zukemon.fight.Zukemon;

public class Psyduck implements Zukemon {

    private static final int damage = 127;

    CriticalHit criticalHit = new CriticalHit();

    @Override
    public int hit() {
        if(criticalHit.isCriticalHit(20)) {
            return 2* damage;
        }
        return damage;
    }

    @Override
    public int getNumber() {
        return 54;
    }
}
