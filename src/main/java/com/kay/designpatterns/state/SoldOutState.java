package com.kay.designpatterns.state;

/**
 * @author kay
 * @date 2020/12/26
 */
class SoldOutState implements State {
    private final GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Gumball sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Gumball sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("Gumball sold out");
    }

    @Override
    public void dispense() {
        System.out.println("Gumball sold out");
    }
}
