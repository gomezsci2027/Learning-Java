//Practice Problem 1

class LibraryItem {
    private String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public void returnItem() {
        System.out.println(title);
    }

    public String getTitle() {
        return title;
    }
}

public class Main {
    public static void main(String[] args) {
        
        LibraryItem book1 = new LibraryItem("The Kite Runner");
        LibraryItem book2 = new LibraryItem("A Tree Grows in Brooklyn");
        LibraryItem book3 = new LibraryItem("Moby Dick");
        
        LibraryItem[] items = {book1, book2, book3};
        
        returnAll(items);
    }

    public static void returnAll(LibraryItem[] items) {
        for (LibraryItem item : items) {
            item.returnItem();
        }
    }
}

//Practice Problem 2

import java.util.ArrayList;

class LibraryItem {
    private String title;
    private boolean available;  

    
    public LibraryItem(String title, boolean available) {
        this.title = title;
        this.available = available;
    }

    
    public String getTitle() {
        return title;
    }

    
    public boolean isAvailable() {
        return available;
    }

   
    public void returnItem() {
        System.out.println("Returning: " + title);
    }
}

public class Main {
    public static void main(String[] args) {
        
        LibraryItem book1 = new LibraryItem("The Great Gatsby", true);
        LibraryItem book2 = new LibraryItem("1984", false);
        LibraryItem magazine = new LibraryItem("National Geographic", true);
        LibraryItem book3 = new LibraryItem("Moby Dick", false);

        LibraryItem[] items = {book1, book2, magazine, book3};

        ArrayList<LibraryItem> availableItemsList = availableItems(items);

        System.out.println("\nAvailable items:");
        for (LibraryItem item : availableItemsList) {
            System.out.println(item.getTitle());
        }
    }

    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> availableList = new ArrayList<>();  

        for (LibraryItem item : items) {
            
            if (item.isAvailable()) {
                availableList.add(item);
            }
        }

        return availableList;  
    }
}
