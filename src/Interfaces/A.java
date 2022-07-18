package Interfaces;

public interface A {
    default void C(){
        System.out.println("C is called ");
        B();

    }
    private void B(){
        System.out.println("What the hell is happening ?");
    }

    static void D() {
        System.out.println("Method D is Called ");
    }
    private static void E(){
        System.out.println("Private Static Method Called ");


    }

    public static void main(String[] args) {
        E();
        D();
        A a = new A() {
            @Override
            public void C() {
                A.super.C();
            }
        };
        a.B();
        a.C();

    }

}
