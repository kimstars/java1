package com.company;

public class Hoadon {
    public int maHoaDon;
    public KhachHang khachHang;
    public int tienTra;

    public Hoadon(int maHoaDon, KhachHang khachHang, int tienTra){
        this.maHoaDon = maHoaDon;
        this.khachHang = khachHang;
        this.tienTra = tienTra;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public String hoTen(){
        return khachHang.getHoTen();
    }

    public void setTienTra(int tienTra) {
        this.tienTra = tienTra;
    }

    public void tinhtien(){
        System.out.println("Mã hóa đơn : "+ maHoaDon +". Khách hàng : " + this.hoTen() + "\nSố tiền sau khi áp dụng giảm giá : "+ (tienTra - tienTra*khachHang.getGiamGia()/100));
    }
}
