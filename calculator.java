import java.util.*;

public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //here 1 -> addition
        // 2-> substraction
        //3->multiplication
        //4-> division
        //5-> modulus
        switch (c){
            case 1 : System.out.println("addition is " + ( a + b ));
            break;
            case 2 : System.out.println(" substraction is "+ (a-b));
            break;
            case 3 : System.out.println(" multiplication is "+ (a*b));
            break;
            case 4 : if(b==0){
                System.out.println(" invalid division");
            }else{
                System.out.println("division is " + (a/b));
            }
            break;
            case 5 : if (b==0){
                System.out.println(" invalid division");
            }else{
                System.out.println(" remainder is "+ (a%b));
            }
            break;
            default : System.out.println(" invalid function");
        }
    }
}