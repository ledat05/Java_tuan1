/*

 */
package Cautrucmang;

import java.util.Scanner;

public class baitap16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a;
        int n;
        do {
            System.out.println("Cho biet so phan tu mang():");
            n = sc.nextInt();
        } while (n <= 0 || n >= 20);
       

        a = new int[n];
        nhapMang(a, sc);
        //xautmang
        xuatMang(a);
        //Tinhtong
        int Tong = tinhTong(a);
        System.out.println("tong gia gia tri cua mang:" + Tong);
        //dem so le
        int duong_le = demDuongLe(a);
        System.out.println("\n so duong le:" + duong_le);
        // tim max
        int timmax=max(a);
        System.out.println("phan tu lon nhat trong mang:"+timmax);
    }

    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]:");
            a[i] = sc.nextInt();
        }
    }
//dinh nghia phuong thuc xuat mang

    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
    //Tinh tong

    public static int tinhTong(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum = sum + x;
        }
        return sum;
    }

    public static int demDuongLe(int[] a) {
        int dem_duong_le = 0;
        for (int x : a) {
            if (x > 0 && x % 2 != 0) {
                dem_duong_le++;
            }
        }
        return dem_duong_le;
    }

    public static int max(int[] a) {
        int max = a[0];
        
     
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        return max;
    }
}
