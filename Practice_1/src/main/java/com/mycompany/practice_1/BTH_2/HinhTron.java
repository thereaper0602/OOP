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
public class HinhTron {
    private Diem tam;
    private int R;
    public HinhTron(Diem tam,int R){
        this.tam = tam;
        this.R = R;
    }
    
    public double Perimeter(){
        return Math.PI * 2 * this.R;
    }
    
    public double Area(){
        return Math.PI * Math.pow(R, 2);
    }
    
    public void PointToCircle(Diem d2){
       float ans = (float)Math.sqrt(Math.pow(this.tam.getX() - d2.getX(), 2) + Math.pow(this.tam.getY() - d2.getY(), 2));
       if(this.R > ans){
           System.out.println(String.format("The point (%f,%f) is outside the circle", d2.getX(),d2.getY()));
       }
       else if(this.R < ans){
           System.out.println(String.format("The point (%f,%f) is inside the circle", d2.getX(),d2.getY()));
       }
       else{
           System.out.println(String.format("The point (%f,%f) is on the line of the circle", d2.getX(),d2.getY()));
       }
    }
    
    public void LineToCircle(HinhTron c2){
        float ans = (float)Math.sqrt(Math.pow(this.tam.getX() - c2.tam.getX(), 2) + Math.pow(this.tam.getY() - c2.tam.getY(), 2));
        if(ans > this.R + c2.R) {
            System.out.println("C1 and C2 do not intersect and are external to each other.");
        }
        else if(ans < Math.abs(this.R - c2.R)){
            System.out.println("(C1) and (C2) do not intersect and are nested within each other.");
        }
        else if(ans == this.R + c2.R){
            System.out.println("(C1) and (C2) are tangent externally to each other.");
        }
        else if(ans == Math.abs(this.R - c2.R)){
            System.out.println("(C1) and (C2) are tangent internally to each other.");
        }
        else if(ans < Math.abs(this.R - c2.R) && ans < this.R + c2.R){
            System.out.println("(C1) and (C2) intersect at two distinct points.");
        }
    }
}
