package Application;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class exerc1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double arr[] = new double[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sum += 1;
            }
        }

        System.out.printf("Você digitou %d números pares.", sum);

        sc.close();
    }

}
