/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midterm.pmq;

/**
 *
 * @author ADMIN
 */
public class ThanhVien {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the hocHam
     */
    public String getHocHam() {
        return hocHam;
    }

    /**
     * @param hocHam the hocHam to set
     */
    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    /**
     * @return the hocVi
     */
    public String getHocVi() {
        return hocVi;
    }

    /**
     * @param hocVi the hocVi to set
     */
    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    /**
     * @return the nhiemVu
     */
    public String getNhiemVu() {
        return nhiemVu;
    }

    /**
     * @param nhiemVu the nhiemVu to set
     */
    public void setNhiemVu(String nhiemVu) {
        this.nhiemVu = nhiemVu;
    }
    private String name;
    private String hocHam;
    private String hocVi; 
    private String nhiemVu;
    
    public ThanhVien(String name,String hocHam,String hocVi,String nhiemVu){
        this.name = name;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.nhiemVu = nhiemVu;
    }
}
