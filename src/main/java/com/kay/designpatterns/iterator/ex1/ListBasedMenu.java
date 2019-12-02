package com.kay.designpatterns.iterator.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kai Liu
 * @since 12/2/2019
 **/
class ListBasedMenu {

    private List<MenuItem> menuItemList = new ArrayList<>();

    public ListBasedMenu() {
        addItem("food1", "food1", false);
        addItem("food2", "food2", true);
        addItem("food3", "food3", false);
        addItem("food4", "food4", false);
    }

    void addItem(String name, String desc, boolean isVegetable) {
        menuItemList.add(new MenuItem(name, desc, isVegetable));
    }

    List<MenuItem> getMenuItems() {
        return this.menuItemList;
    }

    Iterator iterator() {
        return new ListIterator(this.menuItemList);
    }

    class ListIterator implements Iterator{

        private List<MenuItem> menuItemList;
        private int position = 0;

        public ListIterator(List<MenuItem> menuItemList) {
            this.menuItemList = menuItemList;
        }

        @Override
        public boolean hasNext() {
            if (position < menuItemList.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (position >= menuItemList.size()) {
                throw new RuntimeException("No more element.");
            }
            return menuItemList.get(position++);
        }
    }
}
