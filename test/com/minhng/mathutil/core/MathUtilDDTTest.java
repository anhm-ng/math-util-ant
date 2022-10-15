/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.minhng.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20, 25};
        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
        int c[][] = {{1, 0}, 
                     {1, 1}, 
                     {2, 2}, 
                     {6, 3}, 
                     {24, 4}, 
                     {120, 5}, 
                     {720, 6}};
        return new Integer[][] {{1, 0}, 
                                {1, 1}, 
                                {2, 2}, 
                                {6, 3}, 
                                {24, 4}, 
                                {120, 5}, 
                                {720, 6}};
        
    }
    
    //ta phải map 2 cột của từng dòng vào 2 dấu ? của hàm so sánh
    //Assert.assertEquals(???, MathUtil.getFactorial(???));
    //Assert.assertEquals(cột-0, MathUtil.getFactorial(cột-1));
    //map value của mảng vào 2 biến, nhồi 2 biến này vào hàm so sánh!!!
    
    @Parameterized.Parameter(value = 0)
    public long expected; //map vào cột-0
    @Parameterized.Parameter(value = 1)
    public int n; //map vào cột-1
    
    @Test //fi data và gọi hàm so sánh
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, MathUtil.getFactorial(n));
    }
    
    
}

//CLASS NÀY SẼ CHỨA CODE DÙNG ĐỂ TEST CODE CHÍNH Ở BÊN CLASS MATHUTIL
//CLASS NÀY SẼ CHỨA CODE DÙNG ĐỂ TEST HÀM getF() coi hàm chạy đúng kh
//Code viết ra dùng để test code khác (hàm kahcs/class khác)
//thì đoạn code này, class này đc gọi tên là: TEST SCRIPT
//Trong test script sẽ có những tình huống xài app, đưa data cụ thể vào
//chờ xem hàm xử lý kết quả có như kỳ vọng hay ko?
//Một Test Script sẽ chứa nhiều TEST CASES
//                          mỗi test case ứng với 1 tình huống xài hàm
//Phân tích Test Script cũ - hôm qua kia
//Trong Test Script cũ xuất hiện bad small, sự trùng lặp về câu lệnh dưới đây
//Assert.assertEquals(720, MathUtil.getFactorial(6));
//lệnh so sánh giá trị, lệnh gọi hàm đc lặp đi lặp lại một bộ test case

//DDT - Data Driven Testing
//Tách bộ data kiểm thử ra 1 chỗ
//Lát hồi nhồi/nạp/fill/điền//feed data này tuần tự vào chỗ kiểm thử
//Ví dụ tách data đã kiểm thử ở trên thành
//1      0
//1      1
//2      2
//6      3
//24     4
//120    5
//720    6
//Assert.assertEquals(720, MathUtil.getFactorial(6));
//thay vì lệnh so sánh gọi viết cho từng case, ta biến lệnh này
//trở thành tổng quát, ko điền data cụ thể, mà sẽ lấy từ đâu đó

//Assert.assertEquals(???, MathUtil.getFactorial(???));

//??? này sẽ lấy từ tập data ở trên!!!
//code gọn hơn, đẹp hơn, dễ bảo trì hơn, kiểm soát được đủ thiếu các case
//kĩ thuật tách code test ra khỏi data của nó lát hồi fill lại sau
//đc GỌI LÀ KĨ THUẬT VIẾT TEST CASE THEO KIỂU THAM SỐ HÓA PARAMETERIZED
//- BIẾN DATA RA 1 CHỖ, ĐẶT CHO CHÚNG CÁI TÊN BIẾN, LÁT HỒI NHỒI CHÚNG TRỞ LẠI LỆNH SO SÁNH
//HOẶC CÒN GỌI LÀ DDT - DATA DRIVEN TESTING - VIẾT CODE KIỂM THỬ THEO STYLE TÁCH DATA
//JUINT FW HỖ TRỢ SẴN TA VỤ TÁCH DATA, DUYỆT VÒNG FOR TRÊN DATA
//NHỒI VÀO HÀM TƯƠNG ỨNG
//ĐỂ CHƠI VỚI DDT, TA CẦN
//- Tách data ra 1 chỗ - MẢNG
//- Map cái data này vào các biến tương ứng
//- Nhồi các biến tương ứng này vào các câu lệnh so sánh/họi hàm