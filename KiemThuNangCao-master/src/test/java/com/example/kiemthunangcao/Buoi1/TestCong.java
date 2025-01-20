package com.example.kiemthunangcao.Buoi1;

import com.example.kiemthunangcao.Buoi1.TinhTong;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCong {
    private final TinhTong tinhTong = new TinhTong();

    @Test
    public void tinhTong1() {
        assertEquals(15, tinhTong.tinhTong(5, 10));
    }

    @Test
    public void tinhTong2() {
        assertEquals(14, tinhTong.tinhTong(4, 10));
    }

    @Test
    public void tinhTong3() {
        assertEquals(16, tinhTong.tinhTong(6, 10));
    }

    @Test
    public void tinhTong4() {
        assertEquals(19, tinhTong.tinhTong(9, 10));
    }

    @Test
    public void tinhTong5() {
        assertEquals(20, tinhTong.tinhTong(10, 10));
    }
}
