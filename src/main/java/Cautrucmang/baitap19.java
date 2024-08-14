package Cautrucmang;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class baitap19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a;
        int n;
        int x;

        do {
            System.out.println("Cho biet so phan tu mang():");
            n = sc.nextInt();
        } while (n <= 0 || n > 20);
        n=docsophantu(sc);
        a = new int[n];
        phatsinhmang(a);
       
        System.out.println("\nMang duoc phat sinh");
        xuatMang(a);
        SapXeptang(a);
        System.out.println("\nMang sau khi sap xep tang");
        xuatMang(a);
         System.out.println("cho biet gia tri x:");
         x=sc.nextInt();
         System.out.println("Cac phan tu la uoc so cua x:");
         lietkeuocso(a,x);
        

    }

    public static void SapXeptang(int[] a) {
        Arrays.sort(a);
    }

    public static void xuatMang(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void phatsinhmang(int[] a) {
        Random rd = new Random();
        for (int i = 1; i < a.length; i++) {
            a[i] = rd.nextInt(100);
        }
    }

    public static int docsophantu(Scanner sc) {
        int n = 0;
        do {
            System.out.println("Cho biet so phan tu mang()");
            n = sc.nextInt();
        } while (n <= 0 || n > 20);
        return n;
    }

    

    public static void lietkeuocso(int[] a, int x) {
        for (int item : a) {
            if (x % item == 0) {
                System.out.println(item + "");
            }
        }
    }
}
