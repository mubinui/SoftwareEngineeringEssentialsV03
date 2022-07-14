package TherapTest;

import java.util.Collection;
import java.util.*;

public class Problem02 {
    public static void main(String[] args) {
        System.out.println();

    }
    public void printNumber(){
        for (int i = 1; i <501 ; i++) {
            if (i%7==0 && i%13==0) {
                System.out.println("Dhaka,Bangladesh");

            }


            else if(i%7==0){
                System.out.println("Dhaka");
            } else if (i%13==0) {
                System.out.println("Bangladesh");

            } else if (i%7==0 && i%13==0) {
                System.out.println("Dhaka,Bangladesh");

            }
            else{
                System.out.println(i);

            }

        }
    }
}
