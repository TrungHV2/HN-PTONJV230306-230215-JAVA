package com.rikkei.academy.exercise;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        /**
         * Tạo lớp Student gồm các thông tin:
         *      id(String),
         *      firstName(String)
         *      lastName(String)
         *      markJS(double)
         *      markHTML(double)
         *      markCSS(double)
         *      markAvg(double)
         *      rank(String)
         *  Tạo các phương thức get, set cho các thuộc tính, thuộc tính markAvg, rank sẽ chỉ
         *  có phương thức get.
         *  Khai báo constructor không tham số và có tham số (trừ markAvg, rank) để khởi tạo
         *  đối tượng.
         *  Định nghĩa phương thức input() để nhập thông tin sinh viên và output() để hiển thị
         *  thông tin sinh viên.
         *  Định nghĩa phương phức calculatorMarkAvg() tính điểm trung các môn (markAvg) và
         *  xác định xếp loại (rank) (
         *      markAvg <= 5 => rank=TRUNG BÌNH,
         *      5 < markAvg < 8 => rank=KHÁ,
         *      markAvg >= 8 => rank=GIỎI
         *  )
         *
         *
         *  Viết chương trình Java thực hiện các yêu cầu sau:
         *  1. Nhập thông tin n sinh viên
         *  2. Hiển thị danh sách sinh viên
         *  3. Tính điểm và xếp loại tất cả sinh viên
         *  4. Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần
         *  5. Tìm kiếm sinh viên theo tên (tìm tương đối)
         *  6. Thoát
         * */

        Book[] books = new Book[10];

        Arrays.sort(books, (b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()));

    }
}
