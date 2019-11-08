package com.kay.designpatterns.command.ex1;

/**
 * @author Kai Liu
 * @date 11/8/2019
 **/
class LightOnCommand implements Command {

    private Light light;

    LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }

    @Override
    public void undo() {
        this.light.turnOff();
    }
}
