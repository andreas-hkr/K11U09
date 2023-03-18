import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Hitta och skriv ut de första 50 primtalen.

        int[] primes = new int[50];
        int count = 0;
        int number = 1;

        while (count < primes.length) {
            number++;
            boolean isPrime = true;
            for (int i=0; i < count; i++) {
                if (number % primes[i] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes[count] = number;
                count++;
            }
        }

        System.out.println(Arrays.toString(primes));
    }
}