package ch_06;

public class _02_Parameter {
    public static void power(int number){
        int result = number * number;
        System.out.println(number + " 의 2 승은 " + result);
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + " 승은 " + result);

    }
    public static void main(String[] args) {
        // 전달값, Parameter

        // 거듭제곱 값 메소드 만들기.
        power(3);
        // 제곱 값 메소드 만들기
        powerByExp(2, 3);
    }
}
