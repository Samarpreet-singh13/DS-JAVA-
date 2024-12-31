package OOPS;
// multiple methods with same name and diffrent parameters is called method overloading and while calling it is to be decided that which of the method is selected
public class Methodoverloading {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.err.println(c1.sum(4, 7));
        System.out.println(c1.average(63, 99, 8));
        // converted to float as the java by deault choose decimals as double
        System.out.println(c1.product((float)4.55, (float)23.666));
    }
}
class Calculator{
    int sum(int a ,int b){
        return a+b;
    }
    float product(float a, float b){
        return a*b;
    }
    float average(int a, int b, int c){
        return (a+b+c)/3;
    }
}

// method overriding is in which the name and parameters are same but they lie in the diffrent classes so when object is called using base instance base method is called and vice versa 