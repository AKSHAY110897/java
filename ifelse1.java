import java.util.*;

public class ifelse1{

    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b){
            System.out.println(" a and b both are equal");
        } else{
            if(a>b){
                System.out.println("a is greater than b");
            
            }else{
                System.out.println("a is lesser than b");
            }
        }
    }
}