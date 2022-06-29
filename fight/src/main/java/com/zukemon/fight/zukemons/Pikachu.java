package com.zukemon.fight.zukemons;

import com.zukemon.fight.Zukemon;

public class Pikachu implements Zukemon {
    @Override
    public int hit() {
        return 135;
    }

    @Override
    public int getNumber() {
        return 25;
    }
}
