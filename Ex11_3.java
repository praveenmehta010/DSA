import java.util.*;

class CustomException extends Exception {
    CustomException(String msg) {
        super(msg);
    }
}

public class Ex11_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter Your Age : ");
        age = sc.nextInt();

        if (age < 18) {
            try {
                throw new CustomException("You are undreage");
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println("You are 18 or above");
        }
    }
}
