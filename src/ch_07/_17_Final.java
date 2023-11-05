package ch_07;

import ch_07.camera.ActionCam;
import ch_07.camera.SlowActionCam;

public class _17_Final {

  public static void main(String[] args) {

    // Final
    // 만약 당신이 인스턴스가 ActionCam 클래스의 변수에 접근 가능하게 하고싶지 않을 때!

    // public (final) class ...
    // public (final) void ...
    // 키워드 정의 순서
    // public > abstract > static > final > ...

    // 1. private String lens 로 선언하기 : private 을 사용하면 ActionCam 외 다른 클래스에서는 접근 불가하지만 해당 클래스에서 접근 가능
    // 2. public final String lens : final 키워드를 사용하면 같은 ActionCam 내에서도 접근 불가!!!
    ActionCam actionCam = new ActionCam();
//    actionCam.lens = "표준렌즈"; (x)

    actionCam.recordVideo();
    actionCam.makeVideo();

    System.out.println("--------------------------------");

    SlowActionCam slowActionCam = new SlowActionCam();
//    slowActionCam.recordVideo();
//    slowActionCam.makeVideo();
  }

}
// 접근 제어자 복습.
// 캡슐화 (Encapsulation) 와
// 정보 은닉 (Information Hiding) 을 구현 가능하게 해주는 것이 접근 제어자

// 접근 제어자
// 1. public : 모든 클래스에서 접근 가능
// 2. default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능 본 위치 영역에서는 ch_07 패키지 아래의 모든 영역에서 가능.
// 3. private : 해당 클래스 내에서만 접근 가능!
// 4. protected : 같은 패키지 내에서 접근 가능. 다른 패키지인 경우 자식 클래스에서 접근 가능
