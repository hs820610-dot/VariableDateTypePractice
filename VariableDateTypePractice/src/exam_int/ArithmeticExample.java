package exam_int;

import java.util.Scanner;

public class ArithmeticExample {
    public static void main(String[] args) {

        int a, b;

        Scanner input = new Scanner(System.in);
        System.out.println("첫번쨰 숫자를 입력하세요.:" );
        a = input.nextInt();

        System.out.println("두 번쨰 숫자를 입력하세요.:" );
        b = input.nextInt();

        System.out.println("덧셈 결과:" + (a + b));

        System.out.println("뺄셈 결과:" + (a - b));

        System.out.println("곱셈 결과:" + (a * b));

        System.out.println("나눗셈 결과:" + (a / b));

        System.out.println("나머지 결과:" + (a % b));



    }
}
