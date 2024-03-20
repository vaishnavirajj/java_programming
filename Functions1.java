//Write a Java method to compute the average of three numbers..
import java.util.*;
// public class Functions1{
//     public static void calculateAverage(int a,int b,int c){
//         int average=(a+b+c)/3;
//         System.out.println("Average of three number is " + average);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int u=sc.nextInt();
//         int v=sc.nextInt();
//         int w=sc.nextInt();
//         calculateAverage(u,v,w);
        

//     }
    
// }

// Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise.
//Also write a program to test your method.

public class Functions1{
    public static boolean isEven(int n){
       
        if(n%2==0){
           
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isEven(n);


    }
}
