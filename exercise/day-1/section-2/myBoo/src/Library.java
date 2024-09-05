import java.util.ArrayList;

interface LibraryManagement {
    void addItem(LibraryItem item);
    void removeItem(String itemId);
    void listAllItems();
    void checkOutItem(String itemId);
    void returnItem(String itemId);
    LibraryItem searchByTitle(String title);
}


class  Library implements LibraryManagement {
    private ArrayList<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Item has been added succesfully " + item.getTitle());
    }

    @Override
    public void removeItem(String itemId) {
        LibraryItem item = findItemById(itemId);
        if (item != null) {
            items.remove(item);
            System.out.println("Item has been removed succesfully " + item.getTitle());
        } else {
            System.out.println("Item with ID: " + itemId +" can't be found");
        }
    }

    @Override
    public void listAllItems(){
        for (LibraryItem item : items) {
            item.printDetails();
        }
    }

    @Override
    public void checkOutItem(String itemId) {
        LibraryItem item = findItemById(itemId);
        if (item != null) {
            item.checkOut();
        } else {
            System.out.println("Item with ID: " + itemId +" can't be found");
        }
    }

    @Override
    public void returnItem(String itemId) {
        LibraryItem item = findItemById(itemId);
        if (item != null) {
            item.returnItem();
        } else {
            System.out.println("Item with ID: " + itemId +" can't be found");
        }
    }

    @Override
    public LibraryItem searchByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        System.out.println("Item with title: " + title +" can't be found");
        return null;
    }

    private LibraryItem findItemById(String itemId) {
        for (LibraryItem item : items) {
            if (item.getItemId().equals(itemId)) {
                return item;
            }
        }
        return null;
    }
}