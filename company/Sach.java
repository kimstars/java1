package com.company;

public class Sach {
    private static int maSach;
    private static String ten;
    private static TacGia tacGia;
    private static int gia;
    private static int soTrang;


    public Sach(int maSach, String ten, TacGia tacGia, int gia, int soTrang){
        this.maSach = maSach;
        this.ten = ten;
        this.tacGia = tacGia;
        this.gia = gia;
        this.soTrang = soTrang;
    }

    public  void setMaSach(int maSach) {
        Sach.maSach = maSach;
    }

    public  int getMaSach() {
        return maSach;
    }

    public  void setTen(String ten) {
        Sach.ten = ten;
    }

    public  String getTen() {
        return ten;
    }

    public  void setTacGia(TacGia tacGia) {
        Sach.tacGia = tacGia;
    }

    public  TacGia getTacGia() {
        return tacGia;
    }

    public  void setGia(int gia) {
        Sach.gia = gia;
    }

    public  int getGia() {
        return gia;
    }

    public  void setSoTrang(int soTrang) {
        Sach.soTrang = soTrang;
    }

    public  int getSoTrang() {
        return soTrang;
    }

    @Override
    public String toString(){
        return "Mã sách : "+ this.maSach + ". Tên sách : '" + this.ten + "'. Số trang : " + this.soTrang + "\n"
                +"Thông tin tác giả : "+ tacGia.toString();
    }
}
