import com.example.PH52194_03_03_2025.TinhTongSoChan;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TinhTongSoChanTest {
    private TinhTongSoChan service = new TinhTongSoChan();

    @Test
    void testTongKhongChuaSoLe() {
        int sum = service.tinhTongSoChan();
        assertEquals(0, sum % 2, "Tổng phải là số chẵn");
    }

    @Test
    void testTongKhongChuaSoChiaHetCho8() {
        int sum = service.tinhTongSoChan();
        for (int i = 8; i <= 50; i += 8) {
            assertFalse(sum % i == 0, "Tổng không nên chứa số chia hết cho 8");
        }
    }

    @Test
    void testTongKhongAm() {
        assertTrue(service.tinhTongSoChan() >= 0, "Tổng không được âm");
    }

    @Test
    void testTongTrongKhoangHopLe() {
        assertTrue(service.tinhTongSoChan() <= 50 * 50, "Tổng không được vượt quá 50^2");
    }
}
