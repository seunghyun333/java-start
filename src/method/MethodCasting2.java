package method;

public class MethodCasting2 {
    //double이 더 큰 숫자 범위이므로 자동 형변환 적용
    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // int에서 double로 자동 형변환
    }
        public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
