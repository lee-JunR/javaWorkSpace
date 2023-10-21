package ch_07.camera;
// _12_상속 에서 생성한 클래스입니다.

public class Camera { // 부모 클래스
  public String name;

  public Camera() {
    this("카메라");
  }

  protected Camera(String name) { // protected : 자식 클래스에서 접근 가능
    this.name = name;
  }

  public void takePicture() {
    // 사진촬영
    System.out.println(this.name + " : 사진을 촬영합니다.");

  }

  public void recordVideo() {
    // 동영상 녹화
    System.out.println(this.name + " : 동영상을 녹화합니다.");
  }
  /** _13_메소드 오버라이딩에서 만든 클래스의 주기능을 출력하는 메소드 */
  public void showMainFeature() {
    System.out.println(this.name + "의 메인 기능 : 사진 촬영, 동영상 녹화");
  }
}
