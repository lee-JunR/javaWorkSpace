package ch_09;

import java.util.HashMap;

public class _07_HashMap {

  public static void main(String[] args) {
    // Map (key, value) 로 이루어진 자료형. 키값 중복 x, 순서 x

    // 1. 선언
    HashMap<String, Integer> map = new HashMap<>();

    // 2. 데이터 추가 put
    map.put("유재석", 10);
    map.put("박명수", 5);
    map.put("김종국", 3);
    map.put("서장훈", 15);

    System.out.println("총 고객 수 : " + map.size());
    System.out.println("----------------------------------");

    // 3. 데이터 조회
    System.out.println("유재석 님의 포인트 : " + map.get("유재석"));
    System.out.println("박명수 님의 포인트 : " + map.get("박명수"));
    System.out.println("----------------------------------");

    // 4. 확인
    if(map.containsKey("서장훈")){
      int point = map.get("서장훈");
      map.put("서장훈", ++point);
      System.out.println("서장훈님의 누적 포인트 : " + map.get("서장훈"));
    } else{
      map.put("서장훈", 1);
      System.out.println("서장훈님 신규 등록 (포인트 1)");
    }
    System.out.println("----------------------------------");

    // 5. 삭제
    map.remove("유재석");
    System.out.println(map.get("유재석")); // 없을때는 null 반환

    // 5.1 전체 삭제
    map.clear();
    if (map.isEmpty()){
      System.out.println("남은 고객 수 : "+ map.size());
      System.out.println("가게 접자");
    }
    System.out.println("----------------------------------");

    map.put("유재석", 10);
    map.put("박명수", 5);
    map.put("김종국", 3);
    map.put("서장훈", 15);
    // Key 값 순회 .keySet()
    for (String key : map.keySet()) {
      System.out.println(key);
    }
    System.out.println("----------------------------------");

    // Value 값 순회 values()

    for (int value : map.values()) {
      System.out.println(value);
    }
    System.out.println("----------------------------------");

    //key, value 함께 확인
    for (String key : map.keySet()) {
      System.out.println("고객이름 : " + key + "    포인트 : " + map.get(key));
    }
    System.out.println("----------------------------------");

    // Map 자료형은 중복 X 순서 보장 X
    map.put("김종국", 10);
    map.put("김종국", 30);
    map.put("김종국", 50);
    for (String key : map.keySet()) {
      System.out.println("고객이름 : " + key + "    포인트 : " + map.get(key));
    }

    // LinkedHashMap 은 키값 기준으로 순서 보장
  }

}
