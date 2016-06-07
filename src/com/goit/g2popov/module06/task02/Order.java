package com.goit.g2popov.module06.task02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Андрей on 29.05.2016.
 */
public class Order {
        private static int currentID = 0;
        private int id;
        private Calendar date;
        private boolean isFulfilled;
        private Cashier cashier;
        private Client client;
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

        public void prepareInstruments() {
                for (int i = 0; i < items.size(); i++) {
                        OrderItem pieceOfOrder = items.get(i);
                        StoreHouse.decreaseNumberOfInstrumentsInStock(pieceOfOrder.getInstrument(),pieceOfOrder.getNumberOfItems());
                }
        }

        public void addItem(int wantedNumber, Instrument instrument) throws MoreThanIsLeftException {
                int realNumberInStock = getInstrumentNumberInStock(instrument);
                try {
                        if (wantedNumber > realNumberInStock) {
                                throw new MoreThanIsLeftException(wantedNumber);
                        }
                        OrderItem pieceOfOrder = new OrderItem(wantedNumber, instrument);
                        this.items.add(pieceOfOrder);
                } catch (MoreThanIsLeftException e) {
                        System.out.println("User asked more than it is left in stock...");
                }
        }

        private int getInstrumentNumberInStock(Instrument instrument) {
                return StoreHouse.calculateInstruments(instrument);
        }
}
