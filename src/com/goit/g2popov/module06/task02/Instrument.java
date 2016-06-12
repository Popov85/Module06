package com.goit.g2popov.module06.task02;

/**
 * Class {@code Instrument} specifies guitars as a commodity in the online shop
 * @author  Andrii Popov
 */

public abstract class Instrument {

        // Wholesale price of an instrument
        private double wholesalePrice;

        // Retail price of an instrument
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
