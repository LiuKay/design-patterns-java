package com.kay.designpatterns.iterator.ex1;

/**
 * @author Kai Liu
 * @since 12/2/2019
 **/
class Client {

    public static void main(String[] args) {
        // scenario 1
        ArrayBasedMenu arrayBasedMenu = new ArrayBasedMenu();

        ListBasedMenu listBasedMenu = new ListBasedMenu();

        print(arrayBasedMenu.iterator());
        print(listBasedMenu.iterator());

    }

    static void print(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
