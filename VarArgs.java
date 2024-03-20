public class VarArgs{
    public static int sum(int ...arr){
        //behave as int[] arr;
        int result =0;
        for(int elements:arr){
            result += elements;

        }
        return result;

    }
    // Mandatory to pass atleast one argument.
    public static void bar(int x, int ...arr){
        int result =0;
        for(int elements:arr){
            result += elements;

        }
        return result;

    }
    public static void main(String[] args){
        System.out.println("Welcome to Variable Argument Tutorial");
        System.out.println("The sum of 9 and 6 is: " + sum(9 , 6));
        System.out.println("The sum of 9,3,and 6 is: " + sum(9 , 3 , 6));
        System.out.println("The sum of 9,8,1 and 6 is: " + sum(9 ,8 , 1 , 6));
        System.out.println("The sum of 9,0 and 6 is: " + sum(9, 0 , 6));
        System.out.println("The sum of Nothing is: " + sum());
        System.out.println("The sum of Nothing is: " + bar(1));
      

    }
}