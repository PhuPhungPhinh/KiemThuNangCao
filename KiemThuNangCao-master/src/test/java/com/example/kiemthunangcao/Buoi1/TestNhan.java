package com.example.kiemthunangcao.Buoi1;

import com.example.kiemthunangcao.Buoi1.TinhNhan;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestNhan {
    private final TinhNhan tinhNhan = new TinhNhan();
    @Test
    public void testTinhNhan1() {
        assertEquals(0, tinhNhan.tinhTich(0, 100));
    }

    @Test
    public void testTinhNhan2() {
        assertEquals(1000000, tinhNhan.tinhTich(1000, 1000));
    }

    @Test
    public void testTinhNhan3() {
        assertEquals(-20, tinhNhan.tinhTich(-4, 5));
    }

    @Test
    public void testTinhNhan4() {
        assertEquals(25, tinhNhan.tinhTich(-5, -5));
    }

    @Test
    public void testTinhNhan5() {
        assertEquals(50, tinhNhan.tinhTich(10, 5));
    }

}
