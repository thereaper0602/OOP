/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midterm.pmq;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author ADMIN
 */
public class KhoaLuan extends BaoCao{

    /**
     * @return the tiLeDaoVan
     */
    public double getTiLeDaoVan() {
        return tiLeDaoVan;
    }

    /**
     * @param tiLeDaoVan the tiLeDaoVan to set
     */
    public void setTiLeDaoVan(double tiLeDaoVan) {
        this.tiLeDaoVan = tiLeDaoVan;
    }

    /**
     * @return the linkDanhGia
     */
    public String getLinkDanhGia() {
        return linkDanhGia;
    }

    /**
     * @param linkDanhGia the linkDanhGia to set
     */
    public void setLinkDanhGia(String linkDanhGia) {
        this.linkDanhGia = linkDanhGia;
    }

    /**
     * @return the listThanhVien
     */
    public ArrayList<ThanhVien> getListThanhVien() {
        return listThanhVien;
    }

    /**
     * @param listThanhVien the listThanhVien to set
     */
    public void setListThanhVien(ArrayList<ThanhVien> listThanhVien) {
        this.listThanhVien = listThanhVien;
    }
    private double tiLeDaoVan;
    private String linkDanhGia;
    private ArrayList<ThanhVien> listThanhVien = new ArrayList<>();
    
    public KhoaLuan(String tenBaoCao,String link,String date,String studentName,String gvName,double Diem,double tiLeDaoVan,String linkDanhGia,ArrayList<ThanhVien> listTV){
        super(tenBaoCao,link,date,studentName,gvName,Diem);
        this.tiLeDaoVan = tiLeDaoVan;
        this.linkDanhGia = linkDanhGia;
        this.listThanhVien = listTV;
    }
    
    @Override
    public void HienThi(){
        super.HienThi();
        this.listThanhVien.forEach(s -> System.out.printf("Ten thanh vien : %s\nNhiem vu : %s\n",s.getName(),s.getNhiemVu()));
    }
    
}
