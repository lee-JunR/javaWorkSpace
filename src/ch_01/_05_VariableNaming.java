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

// 변수 이름 규칙
// 1. 변수, 클래스 명에는 명사를 짓는다. log (X) logger(O)
// 2. 함수명에는 동사를 넣는다. feature(X) getFeature(O)
// 3. 변수명에는 전치사 생략! "to" 는 때때로 괜찮다.
// 4. 단수와 복수 구분 item, items
// 5. 사용하는 언어의 암묵적인 Rule을 지킨다.
//          CamelCase: Java
//          snake_cake: c
//          Hybrid: python
// 6. 상수는 대문자
