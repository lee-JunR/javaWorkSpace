package ch_07;

import ch_07.camera.Camera;
import ch_07.camera.FactoryCam;
import ch_07.camera.SpeedCam;

public class _14_Polymolphism {

  public static void main(String[] args) {
    // 다형성
    // is a 관계
    // class Person : 사람 클래스
    // class Student extends Person : 학생 클래스 (학생은 사람이다. Student is a Person)
    // class Teacher extends Person : 선생님 클래스 (선생님은 사람이다. Teacher is a Person)

    // 카메라 객체 호출 시 부모 클래스의 이름으로 자식 클래스 호출 가능 -> 다형성
    Camera camera = new Camera();
    Camera factoryCam = new FactoryCam();
    Camera speedCam = new SpeedCam();

    // 다형성 활용
    Camera[] cameras = new Camera[3];
    cameras[0] = new Camera();
    cameras[1] = new FactoryCam();
    cameras[2] = new SpeedCam();

    for (Camera cam : cameras){
      cam.showMainFeature();
    }

    System.out.println("-------------");

    // 단점 :
//     factoryCam.detectFire();
    // speedCam.checkSpeed();
    // speedCam.recognizeLicensePlate(); -> 사용 불가!

    if (camera instanceof Camera) {
      System.out.println("카메라 입니다.");
    }
    // 문제 해결을 위해 "형변환" 을 활용!
    if (factoryCam instanceof FactoryCam) {
      ((FactoryCam)factoryCam).detectFire(); // Camera 클래스형 이었던 factoryCam 객체를 FactoryCam 형으로 형변환
    }
    if (speedCam instanceof SpeedCam) {
      ((SpeedCam)speedCam).checkSpeed();
      ((SpeedCam)speedCam).recognizeLicensePlate();// Camera 클래스형 이었던 speedCam 객체를 SpeedCam 형으로 형변환
    }

    // 기본적으로 모든 클래스들은 Object의 자식클래스로 object 클래스를 상속하기 때문에 이런식으로 사용 가능.
    Object[] objs = new Object[3];
    objs[0] = new Camera();
    objs[1] = new FactoryCam();
    objs[2] = new SpeedCam();
  }

}
