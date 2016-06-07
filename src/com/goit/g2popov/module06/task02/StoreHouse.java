package com.goit.g2popov.module06.task02;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by Андрей on 29.05.2016.
 */

public class StoreHouse {

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

        public static void decreaseNumberOfInstrumentsInStock(Instrument instrument, Integer numberWasBought) {
                Integer currentNumberOfInstruments = stock.get(instrument);
                Integer newNumberBecomes = currentNumberOfInstruments - numberWasBought;
                stock.put(instrument, newNumberBecomes);
        }

        public static void printStockState() {
                for (Map.Entry<Instrument, Integer> entry : stock.entrySet()) {
                        Instrument key = entry.getKey();
                        Integer value = entry.getValue();
                        System.out.print("Instrument: "+key.getClass().getName());
                        System.out.println(" "+value+" pieces left in stock");
                }
        }
}
