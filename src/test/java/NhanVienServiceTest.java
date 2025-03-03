import com.example.PH52194_03_03_2025.Model.NhanVien;
import com.example.PH52194_03_03_2025.Service.NhanVienService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NhanVienServiceTest {
    private NhanVienService nhanVienService;

    @BeforeEach
    void setUp() {
        nhanVienService = new NhanVienService();
    }

    @Test
    void testSuaNhanVien_HopLe() {
        NhanVien nhanVien = new NhanVien("NV01", "An", 20, 8.5f, 3, "CNTT");
        NhanVien nhanVienMoi = nhanVienService.suaNhanVien(nhanVien, "Bình", 21, 9.0f, 4, "Marketing");

        assertEquals("Bình", nhanVienMoi.getTenNV());
        assertEquals(21, nhanVienMoi.getTuoiNV());
        assertEquals(9.0f, nhanVienMoi.getSoLuong(), 0.01);
        assertEquals(4, nhanVienMoi.getSoNamLamViec());
        assertEquals("Marketing", nhanVienMoi.getPhongBan());
    }

    @Test
    void testSuaNhanVien_TruongRong() {
        NhanVien nhanVien = new NhanVien("NV02", "An", 19, 7.5f, 2, "CNTT");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.suaNhanVien(nhanVien, "", 20, 8.0f, 3, "");
        });
        assertEquals("Ten va phong ban khong dc de trong", exception.getMessage());
    }

    @Test
    void testSuaNhanVien_TuoiKhongHopLe() {
        NhanVien nhanVien = new NhanVien("NV01", "An", 21, 8.5f, 3, "CNTT");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.suaNhanVien(nhanVien, "Bình", 57, 8.0f, 3, "Marketing");
        });
        assertEquals("Tuoi khong hop le", exception.getMessage());
    }

    @Test
    void testSuaNhanVien_SoNamLamViecAm() {
        NhanVien nhanVien = new NhanVien("NV05", "Tùng", 26, 7.5f, 4, "Công Nghệ");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.suaNhanVien(nhanVien, "Tùng", 26, 7.5f, -2, "Công Nghệ");
        });

        assertEquals("Số năm làm việc không hợp lệ", exception.getMessage());
    }
    @Test
    void testSuaNhanVien_KhongThayDoiThongTin() {
        NhanVien nhanVien = new NhanVien("NV07", "Mai", 24, 7.0f, 3, "Kinh Doanh");

        NhanVien nhanVienMoi = nhanVienService.suaNhanVien(nhanVien, "Mai", 24, 7.0f, 3, "Kinh Doanh");

        assertEquals(nhanVien.getTenNV(), nhanVienMoi.getTenNV());
        assertEquals(nhanVien.getTuoiNV(), nhanVienMoi.getTuoiNV());
        assertEquals(nhanVien.getSoLuong(), nhanVienMoi.getSoLuong(), 0.01);
        assertEquals(nhanVien.getSoNamLamViec(), nhanVienMoi.getSoNamLamViec());
        assertEquals(nhanVien.getPhongBan(), nhanVienMoi.getPhongBan());
    }
}
