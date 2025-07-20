public class Loop {
    public static void main(String[] args) {
        // 使用 for 迴圈打印 1 到 10 的數字
        for (int i = 1; i <= 10; i++) {
            System.out.println("數字: " + i);
        }

        // 使用 while 迴圈打印 1 到 10 的數字
        int j = 1;
        while (j <= 10) {
            System.out.println("數字: " + j);
            j++;
        }

        // 使用 do-while 迴圈打印 1 到 10 的數字
        int k = 1;
        do {
            System.out.println("數字: " + k);
            k++;
        } while (k <= 10);
    }
}   