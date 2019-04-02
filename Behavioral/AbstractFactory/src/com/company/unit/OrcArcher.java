package com.company.unit;

import com.company.entity.Archer;

public class OrcArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("OrcArcher shoot");
    }
}
