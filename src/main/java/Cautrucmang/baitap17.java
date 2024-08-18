/*

 */
package Cautrucmang;

import java.util.Scanner;

public class baitap17 {

    public static void main(String[] args) {

        double[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so phan tu (1 <= n >= 20): ");
            n = sc.nextInt();
        } while (n <= 0 || n > 20);
        a = new double[n];
        nhapMang(a, sc);
        //xautmang
        xuatMang(a);
        //TinhTrunginh
        double TB=TinhTrungBinh(a);
        System.out.println("\nDiem trung binh cua mang:"+TB);
        //TimMin
        double min=TimMin(a);
        System.out.println("Min cua mang:"+min);
    }

   public static double TimMin(double[] a) {
        double min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
    public static double TinhTrungBinh(double[] a) {
        double sum = 0;
        for (double x : a) {
            sum += x;
        }
        return sum / a.length;
    }
//dinh nghia phuong thuc xuat mang

    public static void nhapMang(double[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]: ");
            a[i] = sc.nextDouble();
        }
    }

    public static void xuatMang(double[] a) {
        for (double x : a) {
            System.out.print(x + " ");
        }
    }
    //Tinh tong

}
