package com.zukemon.fight;

import com.zukemon.fight.zukemons.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ZukemonFactoryTest {

    @Test
    public void given8expectThatWartortleIsCreated() {
        ZukemonFactory factory = new ZukemonFactory();

        Zukemon zukemon = factory.createZukemon(new Wartortle().getNumber());

        assertThat(zukemon).isInstanceOf(Wartortle.class);
    }

    @Test
    public void given151expectThatMewIsCreated() {
        ZukemonFactory factory = new ZukemonFactory();

        Zukemon zukemon = factory.createZukemon(new Mew().getNumber());

        assertThat(zukemon).isInstanceOf(Mew.class);
    }

    @Test
    public void given9expectThatBlastoiseIsCreated() {
        ZukemonFactory factory = new ZukemonFactory();

        Zukemon zukemon = factory.createZukemon(new Blastoise().getNumber());

        assertThat(zukemon).isInstanceOf(Blastoise.class);
    }

    @Test
    public void given258expectThatMudkipIsCreated() {
        ZukemonFactory factory = new ZukemonFactory();

        Zukemon zukemon = factory.createZukemon(new Mudkip().getNumber());

        assertThat(zukemon).isInstanceOf(Mudkip.class);
    }

    @Test
    public void given25expectThatPikachuIsCreated() {
        ZukemonFactory factory = new ZukemonFactory();

        Zukemon zukemon = factory.createZukemon(new Pikachu().getNumber());

        assertThat(zukemon).isInstanceOf(Pikachu.class);
    }

    @Test
    public void given54expectThatPsyduckisCreated() {
        ZukemonFactory factory = new ZukemonFactory();

        Zukemon zukemon = factory.createZukemon(new Psyduck().getNumber());

        assertThat(zukemon).isInstanceOf(Psyduck.class);
    }

    @Test
    public void given553expectThatKrookodileIsCreated() {
        ZukemonFactory factory = new ZukemonFactory();

        Zukemon zukemon = factory.createZukemon(new Krookodile().getNumber());

        assertThat(zukemon).isInstanceOf(Krookodile.class);
    }

}