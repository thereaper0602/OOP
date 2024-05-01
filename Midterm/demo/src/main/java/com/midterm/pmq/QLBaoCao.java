/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midterm.pmq;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;
/**
 *
 * @author ADMIN
 */
public class QLBaoCao {

    /**
     * @return the listBC
     */
    public ArrayList<BaoCao> getListBC() {
        return listBC;
    }

    /**
     * @param listBC the listBC to set
     */
    public void setListBC(ArrayList<BaoCao> listBC) {
        this.listBC = listBC;
    }
    private ArrayList<BaoCao> listBC = new ArrayList<>();
    
    
    
    public void themBaoCao(BaoCao ...bc){
        this.getListBC().addAll(Arrays.asList(bc));
    }
    
    public void themBaoCao(String tenBaoCao,String link,String date,String studentName,String gvName,double Diem,double tiLeDaoVan,String linkDanhGia,ArrayList<ThanhVien> listTV){
        KhoaLuan k = new KhoaLuan(tenBaoCao,link,date,studentName,gvName,Diem,tiLeDaoVan,linkDanhGia,listTV);
        getListBC().add(k);
    }
    
    public void themBaoCao(String tenBaoCao,String link,String date,String studentName,String gvName,double Diem,String linkDG){
        ThucTapTotNghiep t = new ThucTapTotNghiep(tenBaoCao,link,date,studentName,gvName,Diem,linkDG);
        this.getListBC().add(t);
    }
    
    public void HienThi(){
        this.getListBC().stream().filter(s -> s instanceof KhoaLuan).collect(Collectors.toList()).forEach(s -> s.HienThi());
    }
    
    public void timKiem(){
        this.getListBC().stream().filter(s -> s instanceof ThucTapTotNghiep && s.getDiem() >= 9.0).collect(Collectors.toList()).forEach(s -> s.HienThi());
    }
    
    public void xoa(){
        this.getListBC().removeIf(s -> LocalDate.now().getYear() - s.getDate().getYear() >= 10);
    }
    
    public void sapXep(){
        this.listBC.sort((s1,s2) -> s1.compareTo(s2));
    }
}
