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
public class baitap2 {
    public static void main(String[] args) {
        double anh,toan,van,dtb=0;
        String kq;
        Scanner sc=new Scanner(System.in);
        System.out.println("Tinh diem trung binh cac mon");
        //Nhap diem
        System.out.println("Nhập điểm Toan:");
        toan=sc.nextDouble();
         System.out.println("Nhập điểm Van:");
        van=sc.nextDouble();
         System.out.println("Nhập điểm Anh:");
        anh=sc.nextDouble();
        
        dtb=(toan+van+anh)/3;
        
        //xeploai
        if(dtb<4){
            kq="yeu";
        }else if(dtb<6.5){
            kq="trung binh";
        }else if (dtb<8){
            kq="khá";
        }else{
            kq="giỏi";
        }
        System.out.println("Điểm"+dtb+kq);
    }
    
}
