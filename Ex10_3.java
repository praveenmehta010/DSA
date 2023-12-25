abstract class AnonymousClass {
    abstract void display();
}

class OuterClass {
    public static void main(String[] args) {
        AnonymousClass obj = new AnonymousClass()
// ******************AnonymousClass**********************************        
        {
            void display(){
                System.out.println("Anonymous Class");
            }
        };
// *********************************************************************
        obj.display();
    }
}
