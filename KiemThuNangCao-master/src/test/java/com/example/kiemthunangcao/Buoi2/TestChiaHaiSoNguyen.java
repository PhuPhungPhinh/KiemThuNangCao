package com.example.kiemthunangcao.Buoi2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestChiaHaiSoNguyen {
    @Test
    public void testChia(){
        ChiaHaiSoNguyen validate = new ChiaHaiSoNguyen();
        assertEquals(5,validate.chiaSoNguyen(10,2));
        assertEquals(-5,validate.chiaSoNguyen(-10,2));
        assertEquals(0,validate.chiaSoNguyen(0,10));
        assertEquals(123,validate.chiaSoNguyen(123,1));
        assertEquals(-123,validate.chiaSoNguyen(123,-1));
        assertEquals(5,validate.chiaSoNguyen(-10,-2));
        assertThrows(ArithmeticException.class,() -> validate.chiaSoNguyen(10,0));
        assertEquals(1,validate.chiaSoNguyen(Integer.MAX_VALUE, Integer.MAX_VALUE));
        assertEquals(1,validate.chiaSoNguyen(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
}
