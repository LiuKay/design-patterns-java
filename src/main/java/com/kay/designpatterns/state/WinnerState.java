package com.kay.designpatterns.state;

/**
 * 新增需求，幸运的胜利者获得2个糖果
 *
 * @author kay
 * @date 2020/12/26
 */
public class WinnerState implements State {

    private final GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
        System.out.println("YOU ARE A WINNER!You get two gumballs");
        gumballMachine.releaseBall();
        if (gumballMachine.isEmpty()) {
            gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.isEmpty()) {
                System.out.println("Oops, out of gumballs");
                gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
            } else {
                gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
            }
        }
    }
}
