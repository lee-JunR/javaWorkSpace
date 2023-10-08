package ch_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회 / 숏컷 : fori
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // for 반복문 순회
        for (int i = 0; i < coffees.length ; i++) {
            System.out.println(coffees[i] + "\t하나");
        }
        System.out.println("주세요");

        System.out.println("-------------------");

        // enhanced for (for-each) 반복문 순회 / 숏컷 : foreach
        for (String c : coffees) {
            System.out.println(c + "\t하나");
        }
        System.out.println("주세요");
    }
}
