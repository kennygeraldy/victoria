//public class Dog extends Animal {
//    void bark() {
//        System.out.println("The Dog Bark");
//    }
//    @Override
//    void makeSound() {
//        System.out.println("Woof Woof");
//    }
//}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}