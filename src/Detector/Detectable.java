package Detector;

public interface Detectable {
  public static final String NAME = "감지자"; // 변수 선언시 public static final 는 생략해서 정의됨
  public abstract void detect(); // public abstract는 생략됨
}