package ch_07;

import java.util.Base64;

public class _08_Constuctor {
    public static void main(String[] args) {
        // 생성자 실습
        // 클래스 객체를 생성할 때 자동적으로 실행되는 것들.
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200_000;
        b1.color = "블랙";
        System.out.println(b1.modelName);
        System.out.println("serialNumbaer : " + b1.serialNumber);

        System.out.println("-------------------");

        // 사용자 정의 생성자 실습
        BlackBox b2 = new BlackBox("하양이", "UHD", 300_000, "하양");
        System.out.println(b2.modelName);
        System.out.println("serialNumbaer : " + b2.serialNumber);
    }
}
