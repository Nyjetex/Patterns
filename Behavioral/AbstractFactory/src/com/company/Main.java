package com.company;

import com.company.factories.ElfUnitFactory;
import com.company.factories.OrcUnitFactory;
import com.company.factories.UnitFactory;

public class Main {

    public static void main(String[] args) {
        createUnitsAndAction(new OrcUnitFactory());
        createUnitsAndAction(new ElfUnitFactory());
    }

    private static void createUnitsAndAction(UnitFactory factory) {
        factory.createArcher().shoot();
        factory.createWarrior().attack();
        factory.createMage().cast();
    }
}
