package com.company.unit;

import com.company.entity.Warrior;

public class OrcWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("OrcWarrior attack");
    }
}
