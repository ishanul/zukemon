package com.zukemon.fight.zukemons;

import com.zukemon.fight.CriticalHit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class PsyduckTest {

    @Mock
    CriticalHit criticalHit;

    private Psyduck psyduck;

    @BeforeEach
    public void setup(){
        psyduck = new Psyduck();
        psyduck.criticalHit = criticalHit;
    }

    @Test
    public void testWithCriticalHit() {
        Mockito.when(criticalHit.isCriticalHit(20)).thenReturn(true);

        int damage = psyduck.hit();

        assertThat(damage).isEqualTo(254);
    }

    @Test
    public void testWithoutCriticalHit() {
        Mockito.when(criticalHit.isCriticalHit(20)).thenReturn(false);

        int damage = psyduck.hit();

        assertThat(damage).isEqualTo(127);
    }
}