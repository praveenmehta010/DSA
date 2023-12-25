// Single Inheritance 
class Demo1{
   void display(){
    System.out.println("Demo1 : Hello World");
   }
}
class Demo2 extends Demo1{
    void show(){
        System.out.println("Demo2 : Hello World");
    }
}
public class Ex6_1{
    public static void main(String[] args) {
       Demo2 obj = new Demo2();
        obj.display();
        obj.show();
    }
}
