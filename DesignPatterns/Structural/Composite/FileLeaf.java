package Structural.Composite;

public class FileLeaf implements FileComponent{

    private String nameFile;
    private int size;

    public FileLeaf(String nameFile, int size) {
        this.nameFile = nameFile;
        this.size = size;
    }

    @Override
    public void open() {
        System.out.println(nameFile + " is opening");
    }

    @Override
    public long getTotalSize() {
        return size;
    }
}
