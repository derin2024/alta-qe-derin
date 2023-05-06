import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("faktor bilangan");
        int inputan;
        Scanner input = new Scanner(System.in);
        inputan = Integer.parseInt(input.nextLine());

        for(int i=1; i<=inputan; i++) {
            for(int j=1; j<=inputan; j++) {
                if (i * j == inputan) {
                    System.out.println(i);
                    break;
                }

            }
        }
    }
}
