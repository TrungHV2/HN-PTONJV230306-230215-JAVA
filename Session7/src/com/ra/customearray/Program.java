package com.ra.customearray;

public class Program {
    public static void main(String[] args) {
        int minCapacity = 10;
        int[] oldArray = {1,2,3,4,5,6};
        int[] newArray = new int[oldArray.length + minCapacity];
        // Chuyển toàn bộ dữ liệu từ mảng cũ (oldArray) sang mảng mới (newArray) có thể chưa nhiều phần tử hơn mảng ban đầu
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);


        MyList list = new MyListImp();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("J");
        list.add("K");
        list.add("L");

        list.remove("E");
        System.out.println(list.contains("E"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
