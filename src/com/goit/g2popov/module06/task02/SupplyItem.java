package com.goit.g2popov.module06.task02;

/**
 * Class {@code SupplyItem} specifies a piece of commodities that were delivered to the store house
 * @author  Andrii Popov
 */

public class SupplyItem {

        // An instrument that got it stock
        private Instrument item;
        // Number of instruments of a given type that got in stock
        private int number;
        // Who provided them (a partner company)
        private Supplier supplier;

        public Instrument getItem() {
                return item;
        }

        public int getNumber() {
                return number;
        }

        public Supplier getSupplier() {
                return supplier;
        }

        public void setItem(Instrument item) {
                this.item = item;
        }

        public void setNumber(int number) {
                this.number = number;
        }

        public void setSupplier(Supplier supplier) {
                this.supplier = supplier;
        }
}
