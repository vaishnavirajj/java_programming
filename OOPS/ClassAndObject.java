//Objects-entities in the real world
//Classes-Group of these Entites
//Properties and Function

public class ClassAndObject {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        p1.setTip(10);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}

    class Pen {
        String color;
        int tip;
        void setColor(String newColor){
            color = newColor;
            return;
        }
        int setTip(int newTip){
            tip = newTip;

            return 2;
        }
    }
   
   class Student {
    String name;
    int age;
    float percentage;

    void calPercentage(int phy , int math ,int chem) {
        percentage = (phy + math + chem)/3;


    }
   }
    
   
