package ch_10.Converter;
@FunctionalInterface // 함수형 인터페이스로 사용되려면 인터페이스 안에 함수가 하나뿐이어야하기 때문에 이를 알려주는 anotation 을 붙임
public interface Convertable {
  void convert(int USD);
}
