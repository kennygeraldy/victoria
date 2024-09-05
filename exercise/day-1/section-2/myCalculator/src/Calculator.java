public class Calculator {
    int a;
    int b;

    public void Sum() {
        int Sum;
        Sum = a + b;
        System.out.println(Sum);
    }
    public void Subtract() {
        int Sub;
        Sub = a - b;
        System.out.println(Sub);
    }
    public void Multiply() {
        int Mlt;
        Mlt = a * b;
        System.out.println(Mlt);
    }
    public void Divide() {
        float div;
        div = a / b;
        if (b == 0) {
            System.out.println("Error B is 0");
        } else {
            System.out.println(div);
        }
    }

}
