package ch_03;

import java.util.Locale;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C";
        System.out.println(s);

        // 문자열 길이 반환
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자

        // 포함 여부 확인 및 위치 정보 반환
        System.out.println(s.contains("Java")); // Boolean 값 반환
        System.out.println(s.indexOf("Java"));  // 위치 인덱스 반환 없으면 -1
        System.out.println(s.lastIndexOf("and"));   // 같은게 있으면 마지막으로 나온 and 반환
        System.out.println(s.startsWith("I like"));     // 이 문자열로 시작하면 true
        System.out.println(s.endsWith("c"));            // 이 문자열로 끝나면 true
    }
}