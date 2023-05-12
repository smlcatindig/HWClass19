package class19;
/* create 3 classes define 5 properties in each class and one printInfo method that will print the values
of these variables create constructors as well in each child class to initialize those properties
create one object of each class and call the printInfo method
 */
public class Animal {
    private String name;
    private String color;
    private int age;
    private double weight;
    private char gender;

    public Animal(String name, String color, int age, double weight, char gender) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight+" "+gender);
    }

}
class Dog extends Animal{
    double price;
   public Dog(String name, String color, int age, double weight, char gender, double price){
       super(name, color, age, weight, gender);
       this.price=price;
}
    void printInfo(){
       super.printInfo(); // reusing the printInfo method from parent class by using super keyword
        System.out.println(price);
    }

}
class Cat extends Animal{
 public Cat(String name, String color, int age, double weight, char gender){
     super(name, color, age, weight, gender);
    }
}

class Horse extends Animal{
    public Horse(String name, String color, int age, double weight, char gender) {
        super(name, color, age, weight, gender);
}
}
class AnimalTester {
    public static void main(String[] args) {
        Dog dog=new Dog("Pepper", "Black", 2,9.3, 'f', 2000);
        dog.printInfo();

        Cat cat=new Cat("Kitty", "White", 3, 6.5,'f');
        cat.printInfo();

        Horse horse=new Horse("Yoko", "Brown", 5, 12.7, 'm');
        horse.printInfo();
    }
}
