/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice_1.BTH_1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT_1 {
    public static void main(String args[]){
        Random random = new Random();
        Scanner obj = new Scanner(System.in);
        int guess_num,random_num = random.nextInt(1,101);
        do{
            System.out.print("Insert your number : ");
            guess_num = obj.nextInt();
            if(guess_num < random_num) {
                System.out.println("The result is bigger than your number");
            }
            else if(guess_num > random_num){
                System.out.print("The result is smaller than your number");
            }
            else{
                break;
            }
        }while(guess_num != random_num);
        System.out.print("Correct !");
    }
}
