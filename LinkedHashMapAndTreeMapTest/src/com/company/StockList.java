package com.company;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {

    private final Map<String, StockItem> list;

    public StockList() {

        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item) {

        if(item != null) {

            // check if already have quantities of this item
            // in case there is no item in stock getOrDefault will return item itself
            // in case there is item in stock it will return item from stock in that case inStock != item is true
            StockItem inStock = list.getOrDefault(item.getName(), item);

            // If there are already stocks on this item, adjust the quantity
            // so if there is item in stock we just adjust the quantity of our item
            if(inStock != item) {
                item.adjustStock(inStock.availableQuantity());
            }

            // after adjusting the stock we are just putting item back into stock
            // in other words this replaces the old item in stock with "new quantity"
            list.put(item.getName(), item);

            return item.availableQuantity();
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {

        StockItem inStock = list.get(item);

        if ((inStock != null) && (quantity > 0)) {

            return inStock.finalizeStock((quantity));

            }

        return 0;
    }

    public int reserveStock(String item, int quantity) {

        StockItem inStock = list.get(item);

        if((inStock != null) && (quantity > 0)) {

            return inStock.reserveStock(quantity);
        }
        return 0;
    }

    public int unreserveStock (String item, int quantity) {

        StockItem inStock = list.get(item);

        if ((inStock != null) && (quantity > 0)) {

            return inStock.unreserveStock(quantity);
        }
        return 0;
    }

    public StockItem get(String key) {

        return list.get(key);
    }

    public Map<String, Double> PriceList() {

        Map<String, Double> prices = new LinkedHashMap<>();

        for(Map.Entry<String, StockItem> item : list.entrySet()) {

            prices.put(item.getKey(), item.getValue().getPrice());

        }
        return Collections.unmodifiableMap(prices);
    }

    public Map<String, StockItem> Items() {

        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {

        String s = "\nStock List\n";
        double totalCost = 0.0;

        for (Map.Entry<String, StockItem> item : list.entrySet()) {

            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.availableQuantity();

            s = s + stockItem + ". There are " + stockItem.availableQuantity() + " in stock. Value of items: ";
            s = s + String.format("%.2f",itemValue) + "\n";
            totalCost += itemValue;
        }

        return s + "Total stock value " + totalCost;
    }
}
