package com.zukemon.behavior;

import com.zukemon.character.Zukemon;
import com.zukemon.fight.CriticalHit;

public interface HitBehavior {
    void setCriticalHitBehavior(CriticalHit criticalHit);
    int performHit(Zukemon zukemon);
}
