package InnerClass;

public class OuterClass {
    //Inner Class
    private class InnerClass{

        public void print(){
            System.out.println("This is is a Inner Class");
        }

    }
    //Accessing Inner class
    public void display_Inner(){
        InnerClass inn = new InnerClass();
        inn.print();
    }

    public static class Inner2{
        public void print(){
            System.out.println("I am public static Inner Class ");
        }
    }

    public class inner3{
        public void print(){
            System.out.println("Inner class non-static");
        }
    }
}
