import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("masukkan kata: ");
        String kata = input.nextLine();
        String kebalikan = "";

        polindrome(kata, kebalikan);

    }

    public static void polindrome (String kata, String kebalikan){
        int length = kata.length();
        for (int i = length-1; i>=0; i--) {
            kebalikan = kebalikan + kata.charAt(i);
        }
        if (kata.equals(kebalikan)) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
