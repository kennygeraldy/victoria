class DVD extends LibraryItem {
    private String director;
    private int duration;

    public DVD(String title, String itemId, String director, int duration) {
        super(title, itemId);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println("The DVD '" + title + "' has been checked out.");
        } else {
            System.out.println("The DVD '" + title + "' is checked out.");
        }
    }

    @Override
    public void returnItem() {
        if(isCheckedOut) {
            isCheckedOut = false;
            System.out.println("The DVD '" + title + "' has been returned.");
        } else {
            System.out.println("The DVD '" + title + "' wasn't returned yet.");
        }
    }

    @Override
    public void printDetails() {
        System.out.println("DVD [ID: " + itemId + ", Title: " + title + ", Director: " + director + ", Duration: " + duration + " minutes, Checked Out: " + isCheckedOut + "]");
    }
}