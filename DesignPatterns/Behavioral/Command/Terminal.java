package Behavioral.Command;

import java.util.ArrayList;
import java.util.List;

public class Terminal {
    private final List<String> commands = new ArrayList<>();

    Terminal(){}

    void execute() {
        System.out.println("execute: " +  commands.get(commands.size() - 1));
    }

    void write(String command) {
        commands.add(command);
    }

    void removeLast() {
        commands.remove(commands.size() - 1);
    }

    void showHistory() {
        for (String command : commands) {
            System.out.println(command);
        }
    }

}
