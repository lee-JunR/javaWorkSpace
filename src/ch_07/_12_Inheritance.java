package ch_07;

import ch_07.camera.Camera;
import ch_07.camera.FactoryCam;
import ch_07.camera.SpeedCam;

// 자식 클래스에서 extends 를 사용해서 부모 클래스의 메소드와 변수를 사용할 수 있다.
public class _12_Inheritance {
  public static void main(String[] args) {
    // 상속
    Camera camera = new Camera();
    FactoryCam factorlyCam = new FactoryCam();
    SpeedCam speedCam = speedCam = new SpeedCam();

    System.out.println(camera.name);
    System.out.println(factorlyCam.name);
    System.out.println(speedCam.name);

    camera.takePicture();
    factorlyCam.recordVideo();
    speedCam.takePicture();

    factorlyCam.detectFire();
    speedCam.checkSpeed();
    speedCam.recognizeLicensePlate();
  }
}
