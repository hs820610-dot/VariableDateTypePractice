package test;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lang,engl,math,total,count;

        System.out.print("국어 점수:");
        lang = input.nextInt();

        System.out.print("영어 점수:");
        engl = input.nextInt();

        System.out.print("수학 점수:");
        math = input.nextInt();

        total = (lang + engl + math);
        count = 3;
        double average =(double) total / count;
        System.out.printf("총합:%d 평균:%.1f", total,average);

        input.close();
    }
}
