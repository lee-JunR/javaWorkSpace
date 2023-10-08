package ch_05;

import java.util.Arrays;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간

        // 배열 선언 1번째 방법
        String[] coffeeArr1 = new String[4]; // 크기 4를 가지는 coffeeArr 어레이

        // 배열 선언 2번째 방법
        String coffeeArr2[] = new String[4];

        // 배열 값 초기화
//        coffeeArr1[0] = "아메리카노";
//        coffeeArr1[1] = "카페모카";
//        coffeeArr1[2] = "라떼";
//        coffeeArr1[3] = "카푸치노";

        // 배열 선언 3번째 방법 + 초기화
        String[] coffeeArr3 = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 배열 선언 4번째 방법 + 초기화
        String[] coffeeArr4 = {"아메리카노", "카페모카", "라떼", "카푸치노"};


        //커피 주문
        System.out.println(coffeeArr4[0] + " 하나 주세요");
        coffeeArr4[0] = "에스프레소"; // 값 변경
        System.out.println("아 아니다 " + coffeeArr4[0] + " 하나 주세요");


    }
}
