public class LoopStatement {
    public static void main(String[] args) {
        // 使用 for 迴圈打印 1 到 10 的數字，並使用 continue 跳過偶數
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // 跳過偶數
            }
            System.out.println("奇數: " + i);
        }

        // 使用 while 迴圈打印 1 到 10 的數字，並使用 break 在遇到 5 時停止
        int j = 1;
        while (j <= 10) {
            if (j == 5) {
                break; // 當 j 等於 5 時跳出迴圈
            }
            System.out.println("數字: " + j);
            j++;
        }
    }
}