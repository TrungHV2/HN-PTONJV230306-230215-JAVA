package com.ra.strings;

public class Program {
    public static void main(String[] args) {

        //#region Mảng danh sách sinh viên
        String[] names = {
                "Nguyễn Văn Đức",
                "Nguyễn Hiếu Nghĩa",
                "Nguyễn Thị Hải Lộc",
                "Huỳnh Bá Trường Mỹ",
                "Lê Bá Doanh",
                "Lưu Vĩnh Thắng",
                "Nguyễn Thảo Hương",
                "Phạm Văn Thịnh",
                "Trần Văn Phú",
                "Nguyễn Thị Lan Hương",
                "Lê Công Thuỷ",
                "Ngô Quốc Việt",
                "Trần Văn Tâm",
                "Lương Hữu Kiên",
                "Nguyễn Bảo Ngọc",
                "Nguyễn Đình Xuân",
                "Nguyễn Văn Thuận",
                "Thái Hoài Thanh",
                "Huỳnh Kiến Luân",
                "Trần Quốc Khang Hy",
                "Đỗ công Quyết",
                "Lê Tài Hoàng",
                "Đỗ Thị Huyền",
                "Trần Thanh Duy",
                "Vũ Tuấn Quang",
                "Phạm Minh Long",
        };
        //#endregion

//        searchByFullName(names, "Trần Văn Phú");
//        searchByFirstName(names, "Nguyễn");
//        searchByLastName(names, "Hương");
//        searchByContainsName(names, "Th");
        // TH1

        String str1 = "ABC";
        String str2 = "ABC";
        String str = str1 + str2;
        // TH 2
        String str3 = new String("XYZ");
        String str4 = new String("XYZ");
        System.out.println(str1 == str2);
        System.out.println(str3 == str4);

        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str4));


        StringBuilder stringBuilder = new StringBuilder("ABC");
        stringBuilder.append("XYZ");
        System.out.println(stringBuilder.toString());



    }
    //equals()
    public static void searchByFullName(String[] names, String fullName) {
        System.out.println("Tìm tuyệt đối equals()");
        for (String name: names) {
            if (name.equals(fullName))
                System.out.println(name);
        }
    }
    //startsWith()
    public static void searchByFirstName(String[] names, String firstName) {
        System.out.println("Tìm theo họ startsWith()");
        for (String name : names)
            if (name.startsWith(firstName))
                System.out.println(name);
    }
    //endsWith()
    public static void searchByLastName(String[] names, String lastName) {
        System.out.println("Tìm theo tên endsWith()");
        for (String name : names)
            if (name.endsWith(lastName))
                System.out.println(name);
    }
    //contains()
    public static void searchByContainsName(String[] names, String key) {
        System.out.println("Tìm tương đối contains()");
        for (String name : names)
            if (name.contains(key))
                System.out.println(name);
    }
}
