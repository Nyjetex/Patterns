package com.company.unit;

import com.company.entity.Mage;

public class OrcMage implements Mage {
    @Override
    public void cast() {
        System.out.println("OrcMage cast mage");
    }
}
