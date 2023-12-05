package method;

public class Method1Ref {
    public static void main(String[] args) {
        int sum1 = add(2, 3);
        System.out.println("sum1 : " + sum1);

        int sum2 = add(5, 6);
        System.out.println("sum2 : " + sum2);
    }

        public static int add(int a, int b) {
            System.out.println(a +"+"+ b + " 연산수행");
            int sum = a + b;
            return sum;
    }
}

