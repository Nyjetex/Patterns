package com.company.unit;

import com.company.entity.Archer;

public class ElfArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("ElfArcher shoot");
    }
}
