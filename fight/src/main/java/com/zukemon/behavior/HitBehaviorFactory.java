package com.zukemon.behavior;

import com.zukemon.character.Zukemon;
import com.zukemon.fight.CriticalHit;

public class HitBehaviorFactory {
    public static HitBehavior getBehavior(Zukemon zukemon, CriticalHit criticalHit){
        HitBehavior hitBehavior;
        switch (zukemon.getType()){
            case 553:
                hitBehavior = new TeamLeadHitBehavior();
                break;
            default:
                hitBehavior =  new NormalHitBehavior();
        }
        hitBehavior.setCriticalHitBehavior(criticalHit);
        return hitBehavior;
    }
}
