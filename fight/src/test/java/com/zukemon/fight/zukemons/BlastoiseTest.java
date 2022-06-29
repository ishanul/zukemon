package com.zukemon.fight.zukemons;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BlastoiseTest {
    @Test
    public void test() {
        Blastoise blastoise = new Blastoise();

        int damage = blastoise.hit();

        assertThat(damage).isEqualTo(258);
    }
}