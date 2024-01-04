package EffectiveJava;

import java.util.Arrays;
import java.util.List;

class Outfit {

  private String top;
  private String bottoms;
  private String shoes;



  // 선택적인 매개변수
  private String hat = "안씀";
  private List<String> accessory = Arrays.asList("안씀");
  private String outerwear = "안씀";

  public Outfit(String top, String bottoms, String shoes) {
    this.top = top;
    this.bottoms = bottoms;
    this.shoes = shoes;
  }

  @Override
  public String toString() {
    return "Outfit{" +
        "top='" + top + '\'' +
        ", bottoms='" + bottoms + '\'' +
        ", shoes='" + shoes + '\'' +
        ", hat='" + hat + '\'' +
        ", accessory=" + accessory +
        ", outerwear='" + outerwear + '\'' +
        '}';
  }
}
