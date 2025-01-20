package com.example.kiemthunangcao.Buoi2;

public class KiemTraSoNguyen {
    public boolean soNguyen(String input){
        try {
            Integer.parseInt(input);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
