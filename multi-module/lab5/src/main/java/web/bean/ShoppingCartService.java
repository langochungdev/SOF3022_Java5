package web.bean;

import java.util.Collection;

public interface ShoppingCartService {
    Item add(Integer id);
    void remove(Integer id);
    Item update(Integer id, int qty);
    void clear();
    Collection<Item> items();
    int getCount();
    double getAmount();
}
