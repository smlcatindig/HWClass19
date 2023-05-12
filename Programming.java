package class19;

public class Programming {
    /* Create a class named 'Programming'. While creating an object of the class,
    if nothing is passed to it, then the message "I love programming languages" should be printed.
    If some String is passed to it, then in place of "programming languages"
    the value variable should be printed. Example, if we pass "Java", then "I love Java" should be printed.
     */

    void print(){
        System.out.println("I love programming language");
    }
    void print(String word){
        System.out.println("I love "+word);
    }

    public static void main(String[] args) {
        Programming programming=new Programming();
        programming.print();
        programming.print("Java");


    }
}
