public class Example1 {
    public static void main(String[] args) {
        int[] numbers = {1,4,7,2,5,1,9,3,5,23};
        for (int num : numbers) {
            if (num > 2) {
                boolean check = true;
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println(num);
                }
            } else if (num == 2) {
                System.out.println(num);
            }
        }
    }
}
