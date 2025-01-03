import java.util.*;
public class circle1{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("please enter the value of radius ");

        double radius = sc.nextDouble();

        double area = Math.PI*radius*radius;
        System.out.println(radius + " is the radius of the circle and ");
        System.out.println("the area of the circle is " +area);
    }
}