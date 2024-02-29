/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice_1.BTH_1;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class BT_4 {
    public boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }
        else{
            for(int i = 2;i<=Math.sqrt(n);i++){
                if(n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    
    public void createArr(int[] a,int n){
        for(int i = 0;i < n;i++){
            Random rd = new Random();
            a[i] = rd.nextInt(-100,100);
        }
    }
    
    public void out(int []a){
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public int PrimeInt(int[] a,int n){
        int sum = 0;
        for(int i : a){
            if(isPrime(i) == true){
                System.out.print(i + " ");
                sum+=i;
            }
        }
        System.out.println();
        return sum;
    }
    /**
     * @param something
     */
    public void find(int[] a,int n){
        int min = 999999;
        int max = -999999;
        for(int i : a){
            if(min > i){
                min = i;
            }
            if(max < i){
                max = i;
            }
        }
        System.out.println(String.format("The largest positive num is %d",max));
        System.out.println(String.format("The smallest negative num is %d",min));
    } 
    
    public  static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        BT_4 bt = new BT_4();
        bt.createArr(a, n);
        bt.out(a);
        System.out.println(bt.PrimeInt(a, n));
        bt.find(a, n);
    }
}



