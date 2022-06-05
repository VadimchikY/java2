package lesson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int k = x.nextInt();
        long[] arr= new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = x.nextLong();
        }

    }
}