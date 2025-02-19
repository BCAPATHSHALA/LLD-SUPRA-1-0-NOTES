import java.util.*;

// Step 1: Iterator Interface
interface Iterator {
    boolean hasNext();
    String next();
}

// Step 2: Concrete Iterator for ArrayList
class ArrayListIterator implements Iterator {
    private List<String> videos;
    private int index = 0;

    public ArrayListIterator(List<String> videos) {
        this.videos = videos;
    }

    @Override
    public boolean hasNext() {
        return index < videos.size();
    }

    @Override
    public String next() {
        if (hasNext()) {
            return videos.get(index++);
        }
        return null;
    }
}

// Step 3: Concrete Iterator for LinkedList
class LinkedListIterator implements Iterator {
    private List<String> videos;
    private int index = 0;

    public LinkedListIterator(List<String> videos) {
        this.videos = videos;
    }

    @Override
    public boolean hasNext() {
        return index < videos.size();
    }

    @Override
    public String next() {
        if (hasNext()) {
            return videos.get(index++);
        }
        return null;
    }
}

// Step 4: Concrete Iterator for HashSet
class HashSetIterator implements Iterator {
    private java.util.Iterator<String> iterator;

    public HashSetIterator(Set<String> videos) {
        this.iterator = videos.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public String next() {
        return iterator.hasNext() ? iterator.next() : null;
    }
}

// Step 5: Collection Interface (Aggregate)
interface PlaylistCollection {
    void addVideo(String video);
    Iterator createIterator();
}

// Step 6: Concrete Collection for ArrayList
class ArrayListPlaylist implements PlaylistCollection {
    private List<String> videos = new ArrayList<>();

    public void addVideo(String video) {
        videos.add(video);
    }

    @Override
    public Iterator createIterator() {
        return new ArrayListIterator(videos);
    }
}

// Step 7: Concrete Collection for LinkedList
class LinkedListPlaylist implements PlaylistCollection {
    private List<String> videos = new LinkedList<>();

    public void addVideo(String video) {
        videos.add(video);
    }

    @Override
    public Iterator createIterator() {
        return new LinkedListIterator(videos);
    }
}

// Step 8: Concrete Collection for HashSet
class HashSetPlaylist implements PlaylistCollection {
    private Set<String> videos = new HashSet<>();

    public void addVideo(String video) {
        videos.add(video);
    }

    @Override
    public Iterator createIterator() {
        return new HashSetIterator(videos);
    }
}

// Step 9: Client Code (Main Method)
public class WithIteratorDifferentDataStructure {
    public static void main(String[] args) {
        System.out.println("Using ArrayList:");
        PlaylistCollection arrayListPlaylist = new ArrayListPlaylist();
        arrayListPlaylist.addVideo("Video A");
        arrayListPlaylist.addVideo("Video B");
        arrayListPlaylist.addVideo("Video C");
        printPlaylist(arrayListPlaylist.createIterator());

        System.out.println("\nUsing LinkedList:");
        PlaylistCollection linkedListPlaylist = new LinkedListPlaylist();
        linkedListPlaylist.addVideo("Video X");
        linkedListPlaylist.addVideo("Video Y");
        linkedListPlaylist.addVideo("Video Z");
        printPlaylist(linkedListPlaylist.createIterator());

        System.out.println("\nUsing HashSet:");
        PlaylistCollection hashSetPlaylist = new HashSetPlaylist();
        hashSetPlaylist.addVideo("Video 1");
        hashSetPlaylist.addVideo("Video 2");
        hashSetPlaylist.addVideo("Video 3");
        printPlaylist(hashSetPlaylist.createIterator());
    }

    private static void printPlaylist(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println("Playing: " + iterator.next());
        }
    }
}

/*
Using ArrayList:
Playing: Video A
Playing: Video B
Playing: Video C

Using LinkedList:
Playing: Video X
Playing: Video Y
Playing: Video Z

Using HashSet:
Playing: Video 2
Playing: Video 1
Playing: Video 3
*/