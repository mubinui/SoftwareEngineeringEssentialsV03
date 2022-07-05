package BitwiseOperation;

public class BitwiseOperations {
    public static void main(String[] args) {
        int a = 11;
        int b = 9;
        int c ;
        c = a & b;
        System.out.println("Bitwise and ->"+c);
        int x = 32;
        int y = 12;
        int z = a |b;
        System.out.println("Bitwise or ->"+z);
        int a1 = 10;
        System.out.println(a1>>1); // right shift division
        System.out.println(a1<<1); // left shift multiplication

    }
}
