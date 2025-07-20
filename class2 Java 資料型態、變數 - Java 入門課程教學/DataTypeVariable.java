public class DataTypeVariable {
    public static void main(String[] args) {
        // 在終端機印出各種資料型態的資料

        // 整數型態，預設 int 型態
        System.out.println(3);
        System.out.println(120);

        // 長整數型態 常整數數翅的後面加上L 否則會說太大 不能印出的錯誤
        System.out.println(1234567890123L);

        // 浮點數型態，預設 double 型態，可印出零下8位數
        System.out.println(3.14159268);

        // 單精度浮點數型態，可印出零下7位數，後面加上 F 或 f 
        System.out.println(3.14159268f);
        
        // 布林型態
        System.out.println(true);

        // 字元型態，使用單引號括起來
        System.out.println('A');
        /*System.out.println('AB'); 這行會報錯，因為字元型態只能包含一個字符*/

        // 字串型態，使用雙引號括起來
        System.out.println("Hello, World!");


        // 變數型態的宣告與使用
        // 資料形態要對應
        // 如果資料型態不對應，會報錯
        // int number = "123"; // 這行會報錯，因為 int 型態不能直接賦值字串
        
        // 整數型態
        int age = 25;
        System.out.println("年齡: " + age);

        // 浮點數型態
        double height = 1.75;
        System.out.println("身高: " + height);

        // 印出小數點以下9位數
        height = 1.750000000;
        // 使用 printf 格式化輸出
        // %.9f 表示小數點後保留9位數
        System.out.printf("身高: %.9f\n", height);

        // 字串型態
        String name = "John";
        System.out.println("姓名: " + name);

        
    }
}