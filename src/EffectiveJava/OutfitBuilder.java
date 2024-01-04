package EffectiveJava;

import java.util.Arrays;
import java.util.List;

class OutfitBuilder {
  private String top;
  private String bottoms;
  private String shoes;

  // 선택적인 매개변수
  private String hat = "안씀";
  private List<String> accessory = Arrays.asList("안씀");
  private String outerwear = "안씀";

  public OutfitBuilder(String top, String bottoms, String shoes) {
    this.top = top;
    this.bottoms = bottoms;
    this.shoes = shoes;
  }

  public OutfitBuilder Top(String top) {
    this.top = top;
    return this;
  }

  public OutfitBuilder Bottoms(String bottoms) {
    this.bottoms = bottoms;
    return this;
  }

  public OutfitBuilder Shoes(String shoes) {
    this.shoes = shoes;
    return this;
  }

  public OutfitBuilder Hat(String hat) {
    this.hat = hat;
    return this;
  }

  public OutfitBuilder Accessory(List<String> accessory) {
    this.accessory = accessory;
    return this;
  }

  public OutfitBuilder Outerwear(String outerwear) {
    this.outerwear = outerwear;
    return this;
  }
  public Outfit build(){
    return new Outfit(this.top, this.bottoms, this.shoes);
  }
}
