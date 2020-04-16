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
public class XeNgoaiThanh extends ChuyenXe{
    private String noiden;
    private int Songaydiduoc;
    public XeNgoaiThanh(){
    }

    public XeNgoaiThanh(String noiden, int Songaydiduoc, String mschuyen, String hotenTX, String soxe, double doanhthu) {
        super(mschuyen, hotenTX, soxe, doanhthu);
        this.noiden = noiden;
        this.Songaydiduoc = Songaydiduoc;
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
    }

}