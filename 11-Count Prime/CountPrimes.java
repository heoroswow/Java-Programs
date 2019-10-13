/**
 * Created by DS-1 on 2/15/2016.
 */
import java.util.Scanner;
public class CountPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        boolean[] isPrime = new boolean[N];
        isPrime[0] = false;

        for (int c = 1; c < N; c++){
            isPrime[c] = true;
        }

        for (int i = 2; i <= N ; i++) {
            if (isPrime[i - 1]) {

                for (int j = 2*i; j <= N; j += i) {
                    isPrime[j-1] = false;
                }
            }
        }
        int primes = 0;
        for (int i = 1; i < N; i++){
            if (isPrime[i] == true){
                primes += 1;
            }
        }
        System.out.print(primes);
        //int primes = 0;
        //for (int i = 1; i <= N; i++) {
        //    if (isPrime[i - 1]) primes++;
        //}
        //System.out.println(primes);
    }
}

