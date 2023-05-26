package Day1.Condition.Operator;

public class Operator {
    public static void main(String[] args) {
        //산술연산, +, -, *, /, %
        System.out.println(10 / 3); // 정수와 정수의 계산 결과 -> 정수, 실수와 실수 계산 결과 실수
        System.out.println(10.0 / 3.0);
        System.out.println(10 % 3);
        System.out.println(10 + 3 * 2);
        System.out.println((10 + 3) * 2);

        // 비교연산 => <, >, <=, >=, ==, !=
        // 결과 참(true)/거짓(false) -> 논리값(불리언)
        System.out.println(10 > 5);
        System.out.println(10 < 5);

        System.out.println(true);
        System.out.println(false);

        // 논리연산
        // and - 다 참일 때만 참, 나머진 거짓
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(false && true && true); // false


        // or(||) - 다 거짓일 때만 거짓, 나머진 참
        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(false || true || true);


    }
}