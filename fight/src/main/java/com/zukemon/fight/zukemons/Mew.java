package com.zukemon.fight.zukemons;

import com.zukemon.fight.CriticalHit;
import com.zukemon.fight.Zukemon;

public class Mew implements Zukemon {
    private static final int damage = 150;

    CriticalHit criticalHit = new CriticalHit();

    @Override
    public int hit() {
        if(criticalHit.isCriticalHit(10)) {
            return 2* damage;
        }
        return damage;
    }

    @Override
    public int getNumber() {
        return 151;
    }
}
