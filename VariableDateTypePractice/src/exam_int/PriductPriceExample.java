package exam_int;

import java.util.Scanner;

public class PriductPriceExample {
    public static void main(String[] args) {

        int price, orderCount ;
        int Shipping = 3000;

        Scanner input = new Scanner(System.in);

        System.out.print("상품 가격을 입력하세요:");
        price = input.nextInt();


        System.out.print("구매 수량을 입력하세요:");
        orderCount = input.nextInt();

        System.out.println("최종결제 금액:" + (price * orderCount + Shipping));

        input.close();
    }
}