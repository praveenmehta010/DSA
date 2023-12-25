public class Ex2 {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 5);
        ComplexNumber c2 = new ComplexNumber(-2, 4);
        ComplexNumberOperations.additionOfComplexNumbers(c1, c2);
        System.out.println();
        ComplexNumberOperations.multiplicationOfComplexNumbers(c1, c2);
        System.out.println();
    }
}

class ComplexNumber {
    int realPart;
    int imgPart;

    ComplexNumber(int realPart, int imgPart) {
        this.imgPart = imgPart;
        this.realPart = realPart;
    }

    int getComplexNumberRealPart() {
        return realPart;
    }

    int getComplexNumberImgPart() {
        return imgPart;
    }
}

class ComplexNumberOperations {

    static void additionOfComplexNumbers(ComplexNumber c1, ComplexNumber c2) {
        int c1RealPart = c1.getComplexNumberRealPart();
        int c1ImgPart = c1.getComplexNumberImgPart();
        int c2RealPart = c2.getComplexNumberRealPart();
        int c2ImgPart = c2.getComplexNumberImgPart();

        int realPartResult = c1RealPart + c2RealPart;
        int imgPartResult = c1ImgPart + c2ImgPart;

        System.out.println(
                "Given Complex Numbers :- " + c1RealPart + " + i(" + c1ImgPart + ") ," + c2RealPart + " + i("
                        + c2ImgPart + ")");
        System.out.println("Result of Addition operation :- " + realPartResult + " + i(" + imgPartResult + ")");
    }

    static void multiplicationOfComplexNumbers(ComplexNumber c1, ComplexNumber c2) {
        int c1RealPart = c1.getComplexNumberRealPart();
        int c1ImgPart = c1.getComplexNumberImgPart();
        int c2RealPart = c2.getComplexNumberRealPart();
        int c2ImgPart = c2.getComplexNumberImgPart();

        int realPartResult = (c1RealPart * c2RealPart) - (c1ImgPart * c2ImgPart);
        int imgPartResult = (c1ImgPart * c2RealPart) + (c1RealPart * c2ImgPart);

        System.out.println(
                "Given Complex Numbers :- " + c1RealPart + " + i(" + c1ImgPart + ") ," + c2RealPart + " + i("
                        + c2ImgPart + ")");
        System.out.println("Result of Multiplication operation :- " + realPartResult + " + i(" + imgPartResult + ")");
    }
}