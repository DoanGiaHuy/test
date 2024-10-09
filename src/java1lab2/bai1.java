/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1lab2;

import com.sun.source.tree.BreakTree;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class bai1 {
     public static void main(String[] args) {
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
}
