import java.util.*;

//Q.1

// public class CodeTantra {
//     public static void determineZodiacSign(int month , int n) {
//         String zodiacSign = "cap" ;
//         switch(month){
//             case 1: if(n>=1 && n<=19) {
//                 zodiacSign = "Capricon";
//             }
//             else {
//                 zodiacSign = "Aquarius";
//             }
//             break;

//             case 2: if(n>=1 && n<=18) {
//                 zodiacSign = "Aquarius";
//             }
//             else {
//                 zodiacSign = "Pisces";
//             }
//             break;
//         }
//         System.out.println("Your ZodiacSign is " + zodiacSign);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int month = sc.nextInt();
//         int n = sc.nextInt();
//         determineZodiacSign(month , n);
//     }
// }

//Q.2

// public class CodeTantra {
//     public static int[] multiplyBySecretFactor(int[] numbers, int secretFactor) {

// //Write your code here
// for (int number :numbers) {
//     System.out.println(number*secretFactor);
// }
//     }



// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter array (comma separted)");
//     String inputNumbers = sc.nextLine();
//     String[] elements = inputNumbers.split(",");
//     int[] originalNumbers = new int[elements.length];
//     for(int i = 0;i<elements.length;i++){
//         originalNumbers[i] = Integer.parseInt(elements[i]);
//     }
//     System.out.print("enter secret");
//     int secretFactor= sc.nextInt();
//     int[] multipliedNumbers = multiplyBySecretFactor(originalNumbers,secretFactor);
//     for (int number : multipliedNumbers) {
//         System.out.print(number + " ");
//     }
// }
// }


//Q.3

//import java.util.Scanner;

// public class CodeTantra {
//     public static int[] multiplyBySecretFactor(int[] numbers, int secretFactor) {
        // int[] multipliedNumbers = new int[numbers.length];
        // for (int i = 0; i < numbers.length; i++) {
        //     multipliedNumbers[i] = numbers[i] * secretFactor;
        // }
        // return multipliedNumbers;

    //     for (int number : numbers) {
    //         int a = number*secretFactor;
    //         //System.out.println(number*secretFactor);
    //         return ;
    //     }
        
    // }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array (comma separated):");
//         String inputNumbers = sc.nextLine();
//         String[] elements = inputNumbers.split(",");
//         int[] originalNumbers = new int[elements.length];
//         for (int i = 0; i < elements.length; i++) {
//             originalNumbers[i] = Integer.parseInt(elements[i]);
//         }
//         System.out.print("Enter secret factor:");
//         int secretFactor = sc.nextInt();
//         int[] multipliedNumbers = multiplyBySecretFactor(originalNumbers, secretFactor);
//         System.out.println("Multiplied numbers:");
//         for (int number : multipliedNumbers) {
//             System.out.print(number + " ");
//         }
//     }
// }

//Q.4

// public class CodeTantra {
//     public static void main(String args[]) {
//        try(Scanner sc = new Scanner(System.in)) {
//         // String input1 = sc.nextLine();
//         // String input2 = sc.nextLine();
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int result = (a^b);
//         System.out.println(result);
       
//     }
// }
// }


//Q.5

// Wap to check whether the number is armstrong no or not

// public class CodeTantra {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number:");
//     int num = sc.nextInt();
//     int rem ;
//     int sum = 0;
//     int originalNumber = num;
//     while (num>0) {
//         rem = num % 10; 
//         sum += rem * rem * rem;
//         num = num/10;
        


//     }
//     if(originalNumber == sum ) {
//         System.out.println("Armstrong Number");
//     }
//     else {
//         System.out.println("NOt a armstrong Number");
//     }

//     }
// }


// public class CodeTantra{
// class Base {
//     Base()
//     {
//         System.out.println("I am a constructor of base class");
//     }
// }
// class Derived {
//     Derived()
//     {
//         System.out.println("I am a constructor of dervied class.");
//     }
// }Class C {
//     public static void main(String[] args) {
//         Derived d = new Derived();
//         System.out.println(d);
//     }
// }
// }



// public class CodeTantra {
//     static class Base {
//         Base() {
//             System.out.println("I am a constructor of base class");
//         }
//     }

//     static class Derived extends Base {
//         Derived() {
//             super(); // Call the constructor of the base class
//             System.out.println("I am a constructor of derived class.");
//         }
//     }

//     public static void main(String[] args) {
//         Derived d = new Derived();
//         System.out.println(d);
//     }
// }





//Prime In limits
// public class CodeTantra {
//     static boolean isPrime(int n) {
//        if (n<=1) {
//         return false;
//        }
//        for (int i = 2 ; i<=Math.sqrt(n) ; i++) {
//         if (n%i == 0) {
//             return false;
//         }
        
//        }
//        return true;
//     }

//     static void primesInRange(int start , int end ) {
//         for(int i=start ; i<=end ; i++) {
//            if (isPrime(i)) {
//             System.out.print(i + " ");
//            }
//         }
//         System.out.println();

//     }
    
//     public static void main(String[] args) {
//         int start = 2;
//         int end = 11;
//         primesInRange(start , end);
        
//     }
// }

//Swapping the number with XOR operator

// public class CodeTantra {
//     public static void main(String[] args) {
//     int a = 5;
//     int b = 10;
//     a = a ^ b;
//     b=  b ^ a;
//     a = a ^ b;
//     System.out.println(a);
//     System.out.println(b);

// }
// }

// Printing the sum and reverse of a given number 

// public class CodeTantra {
//     static void sumAndReverse(int n) {
//         int sum = 0;
//         int rem , reverse;
//         while (n>0) {
//             rem = n%10;
           
//             System.out.print(rem);
//             sum += rem; 
//             n =n / 10;
//         }
//         System.out.println();
//         System.out.print("Sum of digits: " +sum);
//     }
//     public static void main(String[] args) {
//         int num = 384;
//        sumAndReverse(num);

//     }
// }




// class Base {
//     Base() {
//         System.out.println("I am constructor of Base class");
//     }
// }

// class Derived extends Base {
//     Derived() {
//         super();
//         System.out.println("I am constructor of Derived class");
//     }
// }

// class CodeTantra {
//     public static void main(String[] args) {
//         Derived D = new Derived();
//     }
// }


public class CodeTantra {
    static int staticVar;
    int instanceVar;

    // Static block
    static {
        System.out.println("Inside static block");
        staticVar = 10;
    }

    // Non-static block
    {
        System.out.println("Inside non-static block");
        instanceVar = 20;
    }

    // Default constructor
    public CodeTantra() {
        System.out.println("Inside default constructor");
    }

    // Parameterized constructor
    public CodeTantra(int value) {
        System.out.println("Inside parameterized constructor with value: " + value);
    }

    public static void main(String[] args) {
        System.out.println("Creating object with default constructor:");
        CodeTantra obj1 = new CodeTantra();

        System.out.println("\nCreating object with parameterized constructor:");
        CodeTantra obj2 = new CodeTantra(100);

        System.out.println("\nAccessing static variable: " + staticVar);
    }
}
