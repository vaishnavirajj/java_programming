//Print all even number till n

import java.util.*;
// import java.io.*;

// public class loops {
//     public static void main(String args[]){
//         System.out.print("Enter the number:");
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         for(int i=2;i<=num;i+=2){
//             System.out.println(i);
//         }
        
//     }
// }

// public class loops{
//     public static void main(String args[]){
//         for(; ;){
//             System.out.println("Apna College");
//         }
//     }
// }  


//Check if a number is prime or not

public class loops{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        if(n==2){
            System.out.print("n is prime");
        } else{
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        
        if(isPrime==true){
            System.out.print("n is prime");
        }
        else{
            System.out.print("n is not prime");
        }

    }

    
}
}
