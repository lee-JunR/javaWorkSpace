package ch_06;

public class _07_VariableScope {
    public static int variableTest(){
        return regioinVariable01;  // 오류 발생
    }
    public static void main(String[] args) {
        // 변수의 범위
        //  메소드를 사용 시 메소드 내에서 선언된 변수는 지역변수가 되어 다른 메소드에서 사용시 문제가 됨.
        //
        int regionVariable01 = 1; // 지역변수
        variableTest();
    }
}
