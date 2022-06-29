package com.zukemon.fight;

import com.zukemon.behavior.HitBehavior;
import com.zukemon.behavior.HitBehaviorFactory;
import com.zukemon.character.Zukemon;
import com.zukemon.playground.ZukemonDen;

public class Fight {

    CriticalHit criticalHit;

    public Fight(CriticalHit criticalHit) {
        this.criticalHit = criticalHit;
    }

    /**
     * Blastoise #9 Water Damage 258
     * Mew #151 Psychic Damage 150 (10% chance of critical hit)
     * Wartortle #8 Water Damage 300
     * Mudkip #258 Water Damage 234
     * Pikachu #25 Electric Damage 135
     * Psyduck #54 Water Damage 127 (20% chance of critical hit)
     * Krookodile #553 Dark No Damage -> It is the team lead, so he can call his team members to arms. Add the
     * damage of all other Zukemons
     *
     * @param attackerType
     */
    public int hit(int attackerType) {

        Zukemon zukemon = ZukemonDen.getZukemon(attackerType);
        HitBehavior hitBehavior = HitBehaviorFactory.getBehavior(zukemon);
        hitBehavior.setCriticalHitBehavior(criticalHit);
        zukemon.setHitBehavior(hitBehavior);

        return zukemon.performHit();
    }
}
