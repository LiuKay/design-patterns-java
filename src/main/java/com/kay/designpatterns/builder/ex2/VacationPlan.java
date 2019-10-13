package com.kay.designpatterns.builder.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kay
 * @date 2019/10/13
 */
class VacationPlan {

    private List<Item> itemList;

    VacationPlan() {
        this.itemList = new ArrayList<>();
    }

    void addItem(Item item) {
        this.itemList.add(item);
    }

    @Override
    public String toString() {
        return "VacationPlan{" +
                "itemList=" + itemList +
                '}';
    }
}
