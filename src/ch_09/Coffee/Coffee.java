package ch_09.Coffee;

public class Coffee<T> {
  // Generic Class 선언

  public T name;

  public Coffee(T name) {
    this.name = name;
  }

  public void ready() {
    System.out.println("커피 준비 완료 : " + name);
  }
}
