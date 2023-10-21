package ch_07;

import ch_07.camera.Camera;
import ch_07.camera.FactoryCam;
import ch_07.camera.SpeedCam;

public class _13_MethodOverriding {
  public static void main(String[] args) {
    // 메소드 오버라이딩 : 자식 클래스에서 부모 클래스의 메소드를 덮어 쓰기. (재정의)
    // * 메소드 오버라이딩 : 같은 클래스에서 똑같은 이름의 메소드를 인수의 갯수가 타입에 따라 다르게 성의 -> 다형
    Camera camera = new Camera();
    FactoryCam factoryCam = new FactoryCam();
    SpeedCam speedCam = new SpeedCam();

    camera.showMainFeature();
    factoryCam.showMainFeature();
    speedCam.showMainFeature();
    // 자식 클래스에서 오버라이딩된 메소드가 실행되는 것을 볼 수 있음.
  }
}
