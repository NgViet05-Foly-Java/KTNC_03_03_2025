package com.example.PH52194_03_03_2025.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhanVien {
    private String maNV;
    private String tenNV;
    private Integer tuoiNV;
    private float soLuong;
    private Integer SoNamLamViec;
    private String phongBan;
}
