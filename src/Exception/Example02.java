package Exception;
import Exception.Example03;


public class Example02 {
    public static void main(String[] args) throws MyException {
        try {
            int x = Integer.parseInt("12");
            int y = Integer.parseInt("12");

            System.out.println(x/y);
            Example03.main(args,121);
            if (x==12){
                throw  new MyException("Yee My exceptioin hai bhai");
            }





        }
        catch (ArithmeticException e ){
            e.printStackTrace();
            System.out.println("We are continuing our work from here again ");
            System.out.println("****************************************");
            System.out.println("***************MUBIN WORKING************");
            System.out.println("****************************************");
        }

    }
}
