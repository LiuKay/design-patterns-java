package com.kay.designpatterns.state;

/**
 * @author kay
 * @date 2020/12/27
 */
public class TestClient {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(1);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}
