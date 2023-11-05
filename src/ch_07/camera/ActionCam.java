package ch_07.camera;

// _17_Final 공부를 위해 생성된 클래스입니다.
public final class ActionCam extends Camera {

//  public final String lens = "광각렌즈";
  // final 키워드 내에서 정의 안해도 됨 예시 ->
  public final String lens;

  public ActionCam() { // final 키워드는 클래스에서도 사용 가능!
    super("액션 카메라");
    this.lens = "광각렌즈";
  }

  public final void makeVideo() { // final 키워드는 메소드에서도 사용 가능!
    System.out.println(this.name + " : " + this.lens + " 로 멋진 비디오를 제작합니다.");
  }

}
