// If function is written inside the classes reffered as Methods.
import java.util.*;

// public class Methods{
//     public static int Sum(int x , int y){
//         int z;
//         if(x>y){
//             z=x+y;
//         }
//         else{
//             z=x-y;
//         }
//         return z;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=Sum(a,b);
//         System.out.println(c);



//     }
// }



// Note:In case of Arrays,the reference is passed .Same is the case for object passing to methods. 

// public class Methods{
//     public static void Change(int a){
//         a=54;
//         return ;

//     }
//     public static void Change2(int[] arr){
//         arr[0]=98;
//     }

//     public static void main(String args[]){
        // int x=45;
        // Change(x);
        // System.out.println(x);
//         int[] marks={21,54,67,43,56,76};
//         Change2(marks);
//     System.out.println("The value of marks[0] after running Change2: "+ marks[0]);
//     }
// }


//Method OverLoading:- Two or more methods can have Same name but different Parmeters.

public class Methods{
    public static int Sum(int a ,int b){
        return a+b;
        
    }
    public static int Sum(int a,int b,int c){
        return a+b+c;
        
    }
    public static float Sum(float a, float b ){
        return a+b;
        
    }
    
    public static void main(String[] args){
        int x =5;
        int y =9;
        int z =7;
        Sum(x , y);
        
        int result1 =Sum( x , y);
        System.out.println(result1);
        
        int result2=Sum(x,y,z);
        System.out.println(result2);

        float u =5.6f;
        float v =6.2f;
        float result3=Sum(u,v);
        System.out.println(result3);



    }
}

