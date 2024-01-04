package EffectiveJava;

import java.util.Arrays;
import java.util.List;

// 자바빈즈 방식으로 만든 클래스
class BeansOutfit {
  // 필수적인 매개변수
  private String top;
  private String bottoms;
  private String shoes;

  // 선택적인 매개변수
  private String hat = "안씀";
  private List<String> accessory = Arrays.asList("안씀");
  private String outerwear = "안씀";

  public void setTop(String top) {
    this.top = top;
  }

  public void setBottoms(String bottoms) {
    this.bottoms = bottoms;
  }

  public void setShoes(String shoes) {
    this.shoes = shoes;
  }

  public void setHat(String hat) {
    this.hat = hat;
  }

  public void setAccessory(List<String> accessory) {
    this.accessory = accessory;
  }

  public void setOuterwear(String outerwear) {
    this.outerwear = outerwear;
  }

  @Override
  public String toString() {
    return "BeansOutfit{" +
        "top='" + top + '\'' +
        ", bottoms='" + bottoms + '\'' +
        ", shoes='" + shoes + '\'' +
        ", hat='" + hat + '\'' +
        ", accessory=" + accessory +
        ", outerwear='" + outerwear + '\'' +
        '}';
  }
}
