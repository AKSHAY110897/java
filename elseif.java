import java.util.*;

public class elseif{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int button = sc.nextInt();

        if (button ==1){
            System.out.println("hello");
        }else if(button == 2){
            System.out.println("namaste");
        }else if(button == 3){
            System.out.println("bonjour");
        }else if(button ==4){
            System.out.println("guten tag");
        }else{
            System.out.println("invalid button");
        }
    }
}