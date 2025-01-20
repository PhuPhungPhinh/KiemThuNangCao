package com.example.kiemthunangcao.Buoi2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class TestTrungBinhCong {
    @Test
    public void testCalculateAverage() {
        TrungBinhCongDaySo validate = new TrungBinhCongDaySo();
        assertEquals(3.0, validate.trungBinhCong(List.of(1, 2, 3, 4, 5)), 0.001);
        assertEquals(-2.5, validate.trungBinhCong(List.of(-3, -2, -4, -1)), 0.001);
        assertThrows(ArithmeticException.class, () -> validate.trungBinhCong(List.of()));
    }
}
