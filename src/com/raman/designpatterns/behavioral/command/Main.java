package com.raman.designpatterns.behavioral.command;

import com.raman.designpatterns.behavioral.command.command.TurnAcOfCommand;
import com.raman.designpatterns.behavioral.command.command.TurnAcOnCommand;
import com.raman.designpatterns.behavioral.command.invoker.MyRemoteControl;
import com.raman.designpatterns.behavioral.command.receiver.AirConditioner;

public class Main {
    public static void main(String[] args) {
        //ac object
        AirConditioner ac = new AirConditioner();
        //remote object
        MyRemoteControl remoteControl = new MyRemoteControl();
        //create command and press button-->client interested in.
        remoteControl.setCommand(new TurnAcOfCommand(ac));
        remoteControl.pressButton();
        remoteControl.setCommand(new TurnAcOnCommand(ac));
        remoteControl.pressButton();
        remoteControl.undo();

    }
}
