package OOPS;

public class constructors {
    public static void main(String[] args) {
        // Student s1=new Student();
        // Student s3=new Student(93);
        // Student s2=new Student("Samar");
    }
}

class Student{
    String name;
    int percentage;
    Student(){
        System.out.println("Default constructor");
    }
    Student(int percentage){
        // this.percentage=percentage;
        System.out.println("Parametrized constructor");
        System.out.println(percentage);
    }
    Student(String name){
        // this.name=name;
        System.out.println(name);
    }
}
