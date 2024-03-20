// class Employee {
//     int id;
//     String name;
//     int salary;
//     public void printDetails() {
//         System.out.println("My id is "+ id);
//         System.out.println("and my name is "+ name);
//     }

//     public int getSalary(){
//         return salary;
//     }


// }







// public class CustomClass{
// public static void main(String args[]) {
//     System.out.println("This is our custom class");
//     Employee vaishnavi = new Employee(); //Instantiating a new Employee object
//     Employee omsingh = new Employee();  //Instantiating a new Employee object
    
//     //Setting Attributes for vaishnavi
//     vaishnavi.id = 02;
//     vaishnavi.name = "Tech Monstress";
//     vaishnavi.salary=5000000;

//     //Setting Attributes for omsingh
//     omsingh.id = 34;
//     omsingh.name = "bitsbytes";
//     omsingh.salary=4900000;
 
 
//  //printing the attributes
// // System.out.println(vaishnavi.id);
//     // System.out.println(omsingh.id);

//     vaishnavi.printDetails();
//     omsingh.printDetails();
//     int salary = vaishnavi.getSalary();
//   //int salary2 = omsingh.getSalary();
//     System.out.println(salary);
// }
// }

class Pen {
    String color;
    String type;
    int price;
     public void write() {
        System.out.println("Write Something");
     }

        public void color() {
            System.out.println(this.color);

        }
        public void type() {
            System.out.println(this.type);
        }
        public void price() {
            System.out.println(this.price);
        }
     }

// class Student {
//     String name;
//     String department;
//     int age;
//     double cgpa;
//     String company;
//     int salary;
//     String jobRole;

//     public void PrintInfo() {
//         System.out.println(this.name);
//         System.out.println(this.department);
//         System.out.println(this.age);
//         System.out.println(this.cgpa);
//         System.out.println(this.company);
//         System.out.println(this.salary);
//         System.out.println(this.jobRole);
//     }


//}
// public class CustomClass {
//     public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";
        // pen1.price=20;
        // pen1.write();
        // pen1.color();
        // pen1.type();
        // pen1.price();

        // Student s1 = new Student();
        // s1.name = "Vaishnavi Raj";
        // s1.department = "CSE";
        // s1.age = 19;
        // s1.cgpa = 9.5;
        // s1.company = "Microsoft";
        // s1.salary = 7500000;
        // s1.jobRole = "Software Developer";
        // s1.PrintInfo();




//     }
// }



//Same above Student class making using Constructor . Constructor are of three types. a)Parameterise b)Non-parameterise c)Copy constructor
// 1.constructor has no return type.
// 2.constructor name must be same as class name.
// 3.We can call constructor only at once unlike methods.

class Student {
    String name;
    String department;
    int age;
    double cgpa;
    String company;
    int salary;
    String jobRole;

    Student(String name ,String department , int age ,double cgpa,String company, int salary ,String jobRole) {
        this.name = name;
        System.out.println(name);
        this.department = department;
        System.out.println(department);
        this.age = age;
        System.out.println(age);
        this.cgpa = cgpa;
        System.out.println(cgpa);
        this.company = company;
        System.out.println(company);
        this.salary = salary;
        System.out.println(salary);
        this.jobRole = jobRole;
        System.out.println(jobRole);

    }
    // public void PrintInfo(){
    //     System.out.println(name);
    //     System.out.println(department);
    //     System.out.println(age);
    //     System.out.println(cgpa);
    //     System.out.println(company);
    //     System.out.println(salary);
    //     System.out.println(jobRole);
    // }
}


public class CustomClass {
public static void main(String[] args) {
    Student s1 = new Student("Om Singh", "CSE",  19 , 9.4 , "Microsoft" , 7400000 , "Software Developer" );
    //s1.PrintInfo();
  


}
}
    
     
   



