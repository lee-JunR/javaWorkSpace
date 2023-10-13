package ch_08;

import ch_07.BlackBoxRefurbish; // 다른 패키지.클래스 를 사용하겠다는 의미! ch_07.* : ch_07 패키지의 모든 클래스를 사용하겠다.

/** ch_07 / 10_접근제어자 실습을 위한 클래스입니다. */
public class
_00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public 다른 패키지에서 접근 가능
//        b1.resolution - "FHD"; // default 다른 패키지에서 접근 불가
//        b1.price = "200_000"; // private 선언된 클래스 내에서만 접근 가능
//        b1.color = "블랙"; // protected 자식 클래스인 경우 다른 패키지에서 접근 가능.
    }
}
