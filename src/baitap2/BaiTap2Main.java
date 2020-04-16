/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;
import baitap1.NhanVien;
/**
 *
 * @author Pii
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IQuanLy qlnv = new QuanLyNhanVien();
        NhanVien nhanVien1 = new NhanVien("Lê Thành Phương", 21, "Cam Ranh", 2000000, 20);
        NhanVien nhanVien2 = new NhanVien("Nguyễn Hoàng Anh Tiến", 21, "Ninh Thuận", 3800000, 150);
        NhanVien nhanVien3 = new NhanVien("Hồ Thanh Hoàng", 21, "Khánh Hòa", 3900000, 200);
        NhanVien nhanVien4 = new NhanVien("Nguyễn Hoàng Vinh", 21, "Khánh Hòa", 9500000, 195);
        NhanVien nhanVien5 = new NhanVien("Ngô Bá Khá", 25, "Nghệ An", 1900000, 190);
        qlnv.them(nhanVien1);
        qlnv.them(nhanVien2);
        qlnv.them(nhanVien3);
        qlnv.them(nhanVien4);
        qlnv.them(nhanVien5);
        qlnv.inDS();
    }
    
}
