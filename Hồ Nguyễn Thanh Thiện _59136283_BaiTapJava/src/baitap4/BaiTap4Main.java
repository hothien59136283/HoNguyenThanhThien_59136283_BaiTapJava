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
public class BaiTap4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Khởi tạo
        ChuyenXe chuyenxe1 = new XeNoiThanh("001", 90, "001", "Hồ Nguyễn Thanh Thiện", "79-Z1011.10", 7800000);
        ChuyenXe chuyenxe2 = new XeNoiThanh("002", 140, "002", "Nguyễn Hồ Tiến", "56-A2102.34", 5600000);
        ChuyenXe chuyenxe3 = new XeNoiThanh("003", 300, "003", "Nguyễn Tấn Vinh Tiến", "72-C2192.56", 82000000);
        ChuyenXe chuyenxe4 = new XeNgoaiThanh("Hà Nội", 3, "004", "Hồ Lê Thiện", "TH1010", 4900000);
        ChuyenXe chuyenxe5 = new XeNgoaiThanh("Nha Trang", 4, "005", "Ngô Quang Hoàng", "TH33333", 9900000);
        ChuyenXe chuyenxe6 = new XeNgoaiThanh("Phú Yên", 1, "006", "", "Ngô Quốc Tú", 8550000);
        
        // Thêm vào DS
        QuanLyChuyenXe qlchuyenxe = new QuanLyChuyenXe();
        qlchuyenxe.themChuyenXe(chuyenxe1);
        qlchuyenxe.themChuyenXe(chuyenxe2);
        qlchuyenxe.themChuyenXe(chuyenxe3);
        qlchuyenxe.themChuyenXe(chuyenxe4);
        qlchuyenxe.themChuyenXe(chuyenxe5);
        qlchuyenxe.themChuyenXe(chuyenxe6);
        
        // Xuất DS
        qlchuyenxe.xuatDS();
        
        // Tính Doanh thu
        System.out.println("Tổng doanh thu xe ngoại thành: "+qlchuyenxe.tinhDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu xe nội thành: "+qlchuyenxe.tinhDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu cả 2 loại xe: "+(qlchuyenxe.tinhDoanhThuNoiThanh()+qlchuyenxe.tinhDoanhThuNgoaiThanh()));
    }
    
}