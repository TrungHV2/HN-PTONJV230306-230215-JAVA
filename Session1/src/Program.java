public class Program {
    public static void main(String[] args) {
        System.out.println("Chào mừng các bạn đến với ngôn ngữ lập trình Java");
        // Khai báo biến
        int number;
        // Gán giá trị
        number = 555;
        int a = 5, b, c = 6;

        // Khai báo hằng số (giá trị bất biến trong chương trình)
        final String ID = "024095004451";

        char unicode = 'S';
        String str = "Hoàng Văn Trung";

        int numInt;
        byte numByte;
        short numShort;
        long numLong;

        float numFloat;
        double numDouble;

        System.out.println("Check");

        // Khai báo mảng
//        int[] numbers;
//        int numbers[];
        int []numbers;
        // Khởi tạo mảng
        numbers = new int[5];
        // gán giá trị cho mảng
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        // Duyệt mảng
        System.out.println("for-each");
        for (int item : numbers) {
            System.out.println(item);
        }
        // Duyệt với for thường
        System.out.println("for thường");
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
        // Khai váo và khởi tạo giá trị
//        String[] names = {"Khang", "Duy", "Tâm", "Hương", "Doanh"};
        String[] names = new String[]{"Khang", "Duy", "Tâm", "Hương", "Doanh"};
    }
}
