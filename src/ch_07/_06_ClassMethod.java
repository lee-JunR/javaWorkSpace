package ch_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
        // 스태틱 함수, 변수 -> 클래스의 객체 생성 전에도 만들어짐
        BlackBox b1 = new BlackBox(); // 객체 생성
        b1.callServiceCenter();

        BlackBox b2 = new BlackBox(); // 객체 생성
        b2.callServiceCenter();

        BlackBox.callServiceCenter(); // 객체 생성 전에도 만들어지기에 이렇게 직접접근 가능!
    }
}
