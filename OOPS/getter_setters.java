package OOPS;

public class getter_setters {
    public static void main(String[] args) {
        car c1=new car();
        c1.setcolor("Black");
        c1.getcolor();
        // System.out.println(c1.getcolor());
        c1.setalloy_size(18);   
        c1.getalloy_size();
        // System.out.println(c1.getalloy_size());
        c1.setBrand("Chrysler");
        c1.getBrand();
        // System.out.println(c1.getBrand());
    }
}
class car {
    private String color;
    private int alloy_size;
    private String brand;
    void setcolor(String color){
        this.color=color;
    }
    void getcolor(){
        System.out.println("Color is "+this.color);
        // return this.color;
    }
    void setalloy_size(int alloy_size){
        this.alloy_size=alloy_size;
    }
    void getalloy_size(){
        System.out.println("Alloy size is "+this.alloy_size);
        // return this.alloy_size;
    }
    void setBrand(String brand){
        this.brand=brand;
    }
    void getBrand(){
        System.out.println("brand is "+this.brand);
        // return this.brand;
    }   
    
}
