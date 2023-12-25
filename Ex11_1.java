public class Ex11_1 {
    public static void main(String[] args) {
        int c;
        try {
            c = 7 / 0;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("End Point");
    }
}