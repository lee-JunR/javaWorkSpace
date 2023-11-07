package ch_10;

public class _02_AnounymousClass2 {

  public static void main(String[] args) {
    // 익명 클래스 추상 클래스로 활용하기
    HomeMadeBurger momMadeBurger = getMomMadeBurger();
    momMadeBurger.cook();

    HomeMadeBurger broMadeBurger = getBroMadeBurger();
    broMadeBurger.cook();
  }

  private static HomeMadeBurger getBroMadeBurger() {
    return new HomeMadeBurger(){
      @Override
      public void cook() {
        System.out.println("집에서 만드는 동생표 군대리아");
        System.out.println("재료: 빵 치킨패티, 양배추 샐러드, 딸기잼, 치즈, 삶은 계란");
      }
    };
  }
  // getMomMadeBurger, getBroMadeBurger 와 같이 그때 그때 추상메소드를 만들어서 반환
  public static HomeMadeBurger getMomMadeBurger(){
    return new HomeMadeBurger(){
      @Override
      public void cook() {
        System.out.println("집에서 만드는 엄마표 수제 버거");
        System.out.println("재료: 빵 소고기패티, 해시브라운, 양상추, 마요네즈 피클");
      }
    };
  }
}

abstract class HomeMadeBurger{
  public abstract void cook();
} // 만약 추상 클래스는 있으나 클래스를 상속받을때마다 수행하는게 다를경우 쓰일듯.