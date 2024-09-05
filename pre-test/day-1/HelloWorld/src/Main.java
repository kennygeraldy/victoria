import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    public Main() {

//        int umur;
//        umur = 22;
//
//        String myName;
//        myName = "Kenny Geraldy Chandra";
//
//        long gaji;
//        gaji = 0;
//
//        double duit;
//        duit = 1000000000;
//
//        float tinggi;
//        tinggi = 180.50f;
//
//        char grade;
//        grade = 'A';
//
//        boolean isJavaFun;
//        isJavaFun = true;
//
//
//        System.out.println("Hello World\n");
//        System.out.println("Biodata Saya");
//        System.out.println("===========================");
//        System.out.println("Nama saya adalah "+myName);
//        System.out.println("Umur saya adalah "+umur);
//        System.out.println("Tinggi saya adalah "+tinggi);
//        System.out.println("Duit saya adalah Rp. "+duit);
//        System.out.println("Gaji saya adalah Rp. "+gaji);
//        System.out.println("Nilai rata-rata saya adalah "+grade);
//        System.out.println("Menurut saya java itu mengasikan "+isJavaFun);

//        Latihan ke 2
//
//        final float pi = 3.14F;
//        int radius;
//
//        do {
//            System.out.print("Masukkan Luas: ");
//            radius = sc.nextInt();
//            sc.nextLine();
//        } while (radius == 0); {
//            System.out.print(pi * (radius * radius));
//        }


//        Latihan 3
        int angka;

        System.out.println("Insert number");
        angka = sc.nextInt();
        sc.nextLine();
        if (angka %2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args) {
        new Main();

    }
}