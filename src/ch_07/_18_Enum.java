package ch_07;

public class _18_Enum {

  public static void main(String[] args) {
    // 열거형 (Enum)
    // 달력 : JAN, FEB, MAR, ...
    // 옷사이즈 : S, M, L, XL, ...
    // os 종류 : MAC, Linux, Windows, ...
    // 에러코드
    // 해상도 : HD, FHD, QHD, UHD, ...

    // 1. 선언 방법
    Resolution resolution = Resolution.HD;
    System.out.println(resolution);

    // 1.1 변경
    resolution = Resolution.FHD;
    System.out.println(resolution);

    // 1.2 문자열로부터 받아서 resolution 으로 변경하기
    String inputValue = "UHD";
    resolution = Resolution.valueOf(inputValue);
    System.out.println(resolution);
    System.out.println("--------------------------------");

    // 2. switch 문으로 활용하기
    System.out.println("동영상 녹화 품질 : ");
    switch (resolution) {
      case HD:
        System.out.println("일반화질");
        break;
      case FHD:
        System.out.println("고화질");
        break;
      case UHD:
        System.out.println("초고화질");
        break;
    }
    System.out.println("--------------------------------");

    // 3. Enum 메소드
    // 3.1 static 메소드 (클래스변수)
    // Enums.valuse() : enum 의 요소들을 순서대로 enum 타입의 요소로 리턴. 메모리에 카피에서 할당되므로 자주 호출 x
    // 3.2 인스턴스 메소드
    // enums.name() : 호출된 값의 이름을 리턴
    // enums.ordinal() : 해당 값이 enum에 정의된 순서를 리턴.

    for (Resolution myRes : Resolution.values()) {
      System.out.println(myRes.name() + " : " + myRes.ordinal());
    }

    System.out.println("--------------------------------");
    for (Resolution myRes : Resolution.values()) {
      System.out.println(myRes.name() + " : " + myRes.getWidth());
    }
  }
}

// Enum 생성하기.
enum Resolution {
  HD(1280), FHD(1920), UHD(3840);

  private final int width; // width 라는 필드를 만들어서 각 enum 들에 속성을 추가할 수 있음. 객체도 넣을 수 있음.

  Resolution(int width) {
    this.width = width;
  }

  public int getWidth() {
    return width;
  }
}