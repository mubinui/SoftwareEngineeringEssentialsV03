package InnerClass;

public class Tester {
    public static void main(String[] args) {
        OuterClass ot = new OuterClass();
        ot.display_Inner();
        //************ STATIC ******************
        OuterClass ot1 = new OuterClass();
        OuterClass.Inner2 ot2 = new OuterClass.Inner2();
        ot2.print();
        //************* Non-Static*****************
        OuterClass ot3 = new OuterClass();
        OuterClass.inner3 inn3 = ot3.new inner3();
        inn3.print();


    }
}
