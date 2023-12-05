package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
        System.out.println("평균값: " + sum(1,2,3));
        System.out.println("평균값: " + sum(15,25,35));
    }

    public static double sum(int a, int b, int c) {
        int sum1 = a + b + c;
        return sum1 / 3.0;
    }
}
