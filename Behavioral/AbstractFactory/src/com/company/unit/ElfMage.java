package com.company.unit;

import com.company.entity.Mage;

public class ElfMage implements Mage {
    @Override
    public void cast() {
        System.out.println("ElfMage cast mage");
    }
}
