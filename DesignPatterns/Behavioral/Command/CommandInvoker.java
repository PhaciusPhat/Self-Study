package Behavioral.Command;

import java.util.Stack;

public class CommandInvoker {
    Stack<CommandInterface> undoCommandStack = new Stack<>();
    Stack<CommandInterface> redoCommandStack = new Stack<>();
    Terminal terminal = new Terminal();

    void undo(){
        if(!undoCommandStack.isEmpty()){
            CommandInterface command = undoCommandStack.pop();
            command.undo();
            redoCommandStack.push(command);
        } else{
            System.out.println("There ain't command to undo");
        }
    }
    void redo(){
        if(!redoCommandStack.isEmpty()){
            CommandInterface command = redoCommandStack.pop();
            command.redo();
            undoCommandStack.push(command);
        } else{
            System.out.println("There ain't command to redo");
        }
    }

    void write(String text){
        CommandInterface newCommand = new ConcreteCommand(terminal, text);
        undoCommandStack.push(newCommand);
        redoCommandStack.clear();
    }
    void execute(){
        undoCommandStack.peek().execute();
    }
    void showHistory(){
        terminal.showHistory();
    }
}
