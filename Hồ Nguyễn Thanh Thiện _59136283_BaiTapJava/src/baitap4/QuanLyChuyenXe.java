/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Pii
 */
public class QuanLyChuyenXe {
    List<ChuyenXe> danhsachChuyenXe = new ArrayList<>();
    void themChuyenXe(ChuyenXe chuyenXe) {
        
        danhsachChuyenXe.add(chuyenXe);
    }
    
    void xuatDS() {       
        for(ChuyenXe chuyenXe: danhsachChuyenXe) {
            chuyenXe.xuat();
        }
    }
    
    double tinhDoanhThuNoiThanh() {
        double tong = 0;
        for(ChuyenXe chuyenXe: danhsachChuyenXe) {
            if(chuyenXe instanceof XeNoiThanh) {
                tong = tong + chuyenXe.getdoanhthu();
            }
        }
        return tong;
    }
    
    double tinhDoanhThuNgoaiThanh() {
        double tong = 0;
        for(ChuyenXe chuyenXe: danhsachChuyenXe) {
            if(chuyenXe instanceof XeNgoaiThanh) {
                tong = tong + chuyenXe.getdoanhthu();
            }
        }
        return tong;
    }
}