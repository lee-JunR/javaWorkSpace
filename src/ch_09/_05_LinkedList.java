package ch_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {

  public static void main(String[] args) {
    // 2. Linked list

    // 2.1. 선언
    LinkedList<String> list = new LinkedList<>();

    // 2.2. 데이터 추가
    list.add("유재석");
    list.add("조세호");
    list.add("김종국");
    list.add("박명수");
    list.add("강호동");
    System.out.println("--------------------------------------------------------");

    // 2.3. 데이터 조회 (인덱스)
    System.out.println(list.get(0));
    System.out.println(list.getFirst()); // 첫 인덱스 데이터값
    System.out.println(list.getLast()); // 마지막 인덱스 데이터값
    System.out.println("--------------------------------------------------------");

    // 2.4. 데이터 삽입
    //  첫번째에 삽입
    list.addFirst("서장훈");
    for (String s : list) {
      System.out.println(s + " index : " + list.indexOf(s));
    }
    System.out.println("--------------------------------------------------------");

    //  인덱스로 삽입
    System.out.println("학생 추가 전 (index : 1) : " + list.get(1));
    list.add(1, "김영철"); // 원래 1 위치 앞에 "김영철" 삽입
    System.out.println("학생 추가 후 (index : 1) : " + list.get(1));
    System.out.println("--------------------------------------------------------");

    // 2.5. 삭제
    System.out.println("남은 학생 수 (제외 전) : " + list.size());
    list.remove(list.size() - 1);
    System.out.println("남은 학생 수 (제외 후) : " + list.size());
    System.out.println("--------------------------------------------------------");

    for (String s : list) {
      System.out.print(s + " ");
    }
    System.out.println();
    // 첫 데이터 삭제
    list.removeFirst();
    System.out.println("(첫 데이터 삭제 후) 남은 학생 수 : " + list.size());

    // 마지막 데이터 삭제
    list.removeLast();
    System.out.println("(마지막 데이터 삭제 후) 남은 학생 수 : " + list.size());
    for (String s : list) {
      System.out.print(s + " ");
    }
    System.out.println();
    System.out.println("--------------------------------------------------------");

    // 2.6 변경
    list.set(0, "이수근");
    System.out.println(list.get(0));

    // 확인
    System.out.println("김종국의 인덱스 : " + list.indexOf("김종국"));

    if (list.contains("김종국")) {
      System.out.println("수강신청 성공");
    } else {
      System.out.println("수강신청 실패");
    }

    //전체 삭제
    list.clear();
    if (list.isEmpty()){
      System.out.println("학생 수 : " + list.size());
      System.out.println("리스트가 비었습니다.");
    }

    // 데이터 정렬
    list.add("유재석");
    list.add("조세호");
    list.add("김종국");
    list.add("박명수");
    list.add("강호동");
    list.add("강호동");
    list.add("강호동");
    Collections.sort(list);
    for (String s : list) {
      System.out.print(s + " ");
    }
  }
}
