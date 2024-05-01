/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midterm.pmq;

/**
 *
 * @author ADMIN
 */
public class ThucTapTotNghiep extends BaoCao{

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
    private String linkDanhGia;
    
    public ThucTapTotNghiep(String tenBaoCao,String link,String date,String studentName,String gvName,double Diem,String linkDG){
        super(tenBaoCao,link,date,studentName,gvName,Diem);
        this.linkDanhGia = linkDG;
    }

    @Override
    public void HienThi() {
        super.HienThi();
        System.out.printf("Diem : %.2f\n",this.getDiem());
    }
    
}
