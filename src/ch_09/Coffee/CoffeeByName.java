package ch_09.Coffee;

public class CoffeeByName {
  // Object 사용한 클래스 선언

  public Object name; // Object 클래스 -> Integer, Double, String, other Class 다 넣을 수 있음
  public CoffeeByName(Object name) {
    this.name = name;
  }

  public void ready() {
    System.out.println("커피 준비 완료 :  " + name);
  }
}
