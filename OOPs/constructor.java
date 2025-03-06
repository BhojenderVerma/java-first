public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        //
        Student s2 = new Student("Shinky");
        System.err.println(s2.name);

        // for copy consturctor
        Student s3 = new Student();
        s3.name = "rohan";
        s3.roll  = 5;
        s3.password = "abcde";
        s3.marks[0]=100;
        s3.marks[1]=90;
        s3.marks[2]=80;

        //for some reason s1 has forgotten his password. so we need to create new s4 with same details of s1.
        Student s4 = new Student(s3);
        s4.password = "xyz";
        s3.marks[0]= 80;



        for (int i = 0 ; i< 3;i++){ 
            System.out.println(s4.marks[i]);
        }
         
    }
}
/* there are three types of ocnstrucorrs :
    1.Non parameterized 
    2.Parameterized
    3.Copy Constructor
 */ 

class Student{
    
    //there can be multiple constructors
    String name ;
    int roll;
    String password; // for copyconstructor
    int marks[];
    
    // default constructor
     Student() { // non parameterized consturctor
        marks = new int[3]; //consider three subjects.
        System.out.println("here constructor is called ...");
    }

    // parameterized constructor
    Student(String name ){
        marks = new int[3];
        this.name = name;
    }

    Student(String name,int roll ){
        marks = new int[3];
        this.name = name; 
        this.roll = roll;
    }

    Student (int roll){
        marks = new int[3];
        this.roll = roll;
    }

    // Shallow Copy constructors
    // Student (Student s1){
    //     marks = new int[3];
    //     this.name = s1.name ;
    //     this .roll = s1.roll;
    //     this.marks = s1.marks;
    // }
    
    //Deep copy consturctor
    Student (Student s1){
        marks = new int [3];
        this.name = s1.name ;
        this.roll = s1.roll;
        for (int i = 0 ; i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
    
}



