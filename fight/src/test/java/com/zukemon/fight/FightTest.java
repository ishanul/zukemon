package com.zukemon.fight;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class FightTest {

    @Test
    public void test() {
        Fight fight = new Fight();

        int damage = fight.hit(9);

        assertThat(damage).isEqualTo(258);
    }
}
