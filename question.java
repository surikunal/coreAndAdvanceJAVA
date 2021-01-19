/* 
intput a number N
then
add all the prime numbers in the arraylist till N 
*/
/* 

n = 5
2, 3

n = 10
2, 3, 5, 7 

*/

import java.util.ArrayList;
import java.util.Scanner;

class question {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        int k = 0;
        while (k <= 10) {
            arr.add(k);
            k++;
        }
        System.out.println(arr);

        // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

        // ===================================================

        for (int i = 2; i <= n; i++) {
            if (isPrime(i) == true) {
                arr.add(i);
                // 2, 3, 5
            }
        }
        System.out.println(arr);
    }

    public static boolean isPrime(int n) {  // 5
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}