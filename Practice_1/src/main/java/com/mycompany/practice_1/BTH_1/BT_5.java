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
public class BT_5 {
    public void two_DArray(int a[][],int m,int n){
        for(int i = 0;i<m;i++){
            for(int j = 0;j < n;j++){
                Random rd = new Random();
                a[i][j] = rd.nextInt(100);
            }
        }
    }
    
    public void out(int a[][],int m,int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j < n;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void sumRow(int a[][],int m,int n){
        for(int i = 0;i<m;i++){
            int sum = 0;
            for(int j = 0;j<n;j++){
                sum += a[i][j];
            }
            System.out.println(String.format("Row %d = %d",i+1,sum));
        }
    }
    
    public void sumCol(int a[][],int m,int n){
        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = 0;j<m;j++){
                sum += a[j][i];
            }
            System.out.println(String.format("Collumn %d = %d",i+1,sum));
        }
    }
    
    public void max_Row(int a[][],int m,int n){
        int max = -999999;
        int idx = -1;
        for(int i = 0;i<m;i++){
            int sum = 0;
            for(int j = 0;j<n;j++){
                sum+=a[i][j];
            }
            if(max < sum) {
                max = sum;
                idx = i;
            }
        }
        System.out.println(String.format("Row that has a largest sum is %d", idx));
    }
    
    public void min_Col(int a[][],int m,int n){
        int min = 999999;
        int idx = -1;
        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = 0;j<m;j++){
                sum+=a[j][i];
            }
            if(min > sum) {
                min = sum;
                idx = i;
            }
        }
        System.out.println(String.format("Col that has a smallest sum is %d", idx));
    }
    
    public void min_ele_row(int a[][],int n,int d){
        int min = a[d][0];
        int sum = 0;
        for(int i = 0;i < n;i++){
            min = Math.min(min, a[d][i]);
            sum += a[d][i];
        }
        System.out.println(String.format("The smallest value in row %d is %d \nThe sum of row %d is %d",d,min,d,sum));
    }
    
    public void max_ele_col(int a[][],int m,int d){
        int max = a[0][d];
        int sum = 0;
        for(int i = 0;i < m;i++){
            max = Math.max(max, a[i][d]);
            sum += a[i][d];
        }
        System.out.println(String.format("The largest value in col %d is %d \nThe sum of col %d is %d",d,max,d,sum));
    }
    
    public static void main(String []args){
        int m,n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int a[][] = new int[m][n];
        BT_5 bt = new BT_5();
        bt.two_DArray(a, m, n);
        bt.out(a, m, n);
        bt.sumRow(a, m, n);
        bt.sumCol(a, m, n);
        bt.max_Row(a, m, n);
        bt.min_Col(a, m, n);
        bt.min_ele_row(a, n, 1);
        bt.max_ele_col(a, m, 0);
    }
}
