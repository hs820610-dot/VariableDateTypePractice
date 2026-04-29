package exem_variable;

/* 정수형 변수 2개를 선언하여 각각 변수에 값을 초기화하여 두수를 교환한 값을 출력하는 프로그램을 작성해 보자.*/
public class VariableInitExample2 {
    public static void main(String[] args) {
        // 주석문 : 소스에 설명 명시.(한라인 주석)
        /* 주석문 :
         * 소스에 설명 명시.(여러줄 주석) */
        // 자료형 변수명; <=변수 선언

        int number1, number2, temp;

        number1 = 3;
        number2 = 5;

        System.out.println("교환 전 number1와 number2의 값 ");
        System.out.println("number1=" + number1 + "number2 =" + number2);

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("교환 후 number1와 number2의 값 ");
        //System.out.println("number1 = " + number1 + " number2= " + number2);
        System.out.printf("number1 = %d number2 = %d ", number1, number2);
    }
}
