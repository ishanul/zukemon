package com.zukemon.fight;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class FightTest {

    Fight fight;
    @Mock
    CriticalHit criticalHit;
    @BeforeEach
    void setup(){
        fight = new Fight(criticalHit);
    }

    @Test
    public void testAttackerTypeIsWartortle_ThenReturn300() {
        int damage = fight.hit(8);

        assertThat(damage).isEqualTo(300);
    }

    @Test
    public void testAttackerTypeIsBlastoise_ThenReturn258() {
        int damage = fight.hit(9);

        assertThat(damage).isEqualTo(258);
    }

    @Test
    public void testAttackerTypeIsPsychic_WhenCriticalHit_ThenReturn300() {
        when(criticalHit.isCriticalHit(10)).thenReturn(true);
        int damage = fight.hit(151);
        assertThat(damage).isEqualTo(300);
    }

    @Test
    public void testAttackerTypeIsWaterDamage_WhenCriticalHit_ThenReturn254() {
        when(criticalHit.isCriticalHit(20)).thenReturn(true);

        int damage = fight.hit(54);

        assertThat(damage).isEqualTo(254);
    }

    @Test
    public void testAttackerTypeIsKrookodile_WhenNotCriticalHit_ThenReturn1024() {
        when(criticalHit.isCriticalHit(anyInt())).thenReturn(false);

        int damage = fight.hit(553);

        assertThat(damage).isEqualTo(1204);
    }

    @Test
    public void testAttackerTypeIsKrookodile_WhenCriticalHit_ThenReturn1481() {
        when(criticalHit.isCriticalHit(anyInt())).thenReturn(true);

        int damage = fight.hit(553);

        assertThat(damage).isEqualTo(1481);
    }
}
