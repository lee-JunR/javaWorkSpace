package ch_06;

public class _01_Method {
    // 메소드 정의
    public static void sayHello(){
        System.out.println("안녕하세요? 메소드입니다. 메소드 연기 중이죠~");
    }
    public static void main(String[] args) {
        // 메소드 호출
        System.out.println("메소드 호출 전");
        sayHello(); // 메소드 호출
        System.out.println("메소드 호출 후");
    }
}
