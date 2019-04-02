package com.company.factories;

import com.company.entity.Archer;
import com.company.entity.Mage;
import com.company.entity.Warrior;
import com.company.unit.OrcArcher;
import com.company.unit.OrcMage;
import com.company.unit.OrcWarrior;

/**
 * Factory creates orc's
 */
public class OrcUnitFactory implements UnitFactory {
    @Override
    public Mage createMage() {
        return new OrcMage();
    }

    @Override
    public Warrior createWarrior() {
        return new OrcWarrior();
    }

    @Override
    public Archer createArcher() {
        return new OrcArcher();
    }
}
