
import java.util.*;
public class countPrimesInRange{
    public static int countPrimesInRange(int L, int R) {
        List<Integer> primes = findPrimes(R);
        int count = 0;
        for (int prime : primes) {
            if (prime >= L) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int L = 10, R = 30;
        System.out.println("Count of Primes between " + L + " and " + R + ": " + countPrimesInRange(L, R));

    }
}