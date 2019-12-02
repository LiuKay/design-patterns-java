package com.kay.designpatterns.iterator.ex1;

/**
 * @author Kai Liu
 * @since 12/2/2019
 **/
class MenuItem {
    private String name;
    private String desc;
    private boolean isVegetable;

    public MenuItem(String name, String desc, boolean isVegetable) {
        this.name = name;
        this.desc = desc;
        this.isVegetable = isVegetable;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", isVegetable=" + isVegetable +
                '}';
    }
}
