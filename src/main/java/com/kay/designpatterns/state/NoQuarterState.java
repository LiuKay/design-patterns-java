package com.kay.designpatterns.state;

/**
 * 无硬币状态
 *
 * @author kay
 * @date 2020/12/26
 */
class NoQuarterState implements State {
    private final GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setCurrentState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarter returned.You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can not turn after insert quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first!");
    }
}
