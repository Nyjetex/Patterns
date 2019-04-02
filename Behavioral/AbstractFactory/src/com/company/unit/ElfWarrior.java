package com.company.unit;

import com.company.entity.Warrior;

public class ElfWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("ElfWarrior attack");
    }
}
