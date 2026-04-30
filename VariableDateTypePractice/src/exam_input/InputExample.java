package exam_input;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
      // [요구사항]
      // 두 변수를 선언하고 임의의 수를 입력받아 서로 값을 교환하여 값을 출력하는 프로그램을 입력하시오.)
      Scanner input = new Scanner(System.in);
      int num1, num2, temp;

      System.out.println("[예제 1] 두수의 교환 ");

      System.out.print("첫번째 숫자 입력해 주세요.");
      num1 = input.nextInt();
      System.out.print("두번쨰 숫자 입력해 주세요.");
      num2 = input.nextInt();

      /* 위작업 대체 가능
       System.out.print("두개의 숫자를 공백을 기준으로 입력해 주세요.");
       num1 = input.nextInt();
       num2 = input.nextInt();
       */

        System.out.printf("num1 = %d, num2 = %d", num1, num2);

        temp = num1;
        num1 = num2;
        num2 = temp;
        // printf()에서 f는 format을 의미.(출력형태,변수 또는 수식)
        System.out.printf("num1 = %d, num2 = %d\n", num1, num2);

        //[요구사항]
        // 두수를 입력받아 a,b 변수에 대입 후 변수 a에 기억된 값을 1 증가시키고,
        // 변수 b에 기억된 값은 1 감소시켜서 출력하는 프로그램을 작성하시오.
        int a,b;
        System.out.println("[예제2]변수 a에 기억된 값을 1 증가시키고, 변수 b에 기억된 값은 1 감소시킨다. ");

        System.out.print("첫번쨰 숫자, 두번쨰 숫자를 공백으로 구분하여 입력해 주세요.");
        a = input.nextInt();
        b = input.nextInt();

        a = a + 1; // a++;
        b = b - 1; // b--

        // 출력1 방법
        // System.out.println("a = %d, b = %d, a,b);

        // 출력2 방법
        System.out.printf("a = %d, b = %d ", a, b);

        input.close();
    }
}
