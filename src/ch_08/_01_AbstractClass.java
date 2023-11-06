package ch_08;

import ch_08.Camera.Camera;
import ch_08.Camera.FactoryCam;
import ch_08.Camera.SpeedCam;

public class _01_AbstractClass {

  public static void main(String[] args) {
    // 데이터 추상화 (Data Abstraction) : 디테일한 정보는 숨기고 꼭 필요한 정보만 공개하는 것. <- 추상클래스와 인터페이스로 실현 가능.
    // 추상 클래스 (아직 완성되지 않은 클래스)

    // Camera camera = new Camera(); 직접 객체를 생성 불가능!!

    // 추상 클래스를 상속해 클래스를 만들어 인스턴스 생성.
    FactoryCam factoryCam = new FactoryCam();
    factoryCam.showMainFeature();

    // 추상 클래스로 직접 인스턴스 정의도 가능.
    Camera speedCam = new SpeedCam();
    speedCam.showMainFeature();
  }

}
