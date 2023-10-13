package ch_07;

// 자바 파일에서 클래스를 여러개 선언 가능!
// 하지만 public 클래스의 경우 자바 파일 명과 같아야함!
public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화 (Encapsulation) 와
        // 정보 은닉 (Information Hiding) 을 구현 가능하게 해주는 것이 접근 제어자

        // 접근 제어자
        // 1. public : 모든 클래스에서 접근 가능
        // 2. default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능 본 위치 영역에서는 ch_07 패키지 아래의 모든 영역에서 가능.
        // 3. private : 해당 클래스 내에서만 접근 가능!
        // 4. protected : 같은 패키지 내에서 접근 가능. 다른 패키지인 경우 자식 클래스에서 접근 가능



        //private 연습.

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
//        b1.price = 200_000; price 의 특성이 private이라 오류 발생
        b1.setPrice(200_000);
        b1.color = "블랙";

        // 할인 행사
//        b1.price = -5000;
        b1.setPrice(-5000);
//        System.out.println("가격 : "+ b1.price + " 원");
        System.out.println("가격 : "+ b1.getPrice() + " 원");
        // 고객 문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("--------------");
        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");
        System.out.println("가격 : "+ b2.getPrice() + " 원");
        System.out.println("해상도 : " + b2.getResolution());

    }
}
