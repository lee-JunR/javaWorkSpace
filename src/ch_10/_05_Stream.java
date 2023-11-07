package ch_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {

  public static void main(String[] args) {
    // 스트림 : 배열, 파일, 컬렉션으로 만들 수 있음

    // 1. 배열에서의 스트림 Arrays.stream()
    int[] scores = {100, 95, 90, 85, 80};
    IntStream scoreStream = Arrays.stream(scores);

    String[] langs = {"python", "java", "c", "c++", "c#"};
    Stream<String> langsStream = Arrays.stream(langs);

    // 2. Collection 의 List 에서의 스트림 Collections.stream()
    List<String> langList = new ArrayList<>();
//    langList.add("python");
//    langList.add("java");
//    langList.add("c");
    langList = Arrays.asList(langs); // array 배열을 List에 넣음.
    System.out.println(langList.size());
    Stream<String> langListStream = langList.stream();

    // 3. Stream.of() 로 초기화
    Stream<String> stringStream = Stream.of("python", "java", "c", "c++", "c#");

    // 스트림 사용
    // 스트림
    //  - 중간 연산 (Intermediate Operation) : 스트림의 데이터들을 필터링 하는 과정 속에서 연산되는 작업 여러번 사용 가능
    //    - 함수 : filter, map, sorted, distinct, skip, ...
    //  - 최종 연산 (Terminal Operation)     : 중간 연산을 통해 나오는 결과물 딱 한번 사용 가능
    //    - 함수 : count, min, max, sum, forEach, anyMatch, allMatch, ...

    //한번 쓰고 난 스트림은 재사용 불가능

    // scores 에서 90점 이상인 점수만 출력
    Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
//    Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);

    System.out.println("--------------------------------------------------------");

    // 90 점 이상인 사람의 수
    int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
    System.out.println(count);
    System.out.println("--------------------------------------------------------");

    // 90 점 이상인 사람들의 점수의 합

    int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
    System.out.println(sum);
    System.out.println("--------------------------------------------------------");

    // 90 점 이상인 사람들의 점수를 정렬
    Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
    System.out.println("--------------------------------------------------------");

//    langs : {"python", "java", "c", "c++", "c#"};
    Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
    System.out.println("--------------------------------------------------------");

    // java 라는 글자를 포함하는 언어
    Arrays.stream(langs).filter(x -> x.startsWith("java")).forEach(System.out::println);
    System.out.println("--------------------------------------------------------");

    // 글자 길이가 4 이하인 언어를 정렬해서 출력
    langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
    System.out.println("--------------------------------------------------------");

    // 4 글자 이하의 언어 중에서 c라는 글자를 포함하는 언어
    langList.stream()
        .filter(x -> x.length() <= 4)
        .filter(x -> x.contains("c"))
        .forEach(System.out::println);
    System.out.println("--------------------------------------------------------");

    // 4 글자 이하의 언어 중에 c 라는 글자를 포함하는 언어가 하나라도 있는지?
    boolean anyMatch = langList.stream()
        .filter(x -> x.length() <= 4)
        .anyMatch(x -> x.contains("c"));
    System.out.println(anyMatch);
    System.out.println("--------------------------------------------------------");

    // 4 글자 이하의 언어가 모두 c 라는 글자를 포함하는지?
    boolean allMatch = langList.stream()
        .filter(x -> x.length() <= 4)
        .allMatch(x -> x.contains("c"));
    System.out.println(allMatch);
    System.out.println("--------------------------------------------------------");

    // 4글자 이하의 어넝 중에서 c 라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
    // map : 객체중 내가 원하는 인스턴스 변수를 꺼내는 역할
    langList.stream()
        .filter(x -> x.length() <= 4)
        .filter(x -> x.contains("c"))
        .map(x -> x + "(어려워요)")
        .forEach(System.out::println);
    System.out.println("--------------------------------------------------------");

    // c 라는 글자를 포함한는 언어를 대문자로 출력
    langList.stream()
        .filter(x -> x.contains("c"))
        .map(String::toUpperCase)
        .forEach(System.out::println);
    System.out.println("--------------------------------------------------------");

    // c 라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
    List<String> langListStartsWithC = langList.stream()
        .filter(x -> x.contains("c"))
        .map(String::toUpperCase)
        .collect(Collectors.toList());

    langListStartsWithC.stream().forEach(System.out::println);
  }

}
