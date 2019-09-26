import java.util.Scanner;

public class Prime_Number_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        System.out.println("20 number Prime: \n");
        int count = 0;

        for (int i = 2; count < 20; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(" " + i);
                count++;
            }
        }
    }

    public static boolean isPrimeNumber(int number) {
        int i = 2;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
