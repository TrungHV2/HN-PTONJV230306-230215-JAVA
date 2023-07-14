package com.rikkei.academy.exercise;

public class Ex2 {
    public static void main(String[] args) {
        /**
         * Tạo class Person (fullName, gender, address). Tạo các phương thức get/set và constructor
         * khởi tạo với các thuộc tính của Person. Tạo phương thức input() để nhập các thông tin cho Person.
         * Ghi đè phương thức toString() để hiển thị thông tin của đối tượng Person.
         *
         * Class Student kế thừa từ class Person. Có thêm thuộc tính schoolName, ghi đè lại phương thước toString
         * để hiển thị thêm thông tin schoolName. Ghi đè phương thức input() để bổ sung thêm thông tin nhập
         *
         * Class Employee kế thừa từ class Person. Có thêm thuộc tính companyName, ghi đè lại phương thức toString()
         * để hiển thị thêm thông tin companyName. Ghi đè phương thức input() để bổ sung thêm thông tin nhập
         *
         * Tạo class Bus có các trường
         *  int currentSize; //số hành khách hiện tại trên xe
         *  Person[] customers; //mảng chứa các hành khách trên xe
         *  String busNo; // Số xe bus
         * Tạo các phương thức getter/setter cho các trường.
         * Tạo 1 constructor Bus(int size): để khởi tạo đối tượng Bus với size là số phần tử của mảng customers tương
         * ứng số hành khách tối đa trên xe.
         * Đĩnh nghĩa các phương thức sau:
         *  - report() để đếm số lượng Student và Employee trên xe
         *  - push(Person p): để thêm hành khách lên xe. Nếu vẫn có thể thêm hành khách lên xe thì trả về
         *  true, ngược lại trả về false.
         *  - searchBySchool(String schoolName): để tìm kiếm các sinh viên cùng trường
         *  - searchByCompany(String companyName): để tìm kiếm các nhân viên làm cùng cty
         *
         *  Viết chương trình Java thực hiện các chức năng:
         *      1. Khởi tạo chuyến xe với số lượng nhập vào từ bàn phím
         *      2. Thêm hành khách lên xe (có thể lựa chọn thêm Student hoặc Employee)
         *      3. Thống kê số hành khách đang có trên xe (tổng số hành khách hiện có? bn student? bn employee?)
         *      4. Tìm kiếm các hành khách là employee làm cùng cty
         *      5. Tìm kiếm các hành khách là student học cùng trường
         *      6. Hiển thị thông tin các hành khách trên xe
         *      7. Thoát (dừng chuyến xe)
         * */
    }
}
