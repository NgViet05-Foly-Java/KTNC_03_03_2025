package com.example.PH52194_03_03_2025;

public class TinhTongSoChan {
    public int tinhTongSoChan() {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0 && i % 8 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
