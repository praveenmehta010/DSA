class Demo {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }        
}
public class Ex4 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.setX(10);
        System.out.println(obj.getX());
    }
}
