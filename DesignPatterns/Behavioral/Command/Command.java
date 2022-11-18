package Behavioral.Command;

public class Command {
    public static void main(String[] args){
        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.write("shutdown -r -t 0");
        commandInvoker.execute();
        commandInvoker.undo();
        commandInvoker.showHistory();
        commandInvoker.redo();
        commandInvoker.write("calc");
        commandInvoker.showHistory();
    }
}
