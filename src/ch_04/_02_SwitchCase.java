package ch_04;

public class _02_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        // 1등 : 전액 장학
        // 2등, 3등 : 반액 장학
        // 그 외 : 장학금 대상 아님

        int ranking = 1;

        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료");
    }
}
