package ch_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //TypeCasting : 형변환
        int score = 93;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);

        float score_f = 94.3F;
        double score_d = 98.8;
        System.out.println((int)score_f);
        System.out.println((double)score_d);


        // int -> long -> float -> double ( 자동 형 변환 / 반대는 안됨)
        float convetedScore_f = score;
        double convetedScore_d = convetedScore_f;

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        System.out.println("string : "+s1);

        s1 = Integer.toString(93);
        System.out.println("string : "+s1);

        // 문자열을 숫자로
        int i = Integer.parseInt(("93"));
        System.out.println(i);
    }
}
