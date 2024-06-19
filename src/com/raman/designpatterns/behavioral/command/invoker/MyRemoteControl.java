package com.raman.designpatterns.behavioral.command.invoker;

import com.raman.designpatterns.behavioral.command.command.Command;

import java.util.Stack;

public class MyRemoteControl {
    Stack<Command> acCommandHistory = new Stack<>();
    Command command;

    public MyRemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        acCommandHistory.add(command);
    }

    public void undo() {
        if (!acCommandHistory.isEmpty()) {
            Command lastCommand = acCommandHistory.pop();
            lastCommand.undo();
        }
    }
}
