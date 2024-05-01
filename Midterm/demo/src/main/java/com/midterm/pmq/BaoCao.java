package com.midterm.pmq;

import java.time.LocalDate;

public class BaoCao {
    private static int dem;
    private int maBaoCao = dem++;
    private String tenBaoCao;
    private String link;
    private LocalDate date;
    private String studentName;
    private String giangVien;
    private double diem;

    /**
     * @return the maBaoCao
     */
    public int getMaBaoCao() {
        return maBaoCao;
    }

    /**
     * @param maBaoCao the maBaoCao to set
     */
    public void setMaBaoCao(int maBaoCao) {
        this.maBaoCao = maBaoCao;
    }

    /**
     * @return the tenBaoCao
     */
    public String getTenBaoCao() {
        return tenBaoCao;
    }

    /**
     * @param tenBaoCao the tenBaoCao to set
     */
    public void setTenBaoCao(String tenBaoCao) {
        this.tenBaoCao = tenBaoCao;
    }

    /**
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link the link to set
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the giangVien
     */
    public String getGiangVien() {
        return giangVien;
    }

    /**
     * @param giangVien the giangVien to set
     */
    public void setGiangVien(String giangVien) {
        this.giangVien = giangVien;
    }

    /**
     * @return the diem
     */
    public double getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    public BaoCao(){}
    
    public BaoCao(String tenBaoCao,String link,String date,String studentName,String gvName,double Diem){
        this.tenBaoCao = tenBaoCao;
        this.link = link;
        this.date = LocalDate.parse(date,config.FORMATTER);
        this.studentName = studentName;
        this.giangVien = gvName;
        this.diem = Diem;
    }

    public void HienThi(){
        System.out.printf("Ma khoa luan : %s\nTen khoa luan : %s\nGiang vien huong dan : %s\n",this.getMaBaoCao(),this.getTenBaoCao(),this.getGiangVien());
    }  
    
    public int compareTo(BaoCao b2){
        int compare = Integer.compare(b2.getDate().getYear(),this.date.getYear());
        if(compare != 0){
            return compare;
        }
        return Double.compare(this.diem,b2.getDiem());
    }
}
