package ch_09;

import ch_09.Coffee.Coffee;
import ch_09.Coffee.CoffeeByName;
import ch_09.Coffee.CoffeeByNickname;
import ch_09.Coffee.CoffeeByNumber;

public class _02_GenericClass {

  public static void main(String[] args) {
    // 제네릭 클래스

    System.out.println("제네릭 클래스 생성 전");

    CoffeeByNumber c1 = new CoffeeByNumber(33);
    c1.ready();
    CoffeeByNickname c2 = new CoffeeByNickname("John");
    c2.ready();

    System.out.println("Object 를 이용해 클래스 생성");

    CoffeeByName c3 = new CoffeeByName(34);
    c3.ready();
//    int c3Name = c3.name;
//    int c3Name = (String)c3.name;

    CoffeeByName c4 = new CoffeeByName("Alice");
    c4.ready();

    System.out.println("제네릭 클래스 생성 후");

    Coffee<Integer> c5 = new Coffee(35);
    c5.ready();
    Coffee<String> c6 = new Coffee("Bob");
    c6.ready();
    String c6Name = c6.name;

    System.out.println("2개 이상일때 제네릭 메소드 pram ");
    orderCoffee(c4.name);
    orderCoffee(c4.name, "아메리카노");

  }

  public static <T>void orderCoffee(T name){
    System.out.println("커피 준비 완료 : " + name);
  }
  public static <T,V>void orderCoffee(T name, V coffee){
    System.out.println(coffee + "커피 준비 완료 : " + name);
  }

}
