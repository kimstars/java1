package com.company;

public class KhachHang {
    public int maKhachHang;
    public String hoTen;
    public int giamGia;

    public KhachHang(int maKhachHang, String hoTen, int giamGia){
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.giamGia = giamGia;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

    public int getGiamGia() {
        return giamGia;
    }

}
