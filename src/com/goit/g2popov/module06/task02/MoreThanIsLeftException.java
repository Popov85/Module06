package com.goit.g2popov.module06.task02;

/**
 * Created by Андрей on 07.06.2016.
 */
public class MoreThanIsLeftException extends Exception {
        private int wantedNumber;

        public MoreThanIsLeftException(int wantedNumber) {
                this.wantedNumber = wantedNumber;
        }

        public int getWantedNumber() {
                return wantedNumber;
        }
}
