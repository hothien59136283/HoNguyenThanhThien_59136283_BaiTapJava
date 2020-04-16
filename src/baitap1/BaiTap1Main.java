/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Pii
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
        NhanVien nhanVien1 = new NhanVien("Hồ Nguyễn Thanh", 21, "Ninh Thập", 2500000, 300);
        NhanVien nhanVien2 = new NhanVien("Nguyễn Vũ Tú", 23, "Nha Trang", 1500000, 110);
        System.out.println(nhanVien1.getThongTin()+"Tiền Thưởng:"+nhanVien1.tinhThuong());
        System.out.println(nhanVien2.getThongTin()+"Tiền Thưởng:"+nhanVien2.tinhThuong());
    }
    }
    
}
