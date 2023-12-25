class OuterClass {

    private int num1;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    void showNum() {
        System.out.println("num1 = " + num1 + ", num2 = can not use outside of inner class");
    }

    // ************************Inner Static
    // Class***********************************************************
    static class InnerStaticClass {
        private int num2;

        public int getNum2() {
            return num2;
        }

        public void setNum2(int num2) {
            this.num2 = num2;
        }

        void showNum() {
            System.out.println("num1 = i am inner static class, cann't use non static variable , num2 = " + num2);
        }
    }

    public static void main(String[] args) {
        OuterClass objOuterClass = new OuterClass();
        objOuterClass.showNum();
        OuterClass.InnerStaticClass objInnerStaticClass = new OuterClass.InnerStaticClass();
        objInnerStaticClass.showNum();
    }
}
