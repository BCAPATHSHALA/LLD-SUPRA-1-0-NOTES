import java.util.ArrayList;
import java.util.List;

// A basic file system structure without Composite Pattern
class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("File: " + name);
    }
}

class Folder {
    private String name;
    private List<File> files = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void display() {
        System.out.println("Folder: " + name);
        for (File file : files) {
            file.display();
        }
    }
}

// Client
public class WithoutComposite {
    public static void main(String[] args) {
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");

        Folder folder = new Folder("Documents");
        folder.addFile(file1);
        folder.addFile(file2);

        folder.display();
    }
}

/*
OUTPUT:
Folder: Documents
    File: File1.txt
    File: File2.txt
*/
