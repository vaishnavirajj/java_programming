// Print square pattern
import java.util.*;
// public class Patterns{
//     public static void main(String args[]){
//         for(int line=1;line<=4;line++){
//             System.out.println("****");
//         }
//     }
// }


public class Patterns{
    public static void main(String[] args);
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    System.out.println("Enter the size of square:");
    for(int i=1;i<=size;i++){
        for(int j=1;j<=size;j++){
            if(i==1 || i==size || j==1 || j==size){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}