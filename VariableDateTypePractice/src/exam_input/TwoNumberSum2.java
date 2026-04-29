package exam_input;

import java.util.Scanner;

// [요구사항] 사용자가 입력한 두개의 숫자를 더해서 출력하는 프로그램을 작성하시오.

public class TwoNumberSum2 {
    // 메인 메소드에서부터 실행이 된다.
    public  static void main(String[] args) {
        // 추후 설명
        // 클래스 참조변수 = 메모리할당연산자 생성자(초기값);
        Scanner input = new Scanner(System.in);
        int num1; // 첫번쨰 숫자 저장
        int num2; // 두번째 숫자 저장
        // int sum; // 합을 저장

        /* System.out.print("첫번쨰 숫자를 입력하시오: "); //입력 안내 출력
        num1 = input.nextint(); // 사용자로부터 첫번쨰 숫자를 읽는다.
        System.out.print("두번쨰 숫자를 입력하시오: "); //입력 안내 출력
        num1 = input.nextint(); // 사용자로부터 두번쨰 숫자를 읽는다.*/

        /* 위 입력 작업 대체 가능 */
        System.out.print("두개의 숫자를 공백을 기준으로 입력해 주세요. ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        //sum = num1 + num2; // 두개의 숫자를 더한다.

        //System.out.println("두 수의 합" : "sum); // 합을 출력한다
        System.out.println("두 수의 합 : " + num1 + num2 ); // 결과?
        System.out.println("두 수의 합 : " + (num1 + num2) );

        input.close();
    }
}

