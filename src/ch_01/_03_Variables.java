package ch_01;

public class _03_Variables {
    public static void main(String[] args) {
        System.out.println("가나"+"다");
        String name;
        name = "가나";
        System.out.println(name+"다");
        float f = 0.123456789012F; //float 값으로 자동 변환됨
        double d = 0.123456789012;
        System.out.println("float : " + f +", double : " + d);
        int i = 123456789; // 자동변환 X -21억~21억 까지 변수값 저장 가능 위는 저장값 초과
        long l = 123_456_789_123L;
    }
}