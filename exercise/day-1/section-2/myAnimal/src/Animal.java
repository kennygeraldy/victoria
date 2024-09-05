//public class Animal {
//    public String name;
//    public String species;
//
//    void eat() {
//        System.out.println("This animal eats food.");
//    }
//    void makeSound() {
//        System.out.println("e.g., 'Some generic animal sound'");
//    }
//}
    abstract  class Animal {
        abstract void sound();

        void sleep() {
            System.out.println("This animal is sleeping.");
        }
    }



