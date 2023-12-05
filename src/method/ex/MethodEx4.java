package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("----------------------------------");
            System.out.print("선택");

            int choice = scanner.nextInt();
            int amount = 0;

            switch(choice) {
                case 1:
                    System.out.println("입금액을 입력하세요");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;

                case 2:
                    System.out.println("출금액을 입력하세요");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                    break;

                case 3:
                    System.out.println("잔액 확인 : " + balance + "원");
                    break;

                case 4:
                    System.out.println("종료합니다.");
                    return;
            }
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance +
                "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        balance -= amount;
        System.out.println(amount + "원을 출금하셨습니다. 현재 잔액: " + balance +"원");
        return balance;
    }
}
