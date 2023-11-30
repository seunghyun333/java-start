package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0 ;

        if (price >= 10000) {
            discount = discount + 1000;
        } else if(age <= 10) {
            discount = discount + 1000;
        } else {
            System.out.println("할인 없음");
        }

        price = price - discount;

        System.out.println("price = " + price + " 원");
        // If5와 다름. 첫 번째 If문 충족하고 빠져나옴
    }
}
