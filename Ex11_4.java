class Calculation {
    void divide(int num1, int num2) throws Exception {
        int result = 0;
        result = num1 / num2;
        System.out.println(result);
    }
}

public class Ex11_4 {
    public static void main(String[] args) {
        Calculation obj = new Calculation();
        try {
            obj.divide(010, 8);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
