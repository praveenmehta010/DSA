class OuterClass {
    private int num = 10;
// ************MethodInnerClass********************************
    void methodInnerClass() {
// ************InnerClass********************************
        class MethodInnerClass {
            void display() {
                System.out.println(num);
            }
        }
// ************InnerClassClosed*********************************
        MethodInnerClass objMethodInnerClass = new MethodInnerClass();
        objMethodInnerClass.display();
    }
// ***********MethodInnerClassClosed***************************
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.methodInnerClass();
    }
}
