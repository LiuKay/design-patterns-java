package com.kay.designpatterns.state;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 糖果机 (相当 Context)
 *
 * @author kay
 * @date 2020/12/26
 */
@Getter
@Setter
@ToString(of = {"currentState", "count"})
public class GumballMachine {
    private State soldOutState;
    private State soldState;
    private State noQuarterState;
    private State hasQuarterState;
    private State winnerState;

    private State currentState;
    private int count;

    public GumballMachine(int initCount) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);
        this.count = initCount;
        if (this.count > 0) {
            this.currentState = noQuarterState;
        }
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    boolean hasQuarter() {
        return this.currentState == hasQuarterState;
    }

    boolean isEmpty() {
        return count == 0;
    }
}
