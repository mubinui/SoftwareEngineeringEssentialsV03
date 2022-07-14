package TherapTest;

import java.util.*;

public class Problem01 {
    public static void main(String[] args) {
        System.out.println(Fun(2));



    }
    static int Fun (int n){
        if(n==4){
            return 2;
        }
        else {
            return 2*Fun(n+1);
        }

    }
}
