package ch_07.camera;
// FactoryCam is a Camera -> is a 관계 성립!

public class FactoryCam extends Camera{ // 자식 클래스

  public FactoryCam() {
   super("공장 카메라");
  }
  // (_15_Super) 만약 recordVedio 를 하면서 detectFire() 메소드가 같이 실행되게 하고싶을 때.
  public void recordVideo() {
    // 방법 1. 메소드 오버라이딩을 통해 recordVedio() 의 메소드를 변경. -> 이렇게 하면 상속의 의미가 떨어질 수 있음
    // System.out.println(this.name + "의 영상을 저장합니다.");
    // 방법 2. Super 를 이용해서 부모 클래스의 메소드를 사용해 오버라이딩
    super.recordVideo();
    detectFire();
  }
  public void detectFire(){
    // 화재 감지
    System.out.println("화재를 감지합니다.");
  }
  public void showMainFeature() {
    System.out.println(this.name + "의 메인 기능 : 화재 감지");
  }
}
