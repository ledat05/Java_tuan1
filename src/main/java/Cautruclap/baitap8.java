/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cautruclap;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class baitap8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int s=0;
        System.out.println("==PHUONG TRINH N");
        
        System.out.println("Nhập n:");
        n=sc.nextInt();
        //b2 tinh
        for (int i = 1; i <= n; i++) {
            s=s+i;
        }
            //xuat
            System.out.println("Tong day so"+ s);
        }
    }
