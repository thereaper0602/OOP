/*
 * Click nbfs:/nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs:/nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice_1.BTH_2;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class PhanSo {
    private int tu;
    private int mau;
    
    public boolean checked(int b){
        if(b == 0){
            System.out.println("Mau phai khac 0");
            return false;
        }
        else return true;
    }
    
    public PhanSo(){
        this.tu = 0;
        this.mau = 1;
    }
    
    public PhanSo(int tu,int mau){
        if(this.checked(mau) == true){
            int ucln = PhanSo.UCLN(tu, mau);
            this.tu = tu/ucln;
            this.mau = mau/ucln;
        }
    }
    
    public static int UCLN(int a,int b){
        int max = 1;
        int minNum =Math.abs(Math.min(a, b));
        for(int i = 1;i <= minNum;i++){
            if((a % i) == 0 && (b % i) == 0){
                if(max < i) max = i;
            }
        }
        return max;
    }
    
    public int getTu(){
        return this.tu;
    }
    
    public int getMau(){
        return this.mau;
    }
    
    public void setTu(int value){
        this.tu = value;
    }
    
    public void setMau(int value){
        this.mau = value;
    }
    
    public void RutGon(){
        int ucln = PhanSo.UCLN(this.tu, this.mau);
        if(ucln != 0){
            this.setTu(this.tu/=ucln);
            this.setMau(this.mau/=ucln);
        }
    }
    
    public PhanSo Cong(PhanSo f2){
        int tu = (this.tu * f2.getMau()) + (this.mau * f2.getTu());
        int mau = this.mau * f2.getMau();
        PhanSo res = new PhanSo(tu,mau);
        res.RutGon();
        System.out.println(String.format("Phep cong hai phan so %d/%d + %d/%d = %d/%d", this.tu,this.mau,f2.getTu(),f2.getMau(),res.getTu(),res.getMau()));
        return res;
    }
    
    public PhanSo Tru(PhanSo f2){
        int tu = (this.tu * f2.getMau()) - (this.mau * f2.getTu());
        int mau = this.mau * f2.getMau();
        PhanSo res = new PhanSo(tu,mau);
        res.RutGon();
        System.out.println(String.format("Phep tru hai phan so %d/%d - %d/%d = %d/%d", this.tu,this.mau,f2.getTu(),f2.getMau(),res.getTu(),res.getMau()));
        return res;
    }
    
    public PhanSo Nhan(PhanSo f2){
        int tu = this.tu * f2.getTu();
        int mau = this.mau * f2.getMau();
        PhanSo res = new PhanSo(tu,mau);
        res.RutGon();
        System.out.println(String.format("Phep nhan hai phan so %d/%d * %d/%d = %d/%d", this.tu,this.mau,f2.getTu(),f2.getMau(),res.getTu(),res.getMau()));
        return res;
    }
    
    public PhanSo Chia(PhanSo f2){
        int tu = this.tu * f2.getMau();
        int mau = this.mau * f2.getTu();
        PhanSo res = new PhanSo(tu,mau);
        res.RutGon();
        System.out.println(String.format("Phep chia hai phan so (%d/%d) / (%d/%d) = %d/%d", this.tu,this.mau,f2.getTu(),f2.getMau(),res.getTu(),res.getMau()));
        return res;
    }
    
    public static PhanSo maxFraction(PhanSo f1,PhanSo f2){
        return ((f1.getTu() / f1.getMau()) > (f2.getTu() / f2.getMau())) ? f1 : f2;
    }
    
    public static void main(String[] args){
        PhanSo f1 = new PhanSo(1,2);
        PhanSo f2 = new PhanSo(4,8);
        System.out.println("Phan so 1 : " + f1.getTu() + "/" + f1.getMau());
        System.out.println("Phan so 2 : " + f2.getTu() + "/" + f2.getMau());
        PhanSo cong = f1.Cong(f2);
        PhanSo tru = f1.Tru(f2);
        PhanSo nhan = f1.Nhan(f2);
        PhanSo chia = f1.Chia(f2);
        PhanSo fractionArr[] = new PhanSo[100];
        Random random = new Random();
        for(int i = 0;i<5;i++){
            int tu = random.nextInt(100);
            int mau= random.nextInt(1,100);
            PhanSo ele = new PhanSo(tu,mau);
            fractionArr[i] = ele;
        }
        
        // Tinh Tong
        PhanSo sum = new PhanSo();
        for(int i = 0;i<5;i++){
            sum = sum.Cong(fractionArr[i]);
        }
        System.out.println(sum.getTu() + "/" + sum.getMau());
        
        // Tim phan so lon nhat
        PhanSo max = new PhanSo();
        for(int i = 0;i<5;i++){
            max = PhanSo.maxFraction(max, fractionArr[i]);
        }
        System.out.println(max.getTu() + "/" + max.getMau());
    }
}
