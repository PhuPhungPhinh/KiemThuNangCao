package com.example.kiemthunangcao.Buoi1;

import com.example.kiemthunangcao.Buoi1.TinhHieu;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestHieu {
    private final TinhHieu tinhHieu = new TinhHieu();
    @Test
    public void testTinhHieu1() {
        assertEquals(0, tinhHieu.tinhHieu(0, 0));
    }

    @Test
    public void testTinhHieu2() {
        assertEquals(0, tinhHieu.tinhHieu(1000, 1000));
    }

    @Test
    public void testTinhHieu3() {
        assertEquals(-5, tinhHieu.tinhHieu(-10, -5));
    }

    @Test
    public void testTinhHieu4() {
        assertEquals(15, tinhHieu.tinhHieu(10, -5));
    }

    @Test
    public void testTinhHieu5() {
        assertEquals(5, tinhHieu.tinhHieu(10, 5));
    }

}
