package ch_07;

import java.util.Base64;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName= "까망이"; // 모델명 업데이트하려면?
        b1.appendModelName("(최신형)");
        System.out.println(b1.modelName);
//        전달값 변수와 클래스 내의 인스턴스 변수가 같은 경우 키워드 this. 붙여 인스턴스 변수라는 것을 알려줌



        // 인텔리제이에서
        // option + enter  : 클래스 자동 생성 추천
        // control + {원하는 메소드 클릭} : 메소드로 이동
        // (MAC) Option + Space : 코드 보기
    }
}
