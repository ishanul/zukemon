package com.zukemon.behavior;

import com.zukemon.character.Zukemon;
import com.zukemon.fight.CriticalHit;
import com.zukemon.playground.ZukemonDen;

public class TeamLeadHitBehavior implements  HitBehavior{
    private CriticalHit criticalHit;

    public void setCriticalHitBehavior(CriticalHit criticalHit) {
        this.criticalHit = criticalHit;
    }

    public int performHit(final Zukemon zukemon) {
        return ZukemonDen.getAllMembers().stream().filter(zm -> zm.getType() != zukemon.getType()).mapToInt( zm -> {
            HitBehavior hitBehavior = HitBehaviorFactory.getBehavior(zm);
            hitBehavior.setCriticalHitBehavior(criticalHit);
            zm.setHitBehavior(hitBehavior);

            return zm.performHit();
        }).sum();
    }

}
