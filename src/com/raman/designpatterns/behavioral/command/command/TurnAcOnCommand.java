package com.raman.designpatterns.behavioral.command.command;

import com.raman.designpatterns.behavioral.command.receiver.AirConditioner;

public class TurnAcOnCommand implements Command {
    AirConditioner ac;

    public TurnAcOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        this.ac.turnOnAc();
    }

    @Override
    public void undo() {
        this.ac.turnOffAc();
    }

}
