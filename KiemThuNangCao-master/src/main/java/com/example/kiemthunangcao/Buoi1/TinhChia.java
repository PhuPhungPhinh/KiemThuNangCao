package com.example.kiemthunangcao.Buoi1;

public class TinhChia {
    public int tinhThuong(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return a / b;
    }

}
