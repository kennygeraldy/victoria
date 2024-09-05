public class Main {
    public static void main(String[] args) {

        myEmployee employee = new myEmployee();
        employee.name = "Kenny Geraldy Chandra";
        employee.npk = 68775;
        employee.salary = 100000000;
        employee.address = "Jl Kurniawati No.1";
        employee.age = 22;

        myEmployee employee2 = new myEmployee();
        employee2.name = "James Bond";
        employee2.npk = 68776;
        employee2.salary = 10000000;
        employee2.address = "Jl Kurniawati No.2";
        employee2.age = 21;

        employee.sayHello();

        System.out.println(employee.name +" "+ employee.npk +" "+ employee.salary +" "+ employee.address +" "+ employee.age);
        System.out.println(employee2.name +" "+ employee2.npk +" "+ employee2.salary +" "+ employee2.address +" "+ employee2.age);
    }
}