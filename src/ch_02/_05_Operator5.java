package ch_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 연산자 순서 : 단항, 이항(산쉬관비논), 삼항, 대입, 순서(,)
        int x = 15;
        int y = 16;

        int max = ( x > y ) ? x : y; //x > y 가 true 면 x 결괏값 false 이면 y 자리 결괏값으로
    }
}
// 삼항 연산자 사용법 대한 정리 : https://tpgns.github.io/2018/04/24/nested-ternaries-are-great/