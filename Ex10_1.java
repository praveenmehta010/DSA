class OuterClass {
    private int num1;

    void setNum(int num) {
        this.num1 = num;
    }

    int getNum() {
        return num1;
    }

    void showNum() {
        System.out.println("num1 = " + num1 + ", num2 = can not use outside of inner class");
    }

    // **************** Inner Class Part *******************************************
    class InnerClass {
        private int num2;

        void setNum(int num) {
            this.num2 = num;
        }

        int getNum() {
            return num2;
        }

        void showNum() {
            System.out.println("num1 = " + num1 + ", num2 = " + num2);
        }
    }

    // ****************************************************************
    public static void main(String[] args) {
        OuterClass objOuterClass = new OuterClass();
        objOuterClass.showNum();
        objOuterClass.setNum(10);
        objOuterClass.showNum();

        OuterClass.InnerClass objInnerClass = objOuterClass.new InnerClass();
        objInnerClass.showNum();
        objInnerClass.setNum(20);
        objInnerClass.showNum();
    }
}