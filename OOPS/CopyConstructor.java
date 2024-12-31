package OOPS;

public class CopyConstructor {
    public static void main(String[] args) {
    Copy c1=new Copy();
    c1.School_code=1234;
    c1.School_name="JJPS";
    c1.roll_no=321;
    c1.print();
    Copy c2=new Copy(c1);
    c2.roll_no=333;
    c2.print();
    }

}
class Copy{
    int School_code;
    String School_name;
    // roll number is unique for everyone and hence not copied in the copy constructor
    int roll_no;
    Copy(){
        System.out.println("Constructor");
    }
    Copy(Copy c1){
        this.School_code=c1.School_code;
        this.School_name=c1.School_name;

    }
    Copy(String School_name){
        this.School_name=School_name;
    }
    Copy(int School_code){
        this.School_code=School_code;
    }
    void print(){
        System.out.println(School_code);
        System.out.println(School_name);
        System.out.println(roll_no);
    }
} 