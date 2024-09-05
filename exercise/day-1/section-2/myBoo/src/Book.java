class Book extends LibraryItem {
    private String author;
    private int pages;

    public Book(String title, String itemId, String author, int pages) {
        super(title, itemId);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println("The book '" + title + "' has been checked out.");
        } else {
            System.out.println("The book '" + title + "' is checked out.");
        }
    }

    @Override
    public void returnItem() {
        if(isCheckedOut) {
            isCheckedOut = false;
            System.out.println("The book '" + title + "' has been returned.");
        } else {
            System.out.println("The book '" + title + "' wasn't returned yet.");
        }
    }

    @Override
    public void printDetails() {
        System.out.println("Book [ID: " + itemId + ", Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Checked Out: " + isCheckedOut + "]");
    }
}


