package ch_10;

import ch_10.Converter.Convertable;
import ch_10.Converter.ConvertableWithNoPrams;
import ch_10.Converter.ConvertableWithReturn;
import ch_10.Converter.ConvertableWithTwoPrams;
import ch_10.Converter.KRWConverter;

public class _04_FunctionalInterface {

  public static void main(String[] args) {
    KRWConverter converter = new KRWConverter();
    converter.convert(2);

    // converter 를
    convertUSD((USD) -> System.out.println(USD + "달러 = " + USD*1400 +"원") , 2);

    Convertable convertable = (USD) -> System.out.println(USD + "달러 = " + USD*1400 +"원");
    convertUSD(convertable, 2);

    // 전달값이 없는 경우
    ConvertableWithNoPrams c1 = () -> System.out.println("1달러 = 1400원");
    c1.Convert();

    // 두 줄 이상의 코드가 있다면?
    c1 = () -> {
      int USD = 5;
      int KRW = 1400;
      System.out.println(USD + "달러 = " + USD*KRW +"원");
    };
    c1.Convert();

    // 전달값이 2개 이상인 경우
    ConvertableWithTwoPrams c2 = (d, w) -> {
      System.out.println(d + "달러 = " + d*w +"원");
    };
    c2.convert(10,1400);

    // 반환값이 있는 경우
    ConvertableWithReturn c3 = (d, w) -> d * w;;
    int result = c3.convert(20,1400);
    System.out.println("20달러 = "+result + "원");
  }

  public static void convertUSD(Convertable converter, int USD){
    converter.convert(USD);
  }
}
