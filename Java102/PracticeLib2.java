package Java102;

import java.util.ArrayList;

        //Practice Problem 2

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

public class PracticeProblem2 {
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


