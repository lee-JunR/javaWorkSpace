package ch_07.camera;

public class SlowActionCam /*extends ActionCam */ { //ActionCam 클래스가 final 클래스라 상속 불가
  public String name;
  public SlowActionCam() {
    this.name = "슬로우 액션 카메라";
  }

//   ActionCam 클래스에서 상속받은 makeVedio() 메소드를 오버라이딩 하고싶지만 final 메소드라 오버라이딩 불가능 ㅠㅠ!!
//    public void makeVideo() {
//      System.out.println(this.name + " : "
//          + this.lens + " 로 멋진 슬로우 모드 액션 비디오를 제작합니다.");
//    }


}
