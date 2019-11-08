package com.kay.designpatterns.command.ex1;

/**
 * @author Kai Liu
 * @date 11/8/2019
 **/
class LightOffCommand implements Command {

    private Light light;

    LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }

    @Override
    public void undo() {
        this.light.turnOn();
    }
}
