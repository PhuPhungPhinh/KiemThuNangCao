package com.example.kiemthunangcao.Buoi2;

public class TruyXuat {
    public int getElementAtIndex(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return array[index];
    }
}
