/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author ltpnt
 */
public class ChuyenXe {
    private String mschuyen;
    private String hotenTX;
    private String soxe;
    private double doanhthu;
    public ChuyenXe(){
    }
    public ChuyenXe(String mschuyen, String hotenTX, String soxe, double doanhthu) {
        this.mschuyen = mschuyen;
        this.hotenTX = hotenTX;
        this.soxe = soxe;
        this.doanhthu = doanhthu;
    }

    public double getdoanhthu() {
        return doanhthu;
    }

    public void setdoanhthu(double doanhthu) {
        this.doanhthu = doanhthu;
    }
    public void xuat() {
        System.out.println("Mã số chuyến:"+mschuyen+"\n"+"Họ tên tài xế:"+hotenTX
                            +"\n"+"Số xe:"+soxe+"\n"+"Doanh thu:"+doanhthu);
    }
}