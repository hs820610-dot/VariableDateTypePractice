package test;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        int x, y;

        Scanner input = new Scanner(System.in);

        System.out.print("사탕의 수:");
        x = input.nextInt();

        System.out.print("학생의 수:");
        y = input.nextInt();

        System.out.println("사탕을 받은 학생의 수:" + x / y);
        System.out.println("남는 사탕의 수:" + x % y);

        input.close();
    }
}