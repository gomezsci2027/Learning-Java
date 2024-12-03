package Java102;

import Java102.Java102.Point;

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

