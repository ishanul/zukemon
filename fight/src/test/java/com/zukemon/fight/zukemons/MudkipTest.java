package com.zukemon.fight.zukemons;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MudkipTest {
    @Test
    public void test() {
        Mudkip mudkip = new Mudkip();

        int damage = mudkip.hit();

        assertThat(damage).isEqualTo(234);
    }
}