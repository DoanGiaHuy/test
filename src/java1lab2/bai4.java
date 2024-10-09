/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1lab2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class bai4 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        int chon; //để nhập sự lựa chọn của khách hàng 
        while (true) {            
            System.out.println("------------------");
            System.out.println("1. Mời bạn chọn bài 1       ");
            System.out.println("2.Mời bạn chọn bài 2      ");
            System.out.println("3.Mời bạn chọn bài 3      ");
            
            System.out.println("11.Thoát  ");
            System.out.println("------------------");
            System.out.print("Mời bạn chọn 1 mục");
            // Nhận sự lựa chọn từ người dùng
            chon = Integer.parseInt(sc.nextLine());
            //Phục vụ món theo yêu cầu 
            switch(chon){
                case 1: 
                    System.out.println("1. Mời bạn chọn bài 1");
                    bai1(sc);
                    break; 
            
          
                case 2: 
                    System.out.println("2.Mời bạn chọn bài 2 ");
                    bai2(sc);
                    break; // Thoát khỏi swing..case
                case 3: 
                    System.out.println("3.Mời bạn chọn bài 3   ");
                    bai3(sc);
                    break; // Thoát khỏi swing..case
            
            
                case 11: 
                    System.out.println("11.Thoát");
                    // Lát phục vụ sau 
                    break; // Thoát khỏi swing..case
            
          
                default:
                    System.out.println("Mục bạn chọn không có, vui lòng nhập lại");
                   
                    break; // Thoát khỏi swing..case
            }
            
        }
    }
    
    public static void bai1(Scanner scanner) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập hệ số b: ");
        double b = Integer.parseInt(sc.nextLine());
        
         double x = -b / a;

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
           
            System.out.println("Nghiệm của phương trình là x = " + x);
        }
    }
        public static void bai2(Scanner scanner){
             Scanner sc = new Scanner(System.in);

        
        System.out.print("Nhập hệ số a: ");
        double a = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập hệ số b: ");
        double b = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập hệ số c: ");
        double c = Integer.parseInt(sc.nextLine());

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiệm của phương trình bậc nhất là x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
        }
        public static void bai3(Scanner scanner){
            Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = Integer.parseInt(sc.nextLine());

        int tien;
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }

        System.out.println("Số tiền điện phải trả là: " + tien + " đồng");

        }
        }
   
    

