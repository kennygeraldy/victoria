abstract  class LibraryItem {
    protected String title;
    protected String itemId;
    protected boolean isCheckedOut;

    public LibraryItem (String title, String itemId){
        this.title = title;
        this.itemId = itemId;
    }

    public abstract void checkOut();
    public abstract void returnItem();
    public abstract void printDetails();

    public String getTitle() {
        return title;
    }

    public String getItemId() {
        return itemId;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }
}

