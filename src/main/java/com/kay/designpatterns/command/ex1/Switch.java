package com.kay.designpatterns.command.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kai Liu
 * @date 11/8/2019
 **/
class Switch {
    private List<Command> history = new ArrayList<>();

    Switch() {
    }

    void storeAndExecute(Command cmd) {
        this.history.add(cmd);
        cmd.execute();
    }
}
