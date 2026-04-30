package exam_operation;

import java.util.Scanner;

public class ComparisonOperator2 {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        Scanner input = new Scanner(System.in);

        System.out.println("x == y" + (x == y)); // 비교연사자. 결과값으로 boolean 자료형의 true/false
        System.out.println("x != y" + (x != y));

        System.out.println("x > y" + (x > y));
        System.out.println("x < y" + (x < y));
        System.out.println("x <= y" + (x <= y));

        char char1 = 'a'; //65. a : 97
        char char2 = 'b'; //66
        boolean result = (char1 < char2); // 결과는?
        System.out.println("result = " + result);

        String name1 = "홍길동";
        String name2 = input.nextLine();

        //if(name1 == name2) {
        if(name1.equals(name2)) {
            System.out.println("이름이 동일합니다.");
        } else {
            System.out.println("이름이 일치하지 않습니다.");
        }
        input.close();
    }
}
