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
}
