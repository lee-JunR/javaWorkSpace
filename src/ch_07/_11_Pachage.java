package ch_07; // 패키지 : 연관된 클래스들을 묶어놓는 것을 패키지!

import java.util.Random;// 자바 기본 클래스인 랜덤 클래스 사용!

public class _11_Pachage {
    public static void main(String[] args) {
        // 패키지
        // 다른 패키지의 클래스를 사용하고 싶은 경우 import 함수 사용!
//import ch_07.BlackBoxRefurbish; // 다른 패키지.클래스 를 사용하겠다는 의미! ch_07.* : ch_07 패키지의 모든 클래스를 사용하겠다.

        Random random = new Random();
        System.out.println("랜덤 정수 : "+ random.nextInt()); // int 의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10)); // 0 이상 10 미만의 정수형 값 반환
        System.out.println("랜덤 실수 : "+ random.nextFloat()); // 0.0 이상 1.0 미만의 실수값
//        System.out.println("랜덤 실수 (범위) : " + random.nextFloat(10.0)); // 0 이상 10 미만의 실수형 값 반환 불가!

        //만약 5.0 이상 10.0 미만의 실수를 뽑으려면?
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : " + (min + (max - min) * random.nextDouble())); // 5.0 이상 10.0 미만의 실수형 값 반환


        System.out.println("랜덤 boolean : " + random.nextBoolean());
        System.out.println();

        // 로또 번호를 랜덤으로 뽑으려면? 1~45
        System.out.println("로또 번호 : " + (random.nextInt(45)+ 1));

        // 자바의 다양한 기본 클래스 제공
        // Math, Scanner, stringBuilder, StringBuffer, StringTokenizer
        // BigInteger, BigDeccimal
        // LocalDate, LocalTime, LocalDateTime, DateTimeFormatter, ...
    }
}
