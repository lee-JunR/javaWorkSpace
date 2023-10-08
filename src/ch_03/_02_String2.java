package ch_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // " and" 를 "," 로 변환
        System.out.println(s.substring(7));                 // 인덱스 기준 7 부터 시작 (이전 내용은 삭제)
        System.out.println(s.substring(s.indexOf("Java")));           // 인덱스를 찾는 함수 indexOf() 이용해서 찾음
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 시작위치 (Java) 부터 끝 위치(".") 앞까지 반환

        //공백 제거
        String s1 = "                  I love Java.";
        System.out.println(s1);
        System.out.println(s.trim());   //앞뒤 공백 제거

        //문자열 결합
        System.out.println(s.concat(".").concat(s1));
    }
}
