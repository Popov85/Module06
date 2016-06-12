package com.goit.g2popov.module06.task02;

/**
 * Exception class {@code MoreThanIsLeftException} defines a case when a customer wants to buy more
 * than is left in stock
 * This exception is thrown when we face this situation.
 * @author  Andrii Popov
 */

public class MoreThanIsLeftException extends Exception {

        // Number of instruments that ordered a customer
        private int wantedNumber;

        public MoreThanIsLeftException(int wantedNumber) {
                this.wantedNumber = wantedNumber;
        }

        public int getWantedNumber() {
                return wantedNumber;
        }
}
