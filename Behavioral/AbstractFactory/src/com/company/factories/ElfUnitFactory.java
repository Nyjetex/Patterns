package com.company.factories;

import com.company.entity.Archer;
import com.company.entity.Mage;
import com.company.entity.Warrior;
import com.company.unit.ElfArcher;
import com.company.unit.ElfMage;
import com.company.unit.ElfWarrior;

/**
 * Factory creates elf's
 */
public class ElfUnitFactory implements UnitFactory {
    @Override
    public Mage createMage() {
        return new ElfMage();
    }

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }
}
