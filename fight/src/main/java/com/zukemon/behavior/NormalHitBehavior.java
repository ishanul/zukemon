package com.zukemon.behavior;

import com.zukemon.character.Zukemon;
import com.zukemon.fight.CriticalHit;

public class NormalHitBehavior implements HitBehavior{
    private CriticalHit criticalHit;

    public void setCriticalHitBehavior(CriticalHit criticalHit) {
        this.criticalHit = criticalHit;
    }

    public int performHit(Zukemon zukemon) {
        if(zukemon.getChanceOfCriticalHit() > 0 && criticalHit.isCriticalHit(zukemon.getChanceOfCriticalHit())){
            return zukemon.getDamage() * 2;
        }
        return zukemon.getDamage();
    }
}
