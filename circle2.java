import java.util.*;
public class circle2{
    public static void main(String []args){
    Scanner di = new Scanner (System.in);
    System.out.println(" please enter the value of the circle radius");
    Double radius = di.nextDouble();
    Double area = Math.PI*radius*radius;
    System.out.println(" the radius of circle is "+ radius);
    System.out.println(" and hence the area of the circle is "+ area);
}
}