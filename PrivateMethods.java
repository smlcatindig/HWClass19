package class19;

public class PrivateMethods {
    /* Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    private void method1(int a, int b) {
        System.out.println(a + b);
    }

    private void method2(double b, int c) {
        System.out.println(b * c);
    }

    private void method3(int d, int a) {
        System.out.println(d / a);
    }

    public static void main(String[] args) {

        PrivateMethods privateMethods = new PrivateMethods();
        privateMethods.method1(10, 5);
        privateMethods.method2(90.2, 40);
        privateMethods.method3(40, 20);
    }
}
