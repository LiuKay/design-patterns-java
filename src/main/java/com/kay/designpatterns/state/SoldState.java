package com.kay.designpatterns.state;

/**
 * @author kay
 * @date 2020/12/26
 */
class SoldState implements State {
    private final GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait,we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry,you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        if (gumballMachine.hasQuarter()) {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumball");
                gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
            }
        } else {
            System.out.println("No quarter insert, can not dispense!");
        }
    }
}
