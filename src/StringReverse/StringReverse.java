package StringReverse;

public class StringReverse {
    public static void main(String[] args) {
        String s = "Mubin";
        reverse_sub(s);



    }
    public static void reverse(String s ){
        if(s.length()<=1){
            System.out.println(s);
        }
        else {
            char a [] = s.toCharArray();
            String s1 = "";
            for (int i = 0; i <s.length()-1 ; i++) {
                s1+= String.valueOf(a[i]);

            }
            System.out.print(a[s.length()-1]);
            reverse(s1);
        }


    }
    public static void reverse_sub(String s ){
        if(s.length()<=1){
            System.out.println(s);
        }
        else{
            System.out.print(s.charAt(s.length()-1));
            reverse_sub(s.substring(0,s.length()-1));
        }
    }


}
