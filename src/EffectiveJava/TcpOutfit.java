package EffectiveJava;

import java.util.List;

/* 점층적 생성자 패턴 **/
class TcpOutfit {

  // 필수적인 매개변수
  private String top;
  private String bottoms;
  private String shoes;

  // 선택적인 매개변수
  private String hat;
  private List<String> accessory;
  private String outerwear;

  public TcpOutfit(String top, String bottoms, String shoes) {
    this.top = top;
    this.bottoms = bottoms;
    this.shoes = shoes;
  }

  public TcpOutfit(String top, String bottoms, String shoes, String hat) {
    this.top = top;
    this.bottoms = bottoms;
    this.shoes = shoes;
    this.hat = hat;
  }

  public TcpOutfit(String top, String bottoms, String shoes, String hat, List<String> accessory) {
    this.top = top;
    this.bottoms = bottoms;
    this.shoes = shoes;
    this.hat = hat;
    this.accessory = accessory;
  }

  public TcpOutfit(String top, String bottoms, String shoes, String hat, List<String> accessory,
      String outerwear) {
    this.top = top;
    this.bottoms = bottoms;
    this.shoes = shoes;
    this.hat = hat;
    this.accessory = accessory;
    this.outerwear = outerwear;
  }

  @Override
  public String toString() {
    return "TcpOutfit{" +
        "top='" + top + '\'' +
        ", bottoms='" + bottoms + '\'' +
        ", shoes='" + shoes + '\'' +
        ", hat='" + hat + '\'' +
        ", accessory=" + accessory +
        ", outerwear='" + outerwear + '\'' +
        '}';
  }
}
