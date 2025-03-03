package com.example.PH52194_03_03_2025.Service;

import com.example.PH52194_03_03_2025.Model.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    private List<NhanVien> danhSachNhanVien = new ArrayList<>();

    public NhanVien suaNhanVien(NhanVien nhanVien, String tenMoi, int tuoiMoi,
                                float soLuongMoi, int soNamLamViecMoi, String phongBanMoi ){
        if(tenMoi.isEmpty() || phongBanMoi.isEmpty()){
            throw new IllegalArgumentException("Ten va phong ban khong dc de trong");
        } if (tuoiMoi<18 || tuoiMoi >56){
            throw new IllegalArgumentException("Tuoi khong hop le");
        }
        nhanVien.setTenNV(tenMoi);
        nhanVien.setTuoiNV(tuoiMoi);
        nhanVien.setSoLuong(soLuongMoi);
        nhanVien.setSoNamLamViec(soNamLamViecMoi);
        nhanVien.setPhongBan(phongBanMoi);
        return nhanVien;
    }
}
