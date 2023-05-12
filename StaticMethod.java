package class19;

public class StaticMethod {
    /* Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    static void displayForm1(String a, String b) {
        System.out.println("Beautiful Morning");
    }

    static void displayForm2(String b, String a) {
        System.out.println("Hello Afternoon");
    }

    static void displayForm3(String c, String d) {
        System.out.println("Good Night");
    }

    public static void main(String[] args) {
        StaticMethod staticMethod = new StaticMethod();
        staticMethod.displayForm1("beautiful", "morning");
        staticMethod.displayForm2("hello", "afternoon");
        staticMethod.displayForm3("good","night");

    }
}
