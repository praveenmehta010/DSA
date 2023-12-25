// Multilevel Inheritance
class Class1{
    void displayC1(){
        System.out.println("C1 : Hello World");
    }
}
class Class2 extends Class1{
    void displayC2(){
        System.out.println("C2 : Hello World");
    }
}
class Class3 extends Class2{
    void displayC3(){
        System.out.println("C3 : Hello World");
    }
}
public class Ex6_2 {
    public static void main(String[] args) {
     Class3 obj = new Class3();    
     obj.displayC1();
     obj.displayC2();
     obj.displayC3();   
    }
}
