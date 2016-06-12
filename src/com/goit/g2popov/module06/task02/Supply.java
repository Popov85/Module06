package com.goit.g2popov.module06.task02;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Class {@code Supply} keeps info about supplies to the online shop
 * @author  Andrii Popov
 */

public class Supply {

        // Date/Time when a new batch of commodities arrived
        private Calendar date;
        // List of items that were delivered to the store house from suppliers
        private List<SupplyItem> items;

        public Supply() {
                Calendar currentDate = Calendar.getInstance();
                date = currentDate;
                items = new ArrayList<SupplyItem>();
        }

        public Calendar getDate() {
                return date;
        }

        public List<SupplyItem> getItems() {
                return items;
        }

        public void setDate(Calendar date) {
                this.date = date;
        }

        public void setItems(List<SupplyItem> items) {
                this.items = items;
        }

        /*TODO
         Will change the state of StoreHouse when an order is paid and shipped
         and when a new batch of instruments arrives.
       */
        public void changeStateOfStoreHouse() {

        }

        /*TODO
          Will change the state of Cash Desk once an order is paid and shipped
          and when a new batch of instruments arrives.
        */
        public void changeStateOfCashDesk() {

        }
}
