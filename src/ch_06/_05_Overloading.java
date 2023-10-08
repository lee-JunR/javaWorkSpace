package ch_06;

public class _05_Overloading {
    /** number 을 받아 두번 곱해 반환하는 메소드 */
    public static int getPower(int number){
        int result = number * number;
        return result;
    }

    //이름이 같게 하고 타입만 다르면 됨 -> 메소드 오버로딩!!! 다형성!
    /** number가 "4" 와 같은 문자열이라도 두번 곱해 반환하는 메소드 */
    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number * number;
    }
    /** number와 exponent 를 받아 거듭제곱을 하는 메소드 */
    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩 : 이름이 같은 메소드를 여러개 만들 수 있음
        // 같은 이름의 메소드를 여러번 선언!
        // 1. 전달값의 타입이 다르거나 O
        // 2. 전달값의 갯수가 다를 때 O
        // 3. 반환형이 다른 것은 X
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3,4));
    }
}
