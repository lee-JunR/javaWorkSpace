package ch_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        //블랙박스 충돌 시 자동으로 신고하는 클래스 제작
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        //자동 신고 기능 개발 여부
        System.out.println("----개발 전----");
        System.out.println("자동 신고 기능 : " + b1.canAutoReport);
        System.out.println("자동 신고 기능 : " + b2.canAutoReport);
        // canAutoReport 변수는 모든 인스턴스에 적용되는 static 변수이므로
        // 접근할 때 인스턴스명.canAutoReport 가 아니라 클래스명.canAutoReport 가 더 바람직
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : "+ BlackBox.canAutoReport);

        // 자동 신고 기능 개발 후 확인
        BlackBox.canAutoReport = true;
        System.out.println("----개발 후----");
        System.out.println("자동 신고 기능 : " + b1.canAutoReport);
        System.out.println("자동 신고 기능 : " + b2.canAutoReport);
        // canAutoReport 변수는 모든 인스턴스에 적용되는 static 변수이므로
        // 접근할 때 인스턴스명.canAutoReport 가 아니라 클래스명.canAutoReport 가 더 바람직
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : "+ BlackBox.canAutoReport);

    }
}
