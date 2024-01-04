package EffectiveJava;

import java.util.Arrays;

public class BuilderPattern {

  /* 직접 빌더패턴 연습하기
   * 간단한 객체 생각해서 만들어보자
   * 필통 객체 안에 필드는 연필, 지우개, 볼펜, 샤프 (단, 학생이라 지우개와 샤프, 연필은 필수)**/
  // 필수 매개변수만으로 객체 생성
  public static void main(String[] args) {
    // 매개변수가 많을 때!!

    // 1. Telescoping 패턴으로 생성
      // 필수 필드
    TcpOutfit tcpOutfit = new TcpOutfit("셔츠", "청바지", "슬리퍼");
      // 필수 필드 + 선택필드 1개
    TcpOutfit tcpOutfit1 = new TcpOutfit("셔츠", "청바지", "슬리퍼", "캡");
      // 모든 필드로 객체 생성
    TcpOutfit tcpOutfit2 = new TcpOutfit("셔츠", "청바지", "슬리퍼", "캡", Arrays.asList("목걸이", "반지"), "패딩");

    System.out.println("--------Telescoping Constructer Pettern---------");
    System.out.println("필수 필드) "+ tcpOutfit.toString());
    System.out.println("필수 필드 + 선택필드 1개) " + tcpOutfit1.toString());
    System.out.println("모든 필드) " + tcpOutfit2.toString());

    // 2. 자바빈즈 패턴으로 생성
    BeansOutfit beans = new BeansOutfit();
      // 필수 필드
    beans.setTop("셔츠");
    beans.setBottoms("청바지");
    beans.setShoes("슬리퍼");

    System.out.println("--------Java Beans Pettern---------");
    System.out.println("필수 필드) "+ tcpOutfit.toString());

    // 3. 빌더 패턴으로 생성
    // Todo: 빌더패턴 완성

  }
}
