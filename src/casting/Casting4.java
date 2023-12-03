package casting;

public class Casting4 {
    //연산과 형변환
    public static void main(String[] args) {
        int div1 = 3/2;
        System.out.println("div1 = " + div1);

        double div2 = 3/2;
        System.out.println("div2 = " + div2); // 계산 후 형변환

        double div3 = 3.0/2;
        System.out.println("div3 = " + div3); // int + double 은 double double 로 형변환 일어남

        double div4 = (double) 3/2;
        System.out.println("div4 = " + div4); // (double) 3 / (double) 2

        int a = 3;
        int b =2;
        double result = (double) a / b;
        System.out.println("result = " + result);
    }

}
