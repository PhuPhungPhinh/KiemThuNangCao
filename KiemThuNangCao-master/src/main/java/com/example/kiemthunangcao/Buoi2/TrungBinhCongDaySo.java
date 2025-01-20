package com.example.kiemthunangcao.Buoi2;

import java.util.List;

public class TrungBinhCongDaySo {
    public double trungBinhCong(List<Integer> number){
        if(number==null||number.isEmpty()){
            throw new ArithmeticException("Danh sach khong duoc trong");
        }
        return number.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}
