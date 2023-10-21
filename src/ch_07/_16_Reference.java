package ch_07;

import ch_07.camera.Camera;

public class _16_Reference {
  public static void main(String[] args) {
    // 참조
    // 기본 자료형(Primitive Data Types) : int, float, double, char, boolean, ... 의 초기값.
    // 기본 자료형은 메소드가 없음.
    System.out.println("기본 자료형 배열의 초기화값");
    int[] i = new int[3];
    System.out.println("int : " + i[0]); // 초기화를 안해줘도 0이 나옴

    double[] d = new double[3];
    System.out.println("double : " + d[0]);

    float[] f = new float[3];
    System.out.println("float : " + f[0]);

    char[] c = new char[3];
    System.out.println("char : " + c[0]);

    boolean[] b = new boolean[3];
    System.out.println("boolean : " + b[0]);

    System.out.println("--------------------------------");

    // 참조 자료형 (Non-Primitive Data Types) : String, Object, Camera, FactoryCam, SpeedCam, ...
    // 참조 자료형은 메소드가 있을수도 있음 & 대문자로 시작!
    System.out.println("참조 자료형 배열의 기본형");
    String[] s = new String[3];
    System.out.println("String : " + s[0]);

    Object[] o = new Object[3];
    System.out.println("Object : " + o[0]);

    Camera[] cam = new Camera[3];
    System.out.println("Camera : " + cam[0]);

    System.out.println("--------------------------------");
    int x = 10;
    int y = 20;
    y = x;
    System.out.println(x);
    System.out.println(y);
    y = 30;
    System.out.println(x);
    System.out.println(y);
    System.out.println("--------------------------------");
    Camera c1 = new Camera();
    Camera c2 = new Camera();
    c1.name = "카메라1";
    c2.name = "카메라2";
    System.out.println(c1.name);
    System.out.println(c2.name);
    c2 = c1; // c2 라는 객체는 참조객체이기 때문에 c1 의 주소를 가르킴.
    System.out.println(c1.name);
    System.out.println(c2.name);
    c2.name = "고장난 카메라"; // c2의 주소값이 가르키는 메모리를 고장난 카메라로 바꾸면 c1의 주소값이 가르키는 메모리도 같으므로 같이 바뀜
    System.out.println(c1.name);
    System.out.println(c2.name);
    c2 = null; // 이렇게 하면 같은 주소를 가르키지 않게 됨.
  }
}