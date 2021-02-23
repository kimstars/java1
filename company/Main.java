package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        KhachHang khach = new KhachHang(001, "Chu Tuấn Kiệt", 20);
        Hoadon bill = new Hoadon(001, khach, 1000);
        bill.tinhtien();
    }
}
