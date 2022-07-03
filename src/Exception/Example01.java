package Exception;

public class Example01 {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt("12");
            int y = Integer.parseInt("abc");

            System.out.println(x/y);


        }
        catch (Exception e ){
            e.printStackTrace();
        }

    }
}
