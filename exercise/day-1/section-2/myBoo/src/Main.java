//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

//      Nambahin buku
        Book book1 = new Book("The Java", "B001", "Kenny G", 44);
        Book book2 = new Book("Java is King", "B002", "Jonathan L", 131);
        DVD dvd1 = new DVD("The Way of Java", "D001", "Bryan F", 213);
        DVD dvd2 = new DVD("Java is Life", "D002", "James Bond", 131);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(dvd1);
        library.addItem(dvd2);

//      List keseluruhan buku
        System.out.println("\n==========================");
        System.out.println("= List Keseluruhan Buku  =");
        System.out.println("==========================");
        library.listAllItems();

//      Checkout buku
        System.out.println("\n");
        library.checkOutItem("B001");
        library.checkOutItem("D001");

//      List buku setelah di checkout
        System.out.println("\n==============================");
        System.out.println("= List Buku Setelah CheckOut =");
        System.out.println("==============================");
        library.listAllItems();

//      Return buku dan DVD
        System.out.println("\n");
        library.returnItem("B001");
        library.returnItem("D001");

//      List buku dan DVD yang telah di return
        System.out.println("\n===============================");
        System.out.println("=  List Buku Setelah Return   =");
        System.out.println("===============================");
        library.listAllItems();

//      Search item dengan title
        System.out.println("\n");
        System.out.println("Ini Search by Title: ");
        LibraryItem searchResult = library.searchByTitle("Java is King");
        if (searchResult != null) {
            searchResult.printDetails();
        }

//        Ngebalikin semua item yang telah di search
        System.out.println("\n==========================");
        System.out.println("= List Keseluruhan Buku  =");
        System.out.println("==========================");
        library.listAllItems();
    }
}
