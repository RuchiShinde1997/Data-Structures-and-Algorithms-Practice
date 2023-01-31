package Bitwise;

public class BitwiseOperators {

    public void calculateBitwise(int a, int b){
        int and = a & b;
        int or = a | b;
        int negateA = ~a;
        int negateB = ~b;
        int xor = a^b;

        System.out.printf("%d&%d = %d%n", a, b, and);
        System.out.printf("%d|%d = %d%n",a, b, or);
        System.out.printf("%d^%d = %d%n",a, b, xor);
        System.out.printf("~ %d = %d%n",a, negateA);
        System.out.printf("~ %d = %d%n",b, negateB);

    }
    public static void main(String[] args){
        BitwiseOperators obj = new BitwiseOperators();
        obj.calculateBitwise(15, 37);
        obj.calculateBitwise(-15, 37);
        obj.calculateBitwise(15, -37);
        obj.calculateBitwise(-15, -37);
    }
}
