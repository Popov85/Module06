package com.goit.g2popov.module06.task02;

import java.util.HashMap;

/**
 * Class {@code Runner} entry point - emulates how orders are made
 * and exceptional situations that may be thrown.
 */
public class Runner {
        public static void main (String[] args) throws MoreThanIsLeftException {

                // Create instances of musical instruments
                Instrument aPiano = new Piano();
                Instrument aTrumpet = new Trumpet();
                Instrument aGuitar = new Guitar();

                // Fill StoreHouse with some musical instruments
                HashMap<Instrument, Integer> mapInstance = new HashMap<Instrument, Integer>();
                mapInstance.put(aPiano, 2);
                mapInstance.put(aTrumpet, 7);
                mapInstance.put(aGuitar, 16);
                StoreHouse.setStock(mapInstance);
                // Print the current state of StoreHouse
                System.out.println("Initial stock:");
                StoreHouse.printStockState();

                // Make an order #1 (1 - Piano and 1 Trumpet)
                Order myOrder = new Order();
                System.out.println("First order number = " + myOrder.getId());
                myOrder.addItem(1, aPiano);
                myOrder.addItem(1, aTrumpet);
                // Ship the order to the customer
                myOrder.prepareInstruments();
                System.out.println("In stock left:");
                StoreHouse.printStockState();

                // Make another order #2 (2 Pianos and 1 Trumpet)
                // We have only 1 Piano left, so we cannot ship it
                // In this case, we will throw an exception.
                Order myOrder2 = new Order();
                System.out.println("Second order number = " + myOrder2.getId());
                myOrder2.addItem(2, aPiano);
                myOrder2.addItem(1, aTrumpet);
                // Ship the order to the customer
                // in case there is at least one item in stock largo manum.
                myOrder2.prepareInstruments();
                System.out.println("In stock left:");
                StoreHouse.printStockState();
        }
}
