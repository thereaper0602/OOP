/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice_1.BTH_2;

/**
 *
 * @author ADMIN
 */
public class Diem {
    private float x,y;
    public Diem(){
        this.x = 0;
        this.y = 0;
    }
    public Diem(float x,float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return this.x;
    }
    public void setX(float x){
        this.x = x;
    }
        public float getY(){
        return this.y;
    }
    public void setY(float y){
        this.y = y;
    }
    public void Show(){
        System.out.println(String.format("(%.1f,%.1f)", this.x,this.y));
    }
    public String Interval(Diem d2){
        float ans = (float)Math.sqrt(Math.pow(this.x - d2.x, 2) + Math.pow(this.y - d2.y, 2));
        return String.format("%.1f",ans);
    }
    
    public static void main(String[] args){
        Diem d1 = new Diem(2,5);
        Diem d2 = new Diem(1,10);
        d1.Show();
        d2.Show();
        System.out.println(d1.Interval(d2));
    }
}
