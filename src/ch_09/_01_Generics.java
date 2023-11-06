package ch_09;

public class _01_Generics {

  public static void main(String[] args) {
    // 제네릭스

    Integer[] iArray = {1, 2, 3, 4, 5};
    Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
    String[] sArray = {"A", "B", "C", "D", "E"};

    System.out.println("Generics 사용 전");
    printIntArray(iArray);
    printDoubleArray(dArray);
    printStringArray(sArray);

    System.out.println("Generics 사용 후");
    printAnyArray(iArray);
    printAnyArray(dArray);
    printAnyArray(sArray);
  }
  // T : Type 다른걸로 해도 됨. 일반적으로는 K : key, E : Element, V : Value
  private static <T> void printAnyArray(T[] array){
    for (T t : array) {
      System.out.print(t + " ");
    }
    System.out.println(); // 줄바꿈
  }

  private static void printStringArray(String[] sArray) {
    for (String s : sArray) {
      System.out.print(s + " ");
    }
    System.out.println(); // 줄바꿈
  }

  private static void printDoubleArray(Double[] dArray) {
    for (double d : dArray) {
      System.out.print(d + " ");
    }
    System.out.println(); // 줄바꿈
  }

  private static void printIntArray(Integer[] iArray) {
    for (int i : iArray) {
      System.out.print(i + " ");
    }
    System.out.println(); // 줄바꿈
  }

}
