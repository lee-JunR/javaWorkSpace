package ch_09;

public class _03_WrapperClass {

  public static void main(String[] args) {
    // 래퍼(Wrapper) Class
    // int double float char

    Integer i = 123; // int i = 123;
    Double d = 1.0; // double d = 1.0;
    Character c = 'a'; // char c = 'a';

    System.out.println("--------------------------------");

    System.out.println(i.intValue());
    System.out.println(d.intValue()); // Double 형 객체를 Integer 로 변환해서 반환

    System.out.println("--------------------------------");

    String s = i.toString(); // Integer 객체를 String 으로 변환
    System.out.println(s);
  }

}
