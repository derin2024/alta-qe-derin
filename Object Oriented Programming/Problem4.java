
public class Main {
    private static boolean primeNumber(int number){
        for(int i=2; i<number; i++) {
                if (number%i == 0) {
                    return false ;

                }

            }
    return true;
    }
    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }
    }
