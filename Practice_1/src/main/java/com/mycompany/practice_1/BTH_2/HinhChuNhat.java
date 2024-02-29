/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice_1.BTH_2;
import com.mycompany.practice_1.BTH_2.Diem;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class HinhChuNhat {
    private final Diem UpperLeft;
    private final Diem BottomRight;
    
    public HinhChuNhat(Diem d1,Diem d2){
        this.UpperLeft = d1;
        this.BottomRight = d2; 
    }
    
    public boolean validate(){
        if(this.UpperLeft.getX() >= this.BottomRight.getX() || this.UpperLeft.getY() <= this.BottomRight.getY()){
            return false;
        }
        return true;
    }
    
    public float[] attributes(){
        // 0 : height \ 1 : width
        float[] att = new float[2];
        att[0] = Math.abs(this.BottomRight.getX() - this.UpperLeft.getX());
        att[1] = Math.abs(this.UpperLeft.getY() - this.BottomRight.getY());
        return att;
    }
    
    public float Perimeter(){
        return 2 * (this.attributes()[0] + this.attributes()[1]);
    }
    
    public float Area(){
        return this.attributes()[0] * this.attributes()[1];
    }
    
    public static void main(String[] args){
        Diem d1 = new Diem(0,3);
        Diem d2 = new Diem(2,0);
        HinhChuNhat hcn = new HinhChuNhat(d1,d2);
        if(!hcn.validate()){
            throw new IllegalArgumentException("Error");
        }
        else{
            System.out.println(String.format("Perimeter = %.2f",hcn.Perimeter()));
            System.out.println(String.format("Area = %.2f",hcn.Area()));
        }
    }
}
