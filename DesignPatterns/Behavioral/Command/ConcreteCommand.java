package Behavioral.Command;

public class ConcreteCommand implements CommandInterface {
    private Terminal terminal;
    private String text;

    public ConcreteCommand(Terminal terminal, String text) {
        this.terminal = terminal;
        this.text = text;
        terminal.write(text);
    }

    @Override
    public void undo() {
        terminal.removeLast();
    }

    @Override
    public void redo() {
        terminal.write(text);
    }

    @Override
    public void execute() {
        terminal.execute();
    }

    @Override
    public void showHistory() {
        terminal.showHistory();
    }
}
