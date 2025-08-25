package com.tiv.design.patterns.behavioral.command;

import com.tiv.design.patterns.behavioral.command.command.TurnOffCommand;
import com.tiv.design.patterns.behavioral.command.command.TurnOnCommand;

public class Test {

    public static void main(String[] args) {
        Light light1 = new Light("电灯1");
        TurnOnCommand turnOnCommand1 = new TurnOnCommand(light1);
        TurnOffCommand turnOffCommand1 = new TurnOffCommand(light1);

        Light light2 = new Light("电灯2");
        TurnOnCommand turnOnCommand2 = new TurnOnCommand(light2);

        Staff staff = new Staff();
        staff.addCommand(turnOnCommand1);
        staff.addCommand(turnOffCommand1);
        staff.addCommand(turnOnCommand1);
        staff.addCommand(turnOnCommand2);

        staff.executeCommands();
    }

}
