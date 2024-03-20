// Functions/Methods
import java.util.*;
// public class Functions{
//     public static void printHelloWorld(){
//         System.out.println("Hello World");
//         return;
//     }

// public static int calculateSum(int num1,int num2){  //parameter or formal parameter
//     int sum=num1+num2;
//     return sum;
// }
// public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//     int sum=calculateSum(a,b); //argument or actual parameter
//     System.out.println("Sum is " + sum);

// }
// }


//Call by value means assigning any variable copy of that value.
//Call by Reference means assigning any variable original value.
//Java always calls by value
// public class Functions{
//     public static void changeA(int a){
//         a=5;
//         return;
       
//     }
//     public static void main(String args[]){
//         int a=10;
//         changeA(a);
//         System.out.println(a);

//     }
// }


//Product of a and b
// import java.util.*;
// public class Functions{
//     public static int calculateProduct(int num1,int num2){
//         int product=num1*num2;
//         return product;

//     }


// public static void main(String args[]){
//     Scanner sc =new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//     int product=calculateProduct(a,b);
//     System.out.println("Product of a and b is "+ product);

// }
// }


//Calculate factorial of the number input by the user

// public class Functions{
//     public static long calculateFactorial(int n){
//         long fact=1;
//         for(int i=1;i<=n;i++){
//         fact=fact*i;
        
//         }
//         return fact;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         long factorial=calculateFactorial(n);
//         System.out.println("Factorial of " + n + " is " + factorial);
//         sc.close();

 
//     }
// 
//}

//Find Binomial Coefficient
// public class Functions{
//     public static long calculateFactorial(int n){
//         long fact=1;
//         for(int i=1;i<=n;i++){
//         fact=fact*i;
        
//         }
//         return fact;
//     }
// public static long calculateBC(int n,int r){
//         long fact_n=calculateFactorial(n);
//         long fact_r=calculateFactorial(r);
//         long fact_nmr=calculateFactorial(n-r);
//         long BinoCoeff=fact_n/(fact_r*fact_nmr);
//         return BinoCoeff;
// }
//       public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter n:");
//         int n=sc.nextInt();
//         System.out.print("Enter r:");
//         int r=sc.nextInt();
//         long BC=calculateBC(n,r);
//         System.out.println("Binomial Coefficient is " + " = " + BC);

//     }

// }


//Function Overloading depends on number of parameter and types of parameter .don not depend on return type

//USING PARAMETER
// public class Functions{
// //function to calculate sum of 2 numbers
// public static int Sum(int a,int b){
//     return a+b;
// }
// //function to calculate sum of 3 numbers
// public static int Sum(int a,int b,int c){
//     return a+b+c;
// }
// public static void main(String args[]){
//     System.out.println(Sum(5,3));
//     System.out.println(Sum(2,3,3));
// }
// }


//USING DATATYPES
// public class Functions{
//     public static int sum(int a,int b){
//         return a+b;
//     }
//     public static float sum(float a,float b){
//         return a+b;
//     }
//     public static void main(String args[]){
//         System.out.println(sum(2,3));
//         System.out.println(sum(2.8f,3.9f));
//     }
// }


//Check if the number is prime or not
// public class Functions{
    
//     public static boolean isPrime(int n){
//         if(n==2){
//         return true;
//     }
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 return false;
//             }

//         }
//         return true;
//     }

//     public static void main(String args[]){
//         System.out.print(isPrime(3));

//     }
// }


//Print all prime in a range.

// public class Functions{
//     public static boolean isPrime(int n){
//         if(n==2){
//         return true;
//     }
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 return false;
//             }

//         }
//         return true;
//     }
        
//     public static void Primesinrange(int n){
//         for(int i=2;i<=n;i++){
//         if(isPrime(i)){
//             System.out.print(i+" ");
//         }
        
//         }
//         System.out.println();

//     }
//     public static void main(String args[]){
//         System.out.print("Enter the number:");
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         Primesinrange(a);
        


//     }
// }



//Convert from binary to decimal
// public class Functions{
//     public static void binToDec(int binNum){
//         int myNum=binNum;
//         int pow=0;
//         int decNum=0;
//         while(binNum>0){
//             int lastDigit=binNum%10;
//             decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
            
//             pow++;

//             binNum=binNum/10;
//         }

//     System.out.println("decimal of "+ myNum + " = "+ decNum);

//     }
//     public static void main(String args[]){
//         binToDec(10109998);
       


//     }
// }



public class Functions {
    public static void main(String args[]) {
        String naam = "Vaishnavi";
       String msg = greet(naam);
      
    }
    static void greet(String name) {
        name = "Shelley";
        System.out.println("Hello" + " " + name);

        

    }
}