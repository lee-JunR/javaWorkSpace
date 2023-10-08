package ch_01;

public class _05_VariableNaming {
    public static void main(String[] args) {

//        변수 이름 짓는 법
//        1. 저장할 값에 어울리는 이름
//        2. 밑줄 또는 문자로 시작 가능 -> 다른 점
//        3. 한 단어 또는 2개 이상 단어의 연속
//        4. 예약어 사용 불가
//        5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어 제외)
        String nationallity = "대한민국";
        String firstName = "현성";
        String lastName = "김";
        String dateOfBirth = "97-12-31";
        String _flightNo = "AE132";
        String _01 = "1";
//        String String = 3; -> X 예약어

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "kr";
    }
}
