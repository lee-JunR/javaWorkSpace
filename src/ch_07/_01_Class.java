package ch_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍(OOP : Object Oriented Programming)

        // 차량용 블랙박스 제작!
        // 모델명, 해상도, 가격, 색상
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200_000;
        String color = "블랙";
        // -> 변수의 타입이 다 다르기에 array로 입력 불가능!


        //새로운 블랙박스 제품 제작!
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300_000;
        String color2 = "화이트";

        // 또 새로운 제품 제작! -> 변수 12개가 생성됨. -> 이럴때 클래스 사용하면 좋음!

        // 1. 클래스로부터 객체 생성법!
        // 자바에서 클래스로부터 만들어진 것 : 객체! bbox 라는 객체 생성!
        BlackBox bbox = new BlackBox(); // bbox는 BlackBox의 "인스턴스" 라고 말함.
        BlackBox bbox2 = new BlackBox();
    }
}
