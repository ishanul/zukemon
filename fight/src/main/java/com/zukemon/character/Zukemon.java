package com.zukemon.character;

import com.zukemon.behavior.HitBehavior;

public class Zukemon {
    private int type;
    private int damage;
    private int chanceOfCriticalHit;

    private HitBehavior hitBehavior;

    public Zukemon(int type, int damage, int chanceOfCriticalHit) {
        this.type = type;
        this.damage = damage;
        this.chanceOfCriticalHit = chanceOfCriticalHit;
    }

    public int getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public int getChanceOfCriticalHit() {
        return chanceOfCriticalHit;
    }

    public void setHitBehavior(HitBehavior hitBehavior) {
        this.hitBehavior = hitBehavior;
    }

    public int performHit(){
        return hitBehavior.performHit(this);
    }
}
