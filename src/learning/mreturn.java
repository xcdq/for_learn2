package learning;

public class mreturn {
    public static void main(mString[] args) {
        method(2,4);
        System.out.println("==============");
        m2();
    }

    public static void method(int a,int b) {
        int r=a*b;
        System.out.println("结果是"+r);
    }

    public static void m2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello,world"+(i+1));
        }
    }
}
