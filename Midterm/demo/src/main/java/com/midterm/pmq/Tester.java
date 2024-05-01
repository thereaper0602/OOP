/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midterm.pmq;
/**
 *
 * @author ADMIN
 */
public class Tester {
    public static void main(String[] args){
        QLBaoCao ql = new QLBaoCao();
        BaoCao b1 = new BaoCao("Lap trinh giao dien","link1","12/05/2024","Quang","Trang",9.0);
        BaoCao b2 = new BaoCao("OOP","link2","12/05/2023","Quang","Thanh",8.5);
        BaoCao b3 = new BaoCao("ToanR roi rac","link3","12/04/2023","Quang","Hung",10.0);
        ql.themBaoCao(b1,b2,b3);
        ql.HienThi();
    }
}
