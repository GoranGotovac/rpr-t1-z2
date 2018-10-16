package rpr.etf.unsa.ba;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int n) {
        int suma = 0;
        int a = 0;
        while(n != 0) {
            a = n - ((n/10)*10);
            suma += a;
            n /= 10;
        }
        return suma;
    }
        public static void main(String[] args) {
        Scanner unesi = new Scanner(System.in);
        int a = unesi.nextInt();
        int i;
        for(i = 1; i <= a; i++) {
            if (i %  sumaCifara(i) == 0) {
                System.out.println(i);
            }
        }
    }
}
