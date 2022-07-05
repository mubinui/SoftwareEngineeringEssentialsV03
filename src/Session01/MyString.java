package Session01;

public class MyString {
    public static void main(String[] args) {
        char [] a = new char[5];
        a[0] = 'J';
        a[1] = 'a';
        a[2] = 'v';
        a[3] = 'a';

        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);

        }
        System.out.println();
        //**********************//
        char [] b = {'J','a','v','a'};
        for (int i = 0; i <b.length ; i++) {
            System.out.print(b[i]);

        }
        System.out.println();
        String st = "Aoumik";
        String s = new String("Aoumik");
        String s1 = "Soumik";
        int i = 0;

        System.out.println(st);
        System.out.println(s);
        String str = "JAVA";
        char [] chr = str.toCharArray();



    }
}
