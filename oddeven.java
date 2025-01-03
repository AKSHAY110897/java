import java.util.*;
public class oddeven{
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
       int x = num.nextInt();
       
       if(x%2==0){
        System.out.println("the number is even");
    
       } else{
        System.out.println("the number is odd");
       }
    }
}
