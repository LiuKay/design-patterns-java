package com.kay.designpatterns.state;

import java.util.Random;

/**
 * @author kay
 * @date 2020/12/26
 */
class HasQuarterState implements State {
    private final Random random = new Random(System.currentTimeMillis());
    private final GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = random.nextInt(10);
        if ((winner == 0) && gumballMachine.getCount() > 1) {
            gumballMachine.setCurrentState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setCurrentState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed.");
    }
}
