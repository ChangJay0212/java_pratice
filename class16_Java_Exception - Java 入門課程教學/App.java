public class App {

    public static void main(String[] args) {
        // 1. try-catch-finally 示範
        try {
            System.out.println("===== 測試 try-catch-finally ====");
            int[] numbers = {1, 2, 3};
            System.out.println("嘗試存取索引 5 的元素...");
            System.out.println(numbers[5]); // 這行會拋出 ArrayIndexOutOfBoundsException
            System.out.println("這行不會被執行");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 捕獲特定類型的例外
            System.err.println("發生錯誤：陣列索引超出範圍！");
            System.err.println("錯誤訊息: " + e.getMessage());
        } finally {
            // 無論是否發生例外，finally 區塊都會執行
            System.out.println("Finally 區塊：無論如何都會執行這裡的程式碼。");
        }

        System.out.println("\n----------------------------------------\n");

        // 2. throws 和 throw 示範
        try {
            System.out.println("===== 測試 throws 和 throw ====");
            System.out.println("嘗試檢查年齡: 25");
            checkAge(25);
            System.out.println("年齡合法，繼續執行。");

            System.out.println("\n嘗試檢查年齡: 15");
            checkAge(15); // 這行會拋出例外
            System.out.println("這行不會被執行");

        } catch (IllegalArgumentException e) {
            // 捕獲由 checkAge 方法拋出的例外
            System.err.println("發生錯誤：" + e.getMessage());
        }
    }

    /**
     * 檢查年齡是否大於 18 歲
     * @param age 年齡
     * @throws IllegalArgumentException 如果年齡小於 18，則拋出此例外
     */
    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            // 如果條件不符，主動拋出一個例外
            // throw 關鍵字用於拋出一個例外的實例
            throw new IllegalArgumentException("年齡必須滿 18 歲！");
        }
        // 如果年齡合法，則不會拋出例外
    }
}