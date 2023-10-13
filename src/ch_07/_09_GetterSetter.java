package ch_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        // Gettter : 값을 가지고 오는 메소드  /  Setter : 값을 설정하는 메소드
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
//        b1.resolution = "FHD"; 실수로 resolution 설정 안함!!!
        b1.price = 200_000;
        b1.color = "블랙";

        // 할인 행사
        b1.price = -5000; // 실수로 할인행사 5000원을 해줘야 하는데 -5000 해버림!
        System.out.println("가격 : "+ b1.price + " 원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("--------------");
        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");
        System.out.println("가격 : "+ b2.getPrice() + " 원");
        System.out.println("해상도 : " + b2.getResolution());

    }
}
