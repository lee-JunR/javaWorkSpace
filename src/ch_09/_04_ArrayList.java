package ch_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _04_ArrayList {

  public static void main(String[] args) {
    // 컬렉션 프레임워크 (List Set, Map)
    int[] array = new int[3];
    // 기존 둘 이상의 데이터를 관리할 수 있는 Array 의 경우 추가삽입이 불가능.

    // Array List
    // 1.  선언
    ArrayList<String> list = new ArrayList<>();

    // 1-1
      // 방법 1. 값을 직접 입력하여 전달
    ArrayList<String> strArrayList1 =
        new ArrayList<>(Arrays.asList("One", "Two", "Three"));

      // 방법 2. 배열로 선언된 변수를 전달
//    ArrayList<String> strArrayList2 =
//        new ArrayList<>(Arrays.asList(strArray));

      // 방법 3. ArrayList 객체를 전달(Arrays.asList() 사용 안함)
    ArrayList<String> strArrayList3 =
        new ArrayList<>(strArrayList1);

    // 2. 데이터 추가
    list.add("유재석");
    list.add("조세호");
    list.add("김종국");
    list.add("박명수");
    list.add("강호동");
    // 3. 데이터 조회 (인덱스)
    System.out.println(list.get(0)); // 유재석
    System.out.println(list.get(1)); // 조세호
    System.out.println(list.get(2)); // 김종국
    System.out.println(list.get(3)); // 박명수
    System.out.println(list.get(4)); // 강호동

    System.out.println("-------------------");

    // 4. 삭제
    System.out.println("신청 학생 수 (1명 이사 전) : " + list.size());
    list.remove("박명수"); //
    System.out.println("신청 학생 수 (1명 이사 후) : " + list.size());
    System.out.println("바뀐 3번 인덱스 : " + list.get(3)); // 한명이 빠져 원래 4번 인덱스였던 강호동이 3번 인덱스가 됨.

    System.out.println("-------------------");

    System.out.println("남은 학생 수 (제외 전) : " + list.size()); // 4
    list.remove(list.size() - 1); // 인덱스로 삭제 (3)
    System.out.println("남은 학생 수 (제외 후) : " + list.size()); // 3

    // 순회
    for (String s : list) {
      System.out.println(s);
    }
    System.out.println("-------------------");

    // 5. 값 수정
    System.out.println("수강권 양도 전 : " + list.get(0)); // 유재석
    list.set(0, "이수근"); // 유재석 -> 이수근 으로 0번 데이터 변경
    System.out.println("수강권 양도 후 : " + list.get(0)); // 이수근

    // 6. 인덱스 값 확인
    System.out.println(list.indexOf("김종국"));
    // 선착순 5명 내에 김종국이 포함이 되었는가?
    if (list.contains("김종국")) {
      System.out.println("수강 신청 성공");
    } else {
      System.out.println("수강 신청 실패");
    }
    System.out.println("-------------------");

    // 7. 전체 삭제
    list.clear();
    if (list.isEmpty()) {
      System.out.println("학생 수 : " + list.size());
      System.out.println("리스트가 비어있습니다.");
    }

    System.out.println("-------------------");

    //다음 학기에 새로 공부 시작
    list.add("유재석");
    list.add("조세호");
    list.add("김종국");
    list.add("박명수");
    list.add("강호동");

    // 8. 정렬
    Collections.sort(list);
    System.out.println("이름 순으로 정렬된 리스트 목록");
    for (String s : list) {
      System.out.println(s);
    }
  }
}
