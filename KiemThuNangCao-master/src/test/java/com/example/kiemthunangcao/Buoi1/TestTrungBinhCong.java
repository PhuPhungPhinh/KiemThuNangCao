package com.example.kiemthunangcao.Buoi1;

import com.example.kiemthunangcao.Buoi1.TinhTrungBinhCong;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTrungBinhCong {
    TinhTrungBinhCong tinhTrungBinhCong = new TinhTrungBinhCong();

    @Test
    public void testTinhTrungBinhCong1() {
        assertEquals(7.5, tinhTrungBinhCong.tinhTrungBinhCong(5, 10));
    }

    @Test
    public void testTinhTrungBinhCong2() {
        assertEquals(0, tinhTrungBinhCong.tinhTrungBinhCong(-10, 10));
    }

    @Test
    public void testTinhTrungBinhCong3() {
        assertEquals(50, tinhTrungBinhCong.tinhTrungBinhCong(50, 50));
    }

    @Test
    public void testTinhTrungBinhCong4() {
        assertEquals(-15, tinhTrungBinhCong.tinhTrungBinhCong(-10, -20));
    }

    @Test
    public void testTinhTrungBinhCong5() {
        assertEquals(0.5, tinhTrungBinhCong.tinhTrungBinhCong(0, 1));
    }
}
