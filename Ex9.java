class Demo {
    void display() {
        System.out.println("Demo : Hello World");
    }
}

class Ex9 extends Demo {
    void display() {
        System.out.println("Ex9 : Hello World");
    }

    public static void main(String[] args) {
        Demo obj2 = new Demo();
        obj2.display();
    }
}
