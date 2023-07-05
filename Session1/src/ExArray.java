public class ExArray {
    public static void main(String[] args) {
        // Khai báo mảng đa chiều
        int[][] numbers = new int[3][];
        // Gán giá trị
        numbers[0] = new int[] {1,2,3};
        numbers[1] = new int[] {4,5,6};
        numbers[2] = new int[] {7,8,9};
        // Duyệt mảng
        for (int[] row : numbers) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
