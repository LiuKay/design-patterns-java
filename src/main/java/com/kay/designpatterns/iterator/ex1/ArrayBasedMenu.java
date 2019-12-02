package com.kay.designpatterns.iterator.ex1;

/**
 * @author Kai Liu
 * @since 12/2/2019
 **/
class ArrayBasedMenu {

    public static final int MAX_NUM = 4;

    private MenuItem[] menuItems;
    private int num;

    public ArrayBasedMenu() {
        menuItems = new MenuItem[MAX_NUM];
        addItem("a-food1","a-food1",true);
        addItem("a-food2","a-food2",true);
        addItem("a-food3","a-food3",true);
        addItem("a-food4","a-food4",false);
    }

    void addItem(String name, String desc, boolean isVegetable) {
        if (MAX_NUM == num) {
            System.err.println("Sorry. Menu is full.");
            return;
        }

        menuItems[num] = new MenuItem(name, desc, isVegetable);
        num++;
    }

    MenuItem[] getMenuItems() {
        return this.menuItems;
    }

    Iterator iterator(){
        return new ArrayIterator(this.menuItems);
    }

    class ArrayIterator implements Iterator{

        private MenuItem[] menuItems;
        private int position = 0;

        public ArrayIterator(MenuItem[] menuItems) {
            this.menuItems = menuItems;
        }

        @Override
        public boolean hasNext() {
            if (position < menuItems.length || menuItems[position] != null) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (position == menuItems.length) {
                throw new RuntimeException("There has no more elements.");
            }else {
                return menuItems[position++];
            }
        }
    }

}
