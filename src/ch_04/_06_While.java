package ch_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While
//        while(조건){
//        }
        int distance = 25;
        int move = 0;

        System.out.println("목적지와의 거리 : "+distance);
        while(move < distance){
            System.out.println("걷는중");
            System.out.println("걸어온 거리 : " + move);
            move += 3;
        }
        System.out.println("도착 완료 걸은 거리 : " + move);
    }
}
