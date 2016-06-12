package com.goit.g2popov.module06.task02;

import java.util.HashMap;
import java.util.Map;

/**
 * Class {@code StoreHouse} emulates store house of the online shop
 * @author  Andrii Popov
 */

public class StoreHouse {

        // Keeps info about numbers of all instruments in stock
        private static HashMap<Instrument, Integer> stock ;

        public static void setStock(HashMap<Instrument, Integer> stock) {
                StoreHouse.stock = stock;
        }

        public static HashMap<Instrument, Integer> getStock() {
                return stock;
        }

        public static int calculateInstruments(Instrument instrumentsToBeCounted) {
                return stock.get(instrumentsToBeCounted);
        }

        /**
         * Renews the state of the store house after an order has been shipped
         * @param instrument
         * @param numberWasBought
         */
        public static void decreaseNumberOfInstrumentsInStock(Instrument instrument, Integer numberWasBought) {
                Integer currentNumberOfInstruments = stock.get(instrument);
                Integer newNumberBecomes = currentNumberOfInstruments - numberWasBought;
                stock.put(instrument, newNumberBecomes);
        }

        /**
         * Prints out the current state of the store house in a form:
         * Guitars: 25
         * Pianos: 2
         * Trumpets: 9
         */
        public static void printStockState() {
                for (Map.Entry<Instrument, Integer> entry : stock.entrySet()) {
                        Instrument key = entry.getKey();
                        Integer value = entry.getValue();
                        System.out.print("Instrument: "+key.getClass().getName());
                        System.out.println(" "+value+" pieces left in stock");
                }
        }
}
