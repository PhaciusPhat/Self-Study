package Structural.Composite;

import java.util.List;

public class FileFolderComposite implements FileComponent {

    private List<FileComponent> files;

    public FileFolderComposite(List<FileComponent> files) {
        this.files = files;
    }

    @Override
    public void open() {
        for (FileComponent file : files)
            file.open();
    }

    @Override
    public long getTotalSize() {
        long totalSize = 0;
        for (FileComponent file : files){
            totalSize += file.getTotalSize();
        }
        return totalSize;
    }
}
