package casting;

public class Casting3 {
    //형변환과 오버플로우
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOVer = 2147483648L; // int 최고값 + 1 (초과)
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting=" + intValue); //출력:2147483647
        //intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting=" + intValue); //출력:-2147483648 참고로 `-2147483648` 숫 자는 `int` 의 가장 작은 숫자이다.

    }
}
