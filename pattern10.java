public class pattern10{
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=5; i++){
            for(int j=i; j<=n-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();

    }
}}
