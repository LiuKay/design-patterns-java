package com.kay.designpatterns.command.ex1;

/**
 * @author Kai Liu
 * @date 11/8/2019
 **/
public class Client {

    public static void main(String[] args) {
        action("ON");
        action("OFF");
    }

    private static void action(String action) {
        Light light = new Light();

        Command switchUp = new LightOnCommand(light);
        Command switchDown = new LightOffCommand(light);

        Switch mySwitch = new Switch();

        switch (action) {
            case "ON":
                mySwitch.storeAndExecute(switchUp);
                break;
            case "OFF":
                mySwitch.storeAndExecute(switchDown);
                break;
            default:
                mySwitch.storeAndExecute(new NoCommand());
                break;
        }
    }
}
