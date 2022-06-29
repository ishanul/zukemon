package com.zukemon.fight.zukemons;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PikachuTest {
    @Test
    public void test() {
        Pikachu pikachu = new Pikachu();

        int damage = pikachu.hit();

        assertThat(damage).isEqualTo(135);
    }
}