package TherapTest;
import java.util.*;
public class Problem04 {
    public static void main(String[] args) {
        int x = 4521;
        System.out.println(printProduct(x,1));


    }
    public static int printProduct(int x,int y){
        if (x%10==0){
            return y;
        }
        y*= x%10;
        x = x/10;
        return printProduct(x,y);
    }
}
