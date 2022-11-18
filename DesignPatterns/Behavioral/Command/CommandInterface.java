package Behavioral.Command;

public interface CommandInterface {
    void undo();
    void redo();
    void execute();
    void showHistory();
}
