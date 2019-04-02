package com.company.factories;

import com.company.entity.Archer;
import com.company.entity.Mage;
import com.company.entity.Warrior;

/**
 * Abstract factory
 */
public interface UnitFactory {
    Mage createMage();
    Warrior createWarrior();
    Archer createArcher();
}
