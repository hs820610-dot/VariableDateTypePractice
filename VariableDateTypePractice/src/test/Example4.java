package test;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("100부터 999까지의 숫자를 입력하십시오:");
        int number = sc.nextInt();

        //숫자가 3자리수인지 확인하는 절차
        if (number < 100 || number > 999) {
            System.out.println("3자리수만 입력하세요:");
        }else{
            // 각 자리수 추출 및 합계 계산
            int hundreds = number / 100;      // 백의 자리
            int tens = (number / 10)% 10;     // 십의 자리
            int one = number % 10;            // 일의 자리

            int sum = hundreds + tens + one;

            System.out.println("각 자릿수의 합" + sum);
        }
        sc.close();
    }
}
