package ch_07;

public class BlackBox {
    // 인스턴스 변수 혹은 필드 생성방법
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상

    static boolean canAutoReport = false; //자동 신고 기능 클래스로부터 만들어지는 모든 객체에 똑같이 적용!

    /** 04_Method 강의 에서 제작한 신고 지원 확인 함수 */
    void autoReport(){
        if (canAutoReport){
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }else{
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }
    /** 04_Method 강의 에서 제작한 전달값과 반환값이 있는 함수 */
    int insertMemoryCard(int capacity){
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
        return capacity;
    }

    /** 04_Method 강의 에서 제작한 전달값과 반환값이 있는 함수 */
    int getVideoFileCount(int type){
        if (type == 1){ // 일반 영상
            return 9;
        }
        else if (type == 2){ //이벤트 영상
            return 1;
        }
        return 10;
    }

    /** 05_MethodOverloading 강의에서 제작한 함수 show : 보여줄지 말지 결정, int 블랙박스 시간 몇분 단위로 끊어서 기록할지*/
    void record(boolean showDataTime, boolean showSpeed, int min){
        System.out.println("녹화를 시작합니다.");
        if(showDataTime){
            System.out.println("영상에 날짜 정보가 표시됩니다.");
        }
        if(showSpeed){
            System.out.println("영상에 속도 정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 표시됩니다.");
    }

    /** 05_MethodOverloading 강의에서 제작한 함수 record 함수를 오버로딩해서 기본값을 정의함.*/
    void record(){
        record(true, true, 5);
    }

    /** 06_ClassMethod 에서 제작한 스테틱 함수 static으로 정의하면 인스턴스가 달라도 같은 동작 실행 */
    static void callServiceCenter(){
        System.out.println("서비스 센터(1588-0000)로 연결합니다.");
//        modelName = "test"; 인스턴스 변수는 개체가 만들어져야만들어지는 인스턴스 변수이기 때문에 사용 불가
        canAutoReport = false; // 스태틱 변수는 객체 생성 전에도 만들어져 있어 사용 가능
    }
}
