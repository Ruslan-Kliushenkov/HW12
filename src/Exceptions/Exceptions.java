package Exceptions;

public class Exceptions {
    public static void main(String[] args) {

//Здесь можно обойтись простым if - (else)
        Object obj = Integer.valueOf(1);
        String s = "s";
        if(s.getClass() == obj.getClass()) {
            s = (String) obj;
        }else {
            System.out.println("...");
        }
//Здесь так же, либо через Optional
        String str = null;
        if (str != null) {
            str.equals(str);
        }else {
            System.out.println("...");
        }
//...
        try {
            int i = Integer.parseInt("s");
        }catch (NumberFormatException n){
            System.out.println(n.getMessage());
        }

        try {
            int[] array = new int[1];
            int num = array[1];
        }catch(IndexOutOfBoundsException i){
            System.out.println(i.getMessage());
        }
    }
}
