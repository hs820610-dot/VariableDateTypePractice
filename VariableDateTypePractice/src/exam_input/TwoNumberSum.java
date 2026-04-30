package exam_input;


// [요구사항] 사용자가 입력한 두개의 숫자를 더해서 출력하는 프로그램을 작성하시오.
import java.util.Scanner; //Scanner 클래스 포함

public class TwoNumberSum {
    // 메인 메소드에서부터 실행이 시작된다.
    public static void main(String[] args) {
        // 추후 설명
        // 클래스 참조변수 = 메모리 할당연산자 생성자(초기값);
        Scanner input = new Scanner(System.in);
        int x; // 첫 번쨰 숫자 저장
        int y; // 두 번쨰 숫자 저장
        int sum; // 합을 저장

        System.out.print("첫번쨰 숫자를 입력하시오: "); // 입력 안내 출력
        x = input.nextInt(); // 사용자로부터 첫 번쨰 숫자를 읽는다.

        System.out.print("두번쨰 숫자를 입력하시오: "); // 입력 안내 출력
        y = input.nextInt(); // 사용자로부터 두 번쨰 숫자를 읽는다.

        sum = x + y; // 두 개의 숫자를 더한다.

        System.out.println("두 수의 합 : " +sum); // 합을 출력한다.

        input.close();
    }
}
