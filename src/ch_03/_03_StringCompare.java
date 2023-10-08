package ch_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));      // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equals("python"));// 대소문자도 구분한다는 것!!
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분없이 같은지 확인하고 싶을 때!

        // 문자열 비교 심화
        s1 = "1234";
        s2 = "1234"; // s1, s2 는 같은 곳을 참조하고 있음
        System.out.println(s1.equals(s2)); // true -> 내용 비교
        System.out.println(s1 == s2); // true -> 참조 비교

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true -> 내용 비교
        System.out.println(s1 == s2);     // false!! -> 메모리에 참조하는 곳 비교!!! false!

    }
}
