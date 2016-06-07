package com.goit.g2popov.module06.task02;
/**
 * Created by Andrii on 29.05.2016.
 */
public class CashDesk {
        private static double currentSum;

        public static double getCurrentSum() {
                return currentSum;
        }

        public static void increaseCurrentSum(double addition) {
                CashDesk.currentSum = CashDesk.currentSum+addition;
        }

        public static void decreaseCurrentSum(int subtraction) {
                CashDesk.currentSum = CashDesk.currentSum-subtraction;
        }
}
