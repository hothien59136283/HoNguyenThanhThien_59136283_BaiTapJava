/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author Pii
 */
public class XeNoiThanh extends ChuyenXe{
    private String soTuyen;
    private double soKm;
    public XeNoiThanh(){
    }

    public XeNoiThanh(String soTuyen, double soKm, String mschuyen, String hotenTX, String soxe, double doanhthu) {
        super(mschuyen, hotenTX, soxe, doanhthu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    @Override
    public void xuat() {
        super.xuat(); 
       System.out.println("Số tuyến:"+soTuyen+"\n"+"Số km:"+soKm+"\n");
    }
}

   
 
