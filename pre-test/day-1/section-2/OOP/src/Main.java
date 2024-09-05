public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Toyota";
        myCar.year = 2020;
        myCar.drive();

        Motor myMotor = new Motor("PCX", 2010);
        Motor myMotor2 = new Motor("Supra", 2002);

        Sepeda mySepeda = new Sepeda();

        System.out.println(myMotor.model + myMotor.year);
        System.out.println(myMotor2.model + myMotor2.year);
        System.out.println(mySepeda.model + mySepeda.year);
        System.out.println(mySepeda.model + mySepeda.year);
    }
}