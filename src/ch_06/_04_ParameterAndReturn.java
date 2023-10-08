package ch_06;

public class _04_ParameterAndReturn {
    /** number 을 받아 두번 곱해 반환하는 메소드 */
    public static int getPower(int number){
        int result = number * number;
        return result;
    }
    /** number와 exponent 를 받아 거듭제곱을 하는 메소드 */
    public static int getPowerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 전달값과 반환값이 메소드

        System.out.println("2 ^ 2 = " + getPower(2));
        System.out.println("2 ^ 3 = " + getPowerByExp(2, 3));
    }
}
