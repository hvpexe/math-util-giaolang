/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvpexe.mathutil.core;

/**
 *
 * @author super
 */
public class MathUtil {

    //trong class này cung cấp cho ai đó nhiều hàm xử lí toán học
    //clone class Math của JDK
    //hàm thư viện xài chung cho ai đó, ko cần lưu lại trạng thái/giá trị
    //chọn thiết kế là hàm static
    //hàm tính giai thừa!!!
    //n! = 1.2.3.4.5...n
    //ko có giai thừa âm
    //0! = 1! = 1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    //20 giai thừa 18 số 0, vừa kịp đủ cho kiểu long của java
    //21 giai thừa tràn kiểu long
    //bài này quy ước tính n! trong khoảng từ 0..20
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        long product = 1;
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//        return product;
//    }
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        if (n == 0 || n == 1) 
            return 1; //Kết thúc cuộc chơi sớm nếu nhận những đầu vào đặt biệt
        return n * getFactorial(n-1); //công thức đệ quy
    }
    
}
