package class19;

public class RectangleSquare {
    /* Create 1 class in which create a methods that will calculate the area of Method name
    must be called calculateArea: Rectangle & Square
    Use separate class to test your code

     */
     double width;
     double length;


     RectangleSquare(double width, double length){
         this.width=width;
         this.length=length;
     }

    void calculateArea (){
        System.out.println("Area of Rectangle : "+width*length);
        System.out.println("Area of Square: "+width*2+length*2);
    }
}
