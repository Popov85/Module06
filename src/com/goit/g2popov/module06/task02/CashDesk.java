package com.goit.g2popov.module06.task02;

/**
 * Class {@code CashDesk} emulates a cash desk of a real online shop
 * This class is accessible from all parts of the app to increase
 * or decrease the current sum of money in the cash desk
 * @author  Andrii Popov
 */
public class CashDesk {

        // Specifies how much money is left in the cash desk
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
