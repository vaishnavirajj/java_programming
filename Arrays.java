//  public class Arrays{
//     public static void main(String args[]){
//         int[] marks =new int[5];
//         marks[0]=24;
//         marks[1]=22;
//         marks[2]=14;
//         marks[3]=44;
//         marks[4]=20;
//         System.out.println(marks[2]);

//     }



// }

// 1-int[] marks;-->Declaration
// marks =new int[5];-->Memory Allocation

// 2-int[] marks=new int[5];--->Declaration+Memory Allocation

// 3-int[] marks={12,34,56,78,56};-->Declare+Initialize


//Array length

//  public class Arrays{
//     public static void main(String args[]){
//         int[] marks =new int[5];
//         marks[0]=24;
//         marks[1]=22;
//         marks[2]=14;
//         marks[3]=44;
//         marks[4]=20;
//         System.out.println(marks.length);

//     }
//  }



//Displaying an array using for loop

// public class Arrays{
//     public static void main(String args[]){
//         String[] name=new String[4] ;
//         name[0]="Shelley";
//         name[1]="Omie";
//         name[2]="Anjali";
//         name[3]="Aryan";
//         for(int i=0;i<name.length;i++){
//             System.out.println(name[i]); //This is called array tranversal
//         }
        
//     }
// }



//Print element of an array in reverse order

// public class Arrays{
//     public static void main(String args[]){
//         String[] subject={"Java","OS","Cloud Solution","Cloud Architecture","OS LAB","PEA","GEN AI","ALGORITHM"};
//         for(int i=(subject.length-1);i>=0;i--){
//             System.out.println(subject[i]);
//         }


//     }
// }




//For-each loop in java

// public class Arrays{
//     public static void main(String args[]){
//         int[] price={12,76,90,56,34};
//         for(int element:price){
//             System.out.println(element);
//         }


//     }
// }



//MultiDimensional 2-D Array--> arrays of arrays
// public class Arrays{
//     public static void main(String args[]){
//         int[][] floor=new int[2][3];
//         int[0][0]=34;
//         int[0][1]=32;
//         int[0][2]=89;
//         int[1][0]=78;
//         int[1][1]=70;
//         int[1][2]=75;
//        //Displaying 2-D array using loop
//        System.out.println("Printing a 2-D array using loop:");
//        for(i=0;i<floor.length;i++){
//         System.out.println(floor[i]);
//        }
       



//     }
// }


// public class Arrays {
//     public static void main(String[] args) {
//         int[] arr = { 23,34,23,24,23};
//         int num = 23;
//         int count =0;
//        for(int i = 0 ; i<arr.length ; i++) {
//         if(arr[i] == num) {
//             count++;

//         }
        
//        } 
//        System.out.println(count);
//     }
// }

public class Arrays {
    public static void main(String args[]) {
        int[] arr = { 23,34,23,24,23};
        int num = 23;
        int count = 0;
        for(int elements : arr) {
            if(num == elements){
                count++;
            }

        }
        System.out.println(count);
    }
}