package ch_09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

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
    while (it.hasNext()) {
      String s = it.next();
      if (s.contains("알 수 없음")) {
        it.remove(); // 삭제
      }
    }
    it = list.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    System.out.println("--------------------------------");

    // Set 이나 Map 에서도 Iterator 사용 가능
    System.out.println("HashSet Iterator 순회");
    HashSet<String> set = new HashSet<>();
    Iterator<String> itSet = set.iterator();
    while (itSet.hasNext()) {
      System.out.println(itSet.next());
    }
    System.out.println("--------------------------------");

    HashMap<String, Integer> map = new HashMap<>();
    map.put("유재석", 10);
    map.put("박명수", 3);
    map.put("노홍철", 5);

    // Iterator<String> itMapKey = map.iterator(); // 제공 X
    System.out.println("HashMap Iterator 순회");

    System.out.println("---key 순회 : map.keySet().iterator()---");
    Iterator<String> itMapKey = map.keySet().iterator();
    while (itMapKey.hasNext()) {
      System.out.println(itMapKey.next());
    }
    System.out.println("---Value 순회 : map.keySet().iterator()---");

    Iterator<Integer> itMapValue = map.values().iterator();
    while (itMapValue.hasNext()) {
      System.out.println(itMapValue.next());
    }
    System.out.println("---Key, Value 같이 순회---");
    Iterator<Entry<String, Integer>> itMap = map.entrySet().iterator();
    while (itMap.hasNext()) {
      System.out.println(itMap.next());
    }

  }

}
