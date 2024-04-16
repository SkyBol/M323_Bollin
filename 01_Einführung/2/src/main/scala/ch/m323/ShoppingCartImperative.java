package ch.m323;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartImperative {
    private List<String> items = new ArrayList<>();
    private boolean bookAdded = false;

    public int getDiscountPercent() {
        return bookAdded ? 5 : 0;
    }
    public int applyDiscountPercent(int totalCost) {
        if (bookAdded) {
            return totalCost - (totalCost / 20);
        }

        return totalCost;
    }

    public ShoppingCartImperative addItem(String item) {
        if ("book".equals(item)) {
            bookAdded = true;
        }

        items.add(item);
        return this;
    }
    public ShoppingCartImperative removeItem(String item) {
        if ("book".equals(item)) {
            bookAdded = false;
        }

        items.remove(item);
        return this;
    }
}
