package com.midterm.pmq;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        QLBaoCao ql = new QLBaoCao();
        BaoCao b1 = new BaoCao("Lap trinh giao dien","link1","12/05/2023","Quang","Trang",9.0);
        ArrayList<ThanhVien> tv = new ArrayList<>();
        tv.add(new ThanhVien("A","B","C","Chu tich"));
        BaoCao b2 = new KhoaLuan("OOP","link2","12/05/2024","Quang","Thanh",8.5,0.2,"linkDG",tv);
        BaoCao b3 = new ThucTapTotNghiep("Toan roi rac","link3","12/04/2023","Quang","Hung",10.0,"linkDG");
        BaoCao b4 = new ThucTapTotNghiep("Toan roi rac","link3","12/04/2003","Tuan","Hung",1.5,"linkDG");
        ql.themBaoCao(b1,b2,b3,b4);
        ql.sapXep();
        ql.getListBC().forEach(s -> s.HienThi());
    }
}