//Creating an array of 5 floats and Calculate their sum
import java.util.*;

// public class Array1{
//     public static void main(String args[]){
//         float[] marks = new float[5];
//         marks[0]=1.5f;
//         marks[1]=1.2f;
//         marks[2]=1.6f;
//         marks[3]=1.8f;
//         marks[4]=1.8f;
//         float sum=0;
//         for(float element:marks){
//             sum=sum+element;
           
//         }
//          System.out.println("The sum of marks =" + sum );
         

//     }
// }


//Write a program to find out whether a given integer is present in an array or not

// public class Array1{
//     public static void main(String[] args){
//         int[] marks={23,45,67,78,90,43};
//         boolean isInArray=false;
//         int num=90;
//         for(int element:marks){
//             if(num==element){
//                 isInArray = true;
//                 break;
//             }
//         }
//         if(isInArray){
//             System.out.println("The value is present in the array");
//         }
//         else{
//             System.out.println("The value is not present in the array");
//         }
//     }
// }


//Calculate the average marks from an array containing marks of all student in Physics using for each loop

// public class Array1{
//     public static void main(String args[]){
//         int[] physics={34,45,67,89,87};
//         int sum=0;
//         for(int elements:physics){
//             sum=sum+elements;
//         }
//         System.out.println("The average marks of all student in physics is " + sum/physics.length);
//     }
// }

// public class Array1{
//     public static void main(String[] args){
//         int[][] flat = {{1, 2, 3} , {4, 5, 6}};
//         for (int i=0 ; i < flat.length ; i++) {
//             for(int j=0 ; j < flat[i].length ; j++)  {
//                 System.out.println(flat[i][j]);
//             }
//         }
//     }
// }  

// public class Array1{
//     public static void main(String[] args){
//         int[] marks={10,20,30,40,50,60,70};
//         boolean isInArray=false;
//         int num= 49;
//         for(int element:marks){
//             if(num==element){
//                 isInArray = true;
//                 break;
//             }
//         }
//         if(isInArray){
//             System.out.println("Present");
//         }
//         else{
//             System.out.println("Not present");
//         }
//     }
// }

public class Array1{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double gpa =0.0;
    char grade = 'A';
    switch(n/10){
        case 10:
        case 9:
            grade = 'A';
            gpa = 4.0;
            break;
    case 8:
        grade ='B';
        gpa = 3.0;
    }
    System.out.println(n);
    System.out.println(grade);
    System.out.println(gpa);


}
}



//Create a program to add two matrices of size 2 x 3



