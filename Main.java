// import java.util.*;
// public class Main {
//     public static void main(String args[]){
//         //taking input 
//         Scanner sc=new Scanner(System.in);
//         int a =sc.nextInt();
//         int b=sc.nextInt();
//         int sum=a+b;
//         System.out.println(sum);

//     }
    
// }

//Conditional Statement

// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int age=sc.nextInt();
//         if(age<18){
//             System.out.println("You are not adult");
//     }
//     else{
//         System.out.println("Adult");
//     }
// }
// }


//Check the number is odd or even
// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         if(num%2==0){
//             System.out.println("Number is Even");
//         }
//         else if(num%2!=0){
//             System.out.println("Number is Odd");
//         }

//     }
// }

// import java.util.*;
// public class Main{
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         if(a==b){
//             System.out.println("a and b are equal");
//         }
//         else if(a<b){
//             System.out.println("b is greater than a");
//         }
//         else if(a>b){
//             System.out.println("a is greater than b");
//         }
//     }
// }

//Switch Case

// import java.util.*;
// import java.io.*;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number between 1 to 7");
//         int digit=sc.nextInt();
//         switch(digit){
//             case 1:System.out.println("Monday");
//             break;
//             case 2:System.out.println("Tuesday");
//             break;
//             case 3:System.out.println("Wednesday");
//             break;
//             case 4:System.out.println("Thursday");
//             break;
//             case 5:System.out.println("Friday");
//             break;
//             case 6:System.out.println("Saturday");
//             break;
//             case 7:System.out.println("Sunday");
//             break;
//             default:System.out.println("Invalid number");
//         }
//     }
// }


//Print the sum of first n natural number 

// import java.util.*;
// import java.io.*;
// public class Main{
//     public static void main(String args[]){
//         System.out.print("Enter the number:");
//         Scanner sc =new Scanner(System.in);
//         int num=sc.nextInt();
//         int sum=0;
//         for(int i=1;i<=num;i++){
//             sum=sum+i;
//         }
//         System.out.println(sum);

//     }
// }

//Print the table of the number input by the user

import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]){
        System.out.print("Enter the number of the table:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num + " * "+ i + " = " + num*i);
        }

    }
}