package ch_09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _08_Iterator {

  public static void main(String[] args) {
    // Iterator

    List<String> list = new ArrayList<>();
    // List 는  interface 이다. ArrayList 는 impliments 로 List interface 를 상속하고 있음. 그래서 이렇게 쓸 수 있는거임.
    // LinkedList 도 마찬가지
    list.add("유재석");
    list.add("(알 수 없음)");
    list.add("김종국");
    list.add("(알 수 없음)");
    list.add("강호동");
    list.add("(알 수 없음)");
    list.add("박명수");
    list.add("(알 수 없음)");
    list.add("조세호");

    for (String s : list) {
      System.out.println(s);
    }
    System.out.println("--------------------------------");

    Iterator<String> it = list.iterator();
    System.out.println(it.next());
    System.out.println(it.next());
    System.out.println(it.next());
    System.out.println(it.next());
    System.out.println("--------------------------------");

    // 커서 처음 위치로 이동
    it = list.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    System.out.println("--------------------------------");

    it = list.iterator();
    while(it.hasNext()) {
      String s = it.next();
      if (s.contains("알 수 없음")){
        it.remove(); // 삭제
      }
    }
    it = list.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    System.out.println("--------------------------------");
  }

}
