package ch_10;

public class _01_AnonymousClass1 {

  public static void main(String[] args) {
    // 익명 클래스
    // 내부 클래스 중에서 특별한 녀석

    System.out.println("---그냥 클래스만 사용했을 때---\n");
    Coffee c1 = new Coffee();
    c1.order("아메리카노");

    Coffee c2 = new Coffee();
    c2.order("라떼");

    System.out.println("\n---익명 클래스 사용했을 때---\n");
    // 굉장히 친한 친구 방문
    Coffee specialCoffee = new Coffee() { // specialCoffee 인스턴스만을 위한 order 함수를 오버라이딩 가능!
      @Override
      public void order(String coffee) {
        super.order(coffee);
        System.out.println("(귓속말) 딸기 케이크는 서비스야");
      }
      @Override
      public void returnTray(){
        System.out.println("자리에 두시면 제가 치울게요!");
      }
    };
    specialCoffee.order("바닐라 라떼");
    specialCoffee.returnTray();
  }
}

class Coffee {

  public void order(String coffee) {
    System.out.println("주문하신 " + coffee + "나왔습니다.");
  }
  public void returnTray(){
    System.out.println("커피 반납이 완료되었습니다.");
  }
}
