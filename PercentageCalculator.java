// import java.util.Scanner;
// public class PercentageCalculator{
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter Maths marks:");
//         int maths=sc.nextInt();
//         System.out.print("Enter Physics marks:");
//         int physics=sc.nextInt();
//         System.out.print("Enter Chemistry marks:");
//         int chemistry=sc.nextInt();
//         System.out.print("Enter English marks:");
//         int english=sc.nextInt();
//         System.out.print("Enter CS marks:");
//         int cs=sc.nextInt();
//         int total_marks=maths+physics+chemistry+english+cs;
//         float percentage=((float)total_marks/500)*100;
//         System.out.println(percentage);

//     }
// }





// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b


import java.util.*;
import java.io.*;
public class PercentageCalculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number a:");
        int a=sc.nextInt();
        System.out.println("Enter the number b:");
        int b=sc.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1: +(Addition)");
        System.out.println("2: -(Subtraction)");
        System.out.println("4: * (Multiplication)");
        System.out.println("3: /(Division)");
        System.out.println("5: %(Modulo)");
   

        int operation=sc.nextInt();
        switch(operation){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:if(b==0){
                System.out.println("Inavlid division");
            }
            else{
                System.out.println(a/b);
            }
           
            break;
            case 4:System.out.println(a*b);
            break;
            case 5:if(b==0){
                System.out.println("Invalid Division");
            }
            else{
                System.out.println(a%b);
            }
            
            break;
            default:System.out.println("Invalid Operator");
        }
    }
}
