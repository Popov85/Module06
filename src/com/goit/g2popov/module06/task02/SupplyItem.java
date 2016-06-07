package com.goit.g2popov.module06.task02;

/**
 * Created by Андрей on 29.05.2016.
 */
public class SupplyItem {
        private Instrument item;
        private int number;
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
