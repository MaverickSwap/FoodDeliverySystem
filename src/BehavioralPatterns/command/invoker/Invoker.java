package BehavioralPatterns.command.invoker;

import BehavioralPatterns.command.Command;

public abstract class Invoker {

    private String name;

    private Command command;

    public abstract void invokeCommand();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
