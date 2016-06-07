package com.goit.g2popov.module06.task02;

import com.sun.org.apache.bcel.internal.generic.StoreInstruction;

import java.util.HashMap;

/**
 * Created by Андрей on 06.06.2016.
 */
public class Runner {
        public static void main (String[] args) {
                Instrument aPiano = new Piano();
                Instrument aTrumpet = new Trumpet();
                Instrument aGuitar = new Guitar();
                HashMap<Instrument, Integer> mapInstance = new HashMap<Instrument, Integer>();
                mapInstance.put(aPiano, 2);
                mapInstance.put(aTrumpet, 7);
                mapInstance.put(aGuitar, 16);
                StoreHouse.setStock(mapInstance);
                //System.out.println("Guitars = "+StoreHouse.calculateInstruments(aGuitar));
                StoreHouse.printStockState();
                Order myOrder = new Order();
                System.out.println("First order number = " + myOrder.getId());
                myOrder.addItem(1, aPiano);
                myOrder.addItem(1, aTrumpet);
                myOrder.prepareInstruments();
                System.out.println("In stock left:");
                StoreHouse.printStockState();
                Order myOrder2 = new Order();
                System.out.println("Second order number = " + myOrder2.getId());
                myOrder2.addItem(1, aPiano);
                myOrder2.addItem(1, aTrumpet);
                myOrder2.prepareInstruments();
                System.out.println("In stock left:");
                StoreHouse.printStockState();
        }


}
