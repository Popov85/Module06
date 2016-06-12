package com.goit.g2popov.module06.task02;

/**
 * Class {@code OrderItem} keeps info about a part of orders
 * @author  Andrii Popov
 */

public class OrderItem {

        // Number if items a customer asked
        private int numberOfItems;
        // Item that a customer asked
        private Instrument instrument;

        public OrderItem(int number, Instrument instrument) {
                this.numberOfItems = number;
                this.instrument = instrument;
        }

        public Instrument getInstrument() {
                return instrument;
        }

        public int getNumberOfItems() {
                return numberOfItems;
        }

        public void setNumberOfItems(int numberOfItems) {
                this.numberOfItems = numberOfItems;
        }

        public void setInstrument(Instrument instrument) {
                this.instrument = instrument;
        }
}
