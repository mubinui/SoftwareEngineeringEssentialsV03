package Interfaces;

public class InterfaceTester {


    public static void main(String[] args) {
        A b = new A() {
            @Override
            public void C() {
                A.super.C();
            }
        };
        b.C();
        A.D();



    }
}
