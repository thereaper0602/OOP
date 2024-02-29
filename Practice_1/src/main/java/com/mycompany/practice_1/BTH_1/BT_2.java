/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice_1.BTH_1;
import java.util.Random;
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author ADMIN
 */
public class BT_2 {
    public static void main(String args[]){
        Random random = new Random();
        Scanner obj = new Scanner(System.in);
        int power;
        while(true){
            System.out.print("Insert the power for the equations or press [0] to cancel the program : ");
            power = obj.nextInt();
            if(power == 0) break;
            while(power < 0){
                System.out.print("The power must be a positive number : ");
                power = obj.nextInt();
            }
            int c[] = new int[power+1];
            for(int i = 0;i <= power;i++){
                System.out.print("Constant " + (i + 1) + " : ");
                c[i] = obj.nextInt();
                System.out.println();
            }
            int cnt = power;
            System.out.println("Here is your equation : ");
            System.out.print(c[0] + "x^" + cnt + " ");  
            for(int i = 1;i  < power;i++){
                  if(c[i] > 0){
                       System.out.print(" + " + c[i] + "x^" + cnt);
                       cnt--;
                  }
                  else{
                       System.out.print(" - " + c[i] + "x^" + cnt);
                       cnt--;
                  }
            }
            if(c[power] > 0) System.out.print(" + " + c[power]);
            else System.out.print(" - " + c[power - 1]);
            System.out.println();
            System.out.print("Insert a number x to solve the equation : ");
            int x = obj.nextInt();
            int ans = 0;
            cnt = power;
            for(int i = 0;i<=power;i++){
                ans += c[i] * Math.pow(x,cnt);
                cnt--;
            }
            System.out.println("Your result is : " + ans);
        }
        
    }
}
