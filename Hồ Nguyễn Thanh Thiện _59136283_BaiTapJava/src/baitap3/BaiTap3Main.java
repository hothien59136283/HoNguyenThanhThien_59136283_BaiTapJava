/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author Pii
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienPoly Svpoly = new SinhVienIT(8, 7, 6,"Hồ Nguyễn Thanh Thiện");
        SinhVienIT Svit = new SinhVienIT(5, 10, 7, "Hoàng Vũ Thống");
        SinhVienBiz Svbiz = new SinhVienBiz(9, 9.3, "Nguyễn Hồ Tiến");
        Svpoly.xuat();
        Svit.xuat();
        Svbiz.xuat();
    }
    
}
