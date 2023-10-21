package ch_07.camera;

public class SpeedCam extends Camera{ // 자식 클래스
  public SpeedCam() {
    this.name = "과속단속 카메라";
  }
  public void checkSpeed() {
    // 속도 확인
    System.out.println("속도를 측정합니다");
  }
  public void recognizeLicensePlate() {
    // 번호 인식
    System.out.println("차량 번호를 인식합니다");
  }
  @Override // annotation : 컴파일러에게 부모클래스의 메소드를 오버라이드하고있다는 것 이라는 걸 인식시키는 주석
            // 만약 부모 클래스에 오버라이드할 메소드가 없을 경우 에러!! -> 없어도 동작에 큰 문제는 없긴 함.
  public void showMainFeature() {
    System.out.println(this.name + "의 메인 기능 : 속도 측정, 차량 번호 인식");
  }
}
