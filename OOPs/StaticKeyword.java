public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName= "jvm";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
        // Note : we declare s1.schoolname as jvm but after printing s2.school name it is giving "jvm" , this is because of static keyword.

        s2.schoolName  = "parshwanath";
        System.out.println(s1.schoolName);// if we change in any one object all objects will be affected.

        }
}

class Student{
    String  name ;
    int roll;
    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;

    }

    static int returnPercentage(int math , int phy , int chem){
        return (math+ phy+ chem )/3;
    }
}