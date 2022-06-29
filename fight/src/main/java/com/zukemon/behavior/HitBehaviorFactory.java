package com.zukemon.behavior;

import com.zukemon.character.Zukemon;

public class HitBehaviorFactory {
    public static HitBehavior getBehavior(Zukemon zukemon){
        switch (zukemon.getType()){
            case 553:
                return new TeamLeadHitBehavior();
            default:
                return new NormalHitBehavior();

        }
    }
}
