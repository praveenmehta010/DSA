import java.io.FileInputStream;

public class Ex11_2 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("D:\\Ex11_2Test.txt");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            System.out.println("getting out of finally");
        }
        System.out.println("End of code");
    }
}
