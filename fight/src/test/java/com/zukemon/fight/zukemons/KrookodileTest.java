package com.zukemon.fight.zukemons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class KrookodileTest {

    private Krookodile krookodile;

    @BeforeEach
    public void setup() {
        krookodile = new Krookodile();
        krookodile.teamMembers = List.of(new Blastoise(), new Wartortle() );
    }

    @Test
    public void test() {
        int damage = krookodile.hit();

        assertThat(damage).isEqualTo(258 + 300);
    }

}