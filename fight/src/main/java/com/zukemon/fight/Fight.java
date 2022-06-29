package com.zukemon.fight;

public class Fight {
    /**
     * Blastoise #9 Water Damage 258
     * Mew #151 Psychic Damage 150 (10% chance of critical hit)
     * Wartortle #8 Water Damage 300
     * Mudkip #258 Water Damage 234
     * Pikachu #25 Electric Damage 135
     * Psyduck #54 Water Damage 127 (20% chance of critical hit)
     * Krookodile #553 Dark No Damage -> It is the team lead, so he can call his team members to arms. Add the
     * damage of all other Zukemons
     *
     * Critical hits make double damage
     *
     * @param attackerType the type of the attacker, refer to the numbers of the pokemon
     */
    public int hit(int attackerType) {
        ZukemonFactory factory = new ZukemonFactory();
        Zukemon zukemon = factory.createZukemon(attackerType);

        return zukemon.hit();
    }
}
