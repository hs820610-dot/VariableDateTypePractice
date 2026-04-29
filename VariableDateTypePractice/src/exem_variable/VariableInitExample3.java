package exem_variable;

public class VariableInitExample3 {
        static void main(String[] args) {

           int x;
           int y;
           int z;

           x = 1;
           y = 2;
           z = 3;

           System.out.println("교환 전 x,y,z에 값");
           System.out.printf("x=%d y=%d z=%d\n", x, y, z );

           x = y;
           y = z;
           z = x;


           System.out.println("교환 후 x,y,z에 값");
           System.out.printf("x=%d y=%d z=%d", +x, +y, +z);
        }
}
