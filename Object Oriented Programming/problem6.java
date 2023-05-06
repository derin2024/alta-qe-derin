import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka");
        int angka = input.nextInt();
xyz(angka);
    }
    public static void xyz(int angka) {
        int posisi = 1;

        for (int i=1 ; i<=angka; i++) {
            for (int j=1 ; j<=angka; j++){
                if (posisi % 3 == 0) {
                    System.out.print("x ");
                } else if (posisi % 2 == 0) {
                    System.out.print("z ");
                } else {
                    System.out.print("y ");
                } posisi++;
            }
            System.out.println();
        }

    }
}