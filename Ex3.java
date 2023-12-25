
//Scanner Class to take input from user
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // sc object for Scanner class
        Scanner sc = new Scanner(System.in);
        // MSG for the user
        System.out.print("Please Enter a number :- ");
        int x = sc.nextInt();
        // obj object for Fibonacci class
        Fibonacci obj = new Fibonacci(x);
        // obj function calling (From class Fibonacci)
        obj.fibonacci();
    }
}

class Fibonacci {
    int count;

    // Constractor to take inpute while creation of object
    Fibonacci(int x) {
        count = x;
    }

    int a = 0;
    int b = 1;
    int c;

    // Main function for fibonacci series
    public void fibonacci() {
        // Switch to check multiple conditions
        switch (count) {
            case 0:
                System.out.println("Enter a valid number");
                break;
            case 1:
                System.out.print(a);
                break;
            case 2:
                System.out.print(a + ", " + b + ", ");
                break;
            default: // First two no's in the series
                System.out.print(a + ", " + b + ", ");
                // loop starts from 2 because we have already printed first 2 no's
                for (int i = 2; i < count; ++i) {
                    c = a + b;
                    System.out.print(c + ", ");
                    a = b;
                    b = c;
                }
                break;
        }

    }
}