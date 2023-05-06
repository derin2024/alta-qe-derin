import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bagaimana cara menghitung luas segitiga?");
        System.out.println("berapa alas? (cm)");
        float alas = input.nextFloat();
        System.out.println("berapa tinggi? (cm)");
        float tinggi = input.nextFloat();
        float result = (float) (alas * tinggi * 0.5);
        System.out.println("hasilnya: " + result + " cm^2");
    }

}