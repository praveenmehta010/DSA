// Hierarchical Inheritance

class BaseClass {
    void display() {
        System.out.println("Base Class : Hello World");
    }
}

class DrivedClass1 extends BaseClass {
    void display1() {
        System.out.println("Drived Class 1: Hello World");
    }
}

class DrivedClass2 extends BaseClass {
    void display2() {
        System.out.println("Drived Class 2: Hello World");
    }
}

public class Ex6_3 {
    public static void main(String[] args) {
        DrivedClass1 obj1 = new DrivedClass1();
        DrivedClass2 obj2 = new DrivedClass2();
        obj1.display();
        obj1.display1();
        obj2.display();
        obj2.display2();
    }
}
