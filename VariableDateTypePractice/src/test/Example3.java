package test;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        int egg;
        int box;


        Scanner input = new Scanner(System.in);

        System.out.print("계란의 수");
        egg = input.nextInt();


        box = (egg %12 == 0) ? egg/12 : egg/12 + 1;

        System.out.println("박스수"+ box);
        System.out.println("달걀 " + egg + "개를 12개씩 담을 수 있는 상자의 수는 " + box + "개입니다.");
        input.close();

    }
}