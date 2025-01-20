package com.example.kiemthunangcao.Buoi2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSoNguyen {
    @Test
    public void testSoNguyen(){
        KiemTraSoNguyen validate = new KiemTraSoNguyen();
        assertTrue(validate.soNguyen("123"));
        assertTrue(validate.soNguyen("-456"));
        assertTrue(validate.soNguyen("0"));
        assertTrue(validate.soNguyen("12.34"));
        assertTrue(validate.soNguyen(""));
        assertTrue(validate.soNguyen(" "));
        assertTrue(validate.soNguyen("!@#$"));
        assertTrue(validate.soNguyen("0000123"));
        assertTrue(validate.soNguyen("abc"));
        assertTrue(validate.soNguyen(" 123 "));
    }
}
