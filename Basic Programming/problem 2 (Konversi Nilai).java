import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nilai siswa");
        int inputan;
        String hasil = "";
        Scanner input = new Scanner(System.in);
        inputan = Integer.parseInt(input.nextLine());
        
        if (inputan >=80 && inputan <=100) {
            hasil="a";
        } else if (inputan >=65 && inputan <=79) {
            hasil= "b+";
        } else if (inputan >=50 && inputan <=64) {
            hasil= "b";
        } else if (inputan >=35 && inputan <=49) {
            hasil= "c";
        } else if (inputan >=0 && inputan <=34) {
            hasil= "d";
        } else {
            hasil= "invalid";}


        System.out.println(hasil);

    }
}