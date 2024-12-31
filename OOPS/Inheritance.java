package OOPS;
// extends keyword is used for inheritance 
// multiple is not in java by extends 
// single , multi level , heirarchy , hyrid 
public class Inheritance {
    public static void main(String[] args) {
        // Chhota_papa CP1=new Chhota_papa();
        // Chacha C1=new Chacha();
        // Bada_papa BP1=new Bada_papa();
    }
}
class Sab_ka_papa {
    String jack="JACK";
    String oggy="OGGY";
}

// single inheritance
class Chhota_papa extends Sab_ka_papa{
    Chhota_papa(){
        System.out.println("jack ka beta 1 " + "father IS "+jack);
    }
}

// multi level inheritance
class Chacha extends Chhota_papa{
    Chacha(){
        System.out.println("Chacha h sab ka "+ oggy);
    }
}

// Heirarchial inheritance (as it is extending sab ka papa and chotta papa is also extending i too) 
class Bada_papa extends Sab_ka_papa{
    Bada_papa(){
        System.out.println("jack ka beta 2 "+ "Father IS "+jack);
    }
} 
// mixture of all 3 types is called hybrid
