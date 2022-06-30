package com.zukemon.behavior;

import com.zukemon.fight.CriticalHit;
import com.zukemon.playground.ZukemonDen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class NormalHitBehaviorTest {
    private NormalHitBehavior normalHitBehavior;
    @Mock
    CriticalHit criticalHit;

    @BeforeEach
    void setup(){
        normalHitBehavior = new NormalHitBehavior();
        normalHitBehavior.setCriticalHitBehavior(criticalHit);
    }

    @Test
    void testPerformHit_whenCriticalHitIsNotThere_thenDamageIs150(){
        when(criticalHit.isCriticalHit(ArgumentMatchers.anyInt())).thenReturn(false);
        int damage = normalHitBehavior.performHit(ZukemonDen.getZukemon(151, criticalHit));
        assertThat(damage).isEqualTo(150);

    }@Test
    void testPerformHit_whenCriticalHitIsThere_thenDamageIs300(){
        when(criticalHit.isCriticalHit(ArgumentMatchers.anyInt())).thenReturn(true);
        int damage = normalHitBehavior.performHit(ZukemonDen.getZukemon(151, criticalHit));
        assertThat(damage).isEqualTo(300);

    }
}
