package Structural.Composite;

import java.util.Arrays;
import java.util.List;

public class Composite {
    public static void main(String[] args){
        FileComponent file1 = new FileLeaf("file 1", 10);
        FileComponent file2 = new FileLeaf("file 2", 5);
        FileComponent file3 = new FileLeaf("file 3", 12);

        List<FileComponent> files = Arrays.asList(file1, file2, file3);
        FileComponent folder = new FileFolderComposite(files);
        List<FileComponent> files2 = Arrays.asList(folder, file1);
        FileComponent folder2 = new FileFolderComposite(files2);
        folder.open();
        System.out.println("Total Size: " + folder.getTotalSize());
        folder2.open();
        System.out.println("Total Size: " + folder2.getTotalSize());
    }
}
