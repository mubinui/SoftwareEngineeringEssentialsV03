package Exception;

public class MyException extends Exception{
    MyException(){
        super("Mubin's Exception");
    }
    MyException(String message ){
        super(message);
    }
}
