import java.util.ArrayList;
import java.util.List;

// Step 1: Define Component (Common Interface)
// Component
interface FileSystem {
    void display();
}


// Step 2: Define Leaf (File)
// Leaf
class File implements FileSystem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("File: " + name);
    }
}

// Step 3: Define Composite (Folder)
// Composite
class Folder implements FileSystem {
    private String name;
    private List<FileSystem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem component) {
        children.add(component);
    }

    @Override
    public void display() {
        System.out.println("Folder: " + name);
        for (FileSystem component : children) {
            component.display();
        }
    }
}


// Step 4: Use the Composite Pattern
// Client
public class WithComposite {
    public static void main(String[] args) {
        // Create files
        FileSystem file1 = new File("File1.txt");
        FileSystem file2 = new File("File2.txt");
        FileSystem file3 = new File("File3.txt");

        // Create folders
        Folder documents = new Folder("Documents");
        Folder images = new Folder("Images");

        // Build the hierarchy
        documents.add(file1);
        documents.add(file2);
        images.add(file3);

        Folder root = new Folder("Root");
        root.add(documents);
        root.add(images);

        // Display structure
        root.display();
    }
}


/*
OUTPUT:
Folder: Root
    Folder: Documents
        File: File1.txt
        File: File2.txt
    Folder: Images
        File: File3.txt
*/