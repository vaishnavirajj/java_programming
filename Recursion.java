import java.util.*;
public class Recursion{
    public static int factorial(int x){
        if(x==0 || x==1){
            return 1;
        }
        else{
            int fact=x*factorial(x-1);
            return fact;
        }
    }
    public static int factorial_iterative(int x){
        if(x==1 || x==0){
            return 1;
        }
        else{
            int product = 1;
            for(int i=1;i<=x;i++){
                product=product*i;
               
            }
            return product;
        }
    }
    public static void main(String[] args){
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The factorial of "+ n +" is =" + factorial(n));
        System.out.println("The factorial of "+ n +" is =" + factorial_iterative(n));
        

    }
}
    



    
    