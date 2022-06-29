package com.zukemon.fight.zukemons;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WartortleTest {
    @Test
    public void test() {
        Wartortle wartortle = new Wartortle();

        int damage = wartortle.hit();

        assertThat(damage).isEqualTo(300);
    }
}