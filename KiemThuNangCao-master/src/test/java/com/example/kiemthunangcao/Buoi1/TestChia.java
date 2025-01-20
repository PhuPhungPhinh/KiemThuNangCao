package com.example.kiemthunangcao.Buoi1;
import com.example.kiemthunangcao.Buoi1.TinhChia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestChia {
    private final TinhChia tinhChia = new TinhChia();
    @Test
    public void testTinhChia1() {

        assertEquals(0, tinhChia.tinhThuong(0, 5));
    }

    @Test
    public void testTinhChia2() {
        assertEquals(1, tinhChia.tinhThuong(1000, 1000));
    }

    @Test
    public void testTinhChia3() {
        assertEquals(-2, tinhChia.tinhThuong(-10, 5));
    }

    @Test
    public void testTinhChia4() {
        assertEquals(-3, tinhChia.tinhThuong(9, -3));
    }

    @Test
    public void testTinhChia5() {
        assertThrows(ArithmeticException.class, () -> tinhChia.tinhThuong(5, 0));
    }

}
