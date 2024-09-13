package com.FurnitureFactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FurnitureFactoryTest {

	public void testVictorianFurnitureCreation() {
        FurnitureFactory victorianFactory = new VictorianFurniture();

        Chair victorianChair = victorianFactory.createChair();
        Bed victorianBed = victorianFactory.createBed();
        DiningTable victorianTable = victorianFactory.createTable();

        assertTrue(victorianChair instanceof VictorianChair);
        assertTrue(victorianBed instanceof VictorianBed);
        assertTrue(victorianTable instanceof VictorianTable);
    }

    @Test
    public void testRusticFurnitureCreation() {
        FurnitureFactory rusticFactory = new RusticFurniture();

        Chair rusticChair = rusticFactory.createChair();
        Bed rusticBed = rusticFactory.createBed();
        DiningTable rusticTable = rusticFactory.createTable();

        assertTrue(rusticChair instanceof RusticChair);
        assertTrue(rusticBed instanceof RusticBed);
        assertTrue(rusticTable instanceof RusticTable);
    }
}
