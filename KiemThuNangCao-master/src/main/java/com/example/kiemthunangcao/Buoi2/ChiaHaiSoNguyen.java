package com.example.kiemthunangcao.Buoi2;

public class ChiaHaiSoNguyen {
    public int chiaSoNguyen(int a, int b){
        if (b==0){
            throw new ArithmeticException("Khong the chia cho 0");
        }
        return a/b;
    }
}
