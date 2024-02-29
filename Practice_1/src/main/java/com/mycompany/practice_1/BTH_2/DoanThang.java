/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice_1.BTH_2;
import com.mycompany.practice_1.BTH_2.Diem;
/**
 *
 * @author ADMIN
 */
public class DoanThang {
    private final Diem start;
    private final Diem end;
    
    
    public DoanThang(float startX,float startY,float endX,float endY){
        this.start = new Diem(startX,startY);
        this.end = new Diem(endX,endY);
    }
    
    public Diem startPoint(){
        return this.start;
    }
    
    public Diem endPoint(){
        return this.end;
    }
    
    public void setStart(float startX,float startY){
        this.start.setX(startX);
        this.start.setY(startY);
    }
    
    public void setEnd(float endX,float endY){
        this.end.setX(endX);
        this.end.setY(endY);
    }
    
    public void show(){
        System.out.println("[(" + this.start.getX() + "," + this.start.getY() + ")," + "(" + this.end.getX() + "," + this.end.getY() + ")]");
    }
    
    public String Instance(){
        return this.start.Interval(end);
    }
   
    public Diem Center(){
        float cStart = (this.start.getX() + this.end.getX()) / 2;
        float cEnd = (this.start.getY() + this.end.getY()) / 2;
        Diem center = new Diem(cStart,cEnd);
        return center;
    }
    
    public boolean isParallel(DoanThang dt2){
        float line1 = (this.start.getX() - this.end.getX()) / (this.start.getY() - this.end.getY());
        float line2 = (dt2.start.getX() - dt2.end.getX()) / (dt2.start.getY() - dt2.end.getY());
        return line1 == line2;
    }
    
    public static void main(String []args){
        DoanThang d1 = new DoanThang(1,2,3,4);
        DoanThang d2 = new DoanThang(3,4,7,8);
        d1.show();
        Diem trungDiem = d1.Center();
        System.out.println(trungDiem.getX() + " " + trungDiem.getY());
        System.out.println(d1.Instance());
        String ans = d1.isParallel(d2) == true ? "Yes" : "No";
        System.out.println(ans);
    }
}
