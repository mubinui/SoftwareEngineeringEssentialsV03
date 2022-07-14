package TherapTest;
import java.util.*;
public class Problem03 {
    public static void main(String[] args) {
        int temp = 0;

        double sum = 0, j =1.0,i = 2.0;
        while (i/j>0.001){
            j = j+j;
            sum = sum +(i/j);
            System.out.println("rocks");
            temp++;
        }
        System.out.println(temp);

    }
    public int  oneElem(int [] a){
        int out = -1;
        for (int i = 0; i <a.length-1 ; i++) {
            if(a[i]>a[i+1]){
                out=i;
                break;
            }

        }
        return out;

    }
}
