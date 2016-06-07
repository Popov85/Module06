package com.goit.g2popov.module06.task02;
/**
 * Created by Андрей on 29.05.2016.
 */

public abstract class Instrument {
        private double wholesalePrice;
        private double retailPrice;

        public double getRetailPrice() {
                return retailPrice;
        }

        public double getWholesalePrice() {
                return wholesalePrice;
        }

        public void setWholesalePrice(double wholesalePrice) {
                this.wholesalePrice = wholesalePrice;
        }

        public void setRetailPrice(double retailPrice) {
                this.retailPrice = retailPrice;
        }
}
