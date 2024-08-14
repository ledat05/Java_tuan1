/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cautrucrenhanh;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class baitap01 {
    public static void main(String[] args) {
        double a,b;
        String kq;
        Scanner sc=new Scanner(System.in);
        System.out.println("==GIA PHUONG TRINH BAC 1");
        
        System.out.println("Nhập hệ số a:");
        a= sc.nextDouble();
        System.out.println("Nhập hệ số b:");
        b=sc.nextDouble();
        
        //b2:giaipt
        if(a==0){
            if(b==0){
            kq="Phương trình vn";
        }else {
            kq="phương trình vô số nghiệm";
        }
        }else{
            kq="Phương trình có nghiệm x="+(-b/a);
        }
        System.out.println(kq);
    }
}
