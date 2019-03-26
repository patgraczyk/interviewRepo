package db;

import models.Basket;
import models.Shop;

public class newClass {

    public Customer(String customerName, String customerAddress, Shop shop) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
//        this.environmetnInfo = new HashMap<String, String>();
        this.baskets = new ArrayList<Basket>();
        this.shop = shop;
    }
}
