package com.goit.g2popov.module06.task02;

/**
 * Created by Андрей on 29.05.2016.
 */
public class OrderItem {
        private int numberOfItems;
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
