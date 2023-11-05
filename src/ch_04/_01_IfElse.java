package ch_04;

public class _01_IfElse {
    public static void main(String[] args) {
        // 조건문 Elseif
        // 한라봉 에이드가 있으면 +1, 또는 망고 주스가 있으면 +1, else  아이스아메리카노 +1

        boolean hallabongAde = true;
        boolean mangoJuice = true;

        if(hallabongAde){
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주소 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");
    }
}

// else 의 사용은 지양하는 것이 좋다 메소드의 indent(tab으로 띄워쓰는거)는 3 이상을 넘어가지 않고 구현 가능.