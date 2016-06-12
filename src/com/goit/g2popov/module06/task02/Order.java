package com.goit.g2popov.module06.task02;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Class {@code Order} keeps info about orders made in the online shop
 * @author  Andrii Popov
 */

public class Order {

        // ID counter
        private static int currentID = 0;
        // ID of an order
        private int id;
        // Date/Time when an order was created
        private Calendar date;
        // Specifies whether an order was fulfilled
        private boolean isFulfilled;
        private Cashier cashier;
        private Client client;
        // Keeps info about instruments and their numbers in an order
        private List<OrderItem> items;

        public Order() {
                id = currentID + 1;
                currentID = id;
                Calendar currentDate = Calendar.getInstance();
                date = currentDate;
                items = new ArrayList<OrderItem>();
                isFulfilled = false;
                client = new Client();
        }

        public int getId() {
                return id;
        }

        public Calendar getDate() {
                return date;
        }

        public boolean isFulfilled() {
                return isFulfilled;
        }

        public Cashier getCashier() {
                return cashier;
        }

        public Client getClient() {
                return client;
        }

        public List<OrderItem> getItems() {
                return items;
        }

        public void setDate(Calendar date) {
                this.date = date;
        }

        public void setFulfilled(boolean fulfilled) {
                this.isFulfilled = fulfilled;
        }

        public void setClient(Client client) {
                this.client = client;
        }

        public void setCashier(Cashier cashier) {
                this.cashier = cashier;
        }

        public void setItems(List<OrderItem> items) {
                this.items = items;
        }

        /**
         * Ships an order to the customer
         * Decreases numbers of all instruments in stock according to the order
         */
        public void prepareInstruments() {
                for (int i = 0; i < items.size(); i++) {
                        OrderItem pieceOfOrder = items.get(i);
                        StoreHouse.decreaseNumberOfInstrumentsInStock(pieceOfOrder.getInstrument(),pieceOfOrder.getNumberOfItems());
                }
        }

        /**
         * Adds an instrument to the basket
         * If a customer wants more items than is left in stock, we prevent him from
         * placing the item in the basket
         * @param wantedNumber
         * @param instrument
         * @throws MoreThanIsLeftException
         */
        public void addItem(int wantedNumber, Instrument instrument) throws MoreThanIsLeftException {
                int realNumberInStock = getInstrumentNumberInStock(instrument);
                try {
                        // If we face a situation when a customer wants too many instruments of a given type
                        // we prevent him from creating OrderItem instance
                        if (wantedNumber > realNumberInStock) {
                                throw new MoreThanIsLeftException(wantedNumber);
                        }
                        OrderItem pieceOfOrder = new OrderItem(wantedNumber, instrument);
                        this.items.add(pieceOfOrder);
                } catch (MoreThanIsLeftException e) {
                        System.out.println("User asked more than it is left in stock...");
                }
        }

        /**
         * Gets the number of a given instrument in stock
         * @param instrument
         * @return
         */
        private int getInstrumentNumberInStock(Instrument instrument) {
                return StoreHouse.calculateInstruments(instrument);
        }
}
