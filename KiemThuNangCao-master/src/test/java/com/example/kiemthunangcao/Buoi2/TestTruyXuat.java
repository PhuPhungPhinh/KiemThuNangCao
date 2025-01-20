package com.example.kiemthunangcao.Buoi2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestTruyXuat {
    @Test
    public void testGetElementAtIndex() {
        TruyXuat arrayElement = new TruyXuat();
        int[] array = {10, 20, 30, 40, 50};
        assertEquals(30, arrayElement.getElementAtIndex(array, 2));
        assertEquals(10, arrayElement.getElementAtIndex(array, 0));
        assertThrows(IndexOutOfBoundsException.class, () -> arrayElement.getElementAtIndex(array, -1));
        assertThrows(IndexOutOfBoundsException.class, () -> arrayElement.getElementAtIndex(array, 5));
    }
}
