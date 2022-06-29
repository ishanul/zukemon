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
class MewTest {
    @Mock
    CriticalHit criticalHit;

    private Mew mew;

    @BeforeEach
    public void setup(){
        mew = new Mew();
        mew.criticalHit = criticalHit;
    }

    @Test
    public void testWithCriticalHit() {
        Mockito.when(criticalHit.isCriticalHit(10)).thenReturn(true);

        int damage = mew.hit();

        assertThat(damage).isEqualTo(300);
    }

    @Test
    public void testWithoutCriticalHit() {
        Mockito.when(criticalHit.isCriticalHit(10)).thenReturn(false);

        int damage = mew.hit();

        assertThat(damage).isEqualTo(150);
    }
}