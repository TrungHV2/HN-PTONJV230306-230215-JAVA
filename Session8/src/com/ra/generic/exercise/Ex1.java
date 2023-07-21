package com.ra.generic.exercise;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        /**
         * Tạo class generic mô phỏng class ArrayList, có thể lưu trữ 1 tập hợp các giá trị
         * Có phương thức showList() để hiển thị các phần tử lưu trữ trong tập hợp
         * */

        MyList<String> data = new MyList<>();

        data.add("Việt");
        data.add("Tâm");
        data.add("Thanh");
        data.add("Hương");
        data.add("Đức");

        data.showList();
    }
}

class MyList<T> {
    private List<T> elements;
    private int size;

    public MyList() {
        this.elements = new ArrayList<>();
    }

    public void add(T item) {
        this.elements.add(item);
    }

    public void showList() {
        for (T item : elements) {
            System.out.println(item);
        }
    }
}
