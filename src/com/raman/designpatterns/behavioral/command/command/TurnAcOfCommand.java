package com.raman.designpatterns.behavioral.command.command;

import com.raman.designpatterns.behavioral.command.receiver.AirConditioner;

public class TurnAcOfCommand implements Command {
    AirConditioner ac;

    public TurnAcOfCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        this.ac.turnOffAc();
    }

    @Override
    public void undo() {
        this.ac.turnOnAc();
    }
}
