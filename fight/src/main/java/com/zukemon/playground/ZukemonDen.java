package com.zukemon.playground;

import com.zukemon.behavior.HitBehavior;
import com.zukemon.behavior.HitBehaviorFactory;
import com.zukemon.character.Zukemon;
import com.zukemon.fight.CriticalHit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ZukemonDen {
    private static Map<Integer, Zukemon> zukemons = new HashMap<Integer, Zukemon>();

    static {
        zukemons.put(9, new Zukemon(9, 258, 0));
        zukemons.put(151, new Zukemon(151, 150, 10));
        zukemons.put(8, new Zukemon(8, 300, 0));
        zukemons.put(258, new Zukemon(258, 234, 0));
        zukemons.put(25, new Zukemon(25, 135, 0));
        zukemons.put(54, new Zukemon(54, 127, 20));
        zukemons.put(553, new Zukemon(553, 0, 0));

    }

    public static Zukemon getZukemon(int type, CriticalHit criticalHit) {
        Zukemon zukemon = zukemons.get(type);
        HitBehavior hitBehavior = HitBehaviorFactory.getBehavior(zukemon, criticalHit);
        zukemon.setHitBehavior(hitBehavior);
        return zukemon;
    }

    public static Collection<Zukemon> getAllMembers() {
        return zukemons.values();
    }
}
